package com.zzw.java1000000.z1165603.generic.reflect;

import java.lang.reflect.*;

/**
 * @author zhengzewang on 2019/3/31.
 */
public abstract class Box<T> {

    public Class<T> getT() throws ClassNotFoundException {
        Class cls = this.getClass();
        Type type = cls.getGenericSuperclass();
        if (type instanceof ParameterizedType) {
            return getTClass(((ParameterizedType) type).getActualTypeArguments()[0]);
        }
        return null;
    }

    private Class<T> getTClass(Type type) throws ClassNotFoundException {
        if (type instanceof ParameterizedType) {
            return getTClass(((ParameterizedType) type).getRawType());
        } else if (type instanceof GenericArrayType) {
            Class cls = getTClass(((GenericArrayType) type).getGenericComponentType()); //
            if (cls == null) {
                return null;
            } else if (cls.isArray()) {
                return (Class<T>) Class.forName("[" + cls.getName());
            } else {
                return (Class<T>) Class.forName("[L" + cls.getName() + ";");
            }
        } else if (type instanceof WildcardType) {
            // 超类不支持通配符类型
            return null;
        } else if (type instanceof TypeVariable) {
            // 子类没有指定具体类型，依然使用泛型，获取泛型的超类。泛型超类至多有一个类，可以有多个接口。类必须在第一个。
            Type[] types = ((TypeVariable) type).getBounds();
            if (types.length == 0) {
                return null;
            }
            return getTClass(types[0]);
        } else if (type instanceof Class) {
            return (Class<T>) type;
        }
        return null;
    }

}
