package com.zzw.java1000000.z1136785.reflect.Class;

import com.zzw.java1000000.z1136785.reflect.data.Child;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/**
 * @author zhengzewang on 2018/12/19.
 */
public class Reflection {

    public static void main(String[] args) {
        Class<Child> cls = Child.class;
        Child<String, Object> child = new Child<>();
        Class childCls = child.getClass();
        //
        Package pkg = cls.getPackage(); // 包
        String className = cls.getName(); // 类名
        Class superCls = cls.getSuperclass(); // 超类
        Class[] clss = cls.getInterfaces();// 接口
        TypeVariable<Class<Child>>[] typeVariables = cls.getTypeParameters(); // 类型参数，一般指泛型
        for (TypeVariable variable : typeVariables) {
            Annotation[] annotations = variable.getDeclaredAnnotations(); //
            System.out.println(variable.getName()); // 获取泛型名称 T、V
            System.out.println(variable.getTypeName());
            GenericDeclaration declaration = variable.getGenericDeclaration();
        }
        Annotation[] annotations = cls.getAnnotations();// 注解
        Type type = cls.getGenericSuperclass();// 获取泛超类
        cls.getTypeName();
    }

    @SuppressWarnings("unchecked")
    public static <T> T parseObject(String jsonString) {

        return (T) jsonString;

    }

}
