package com.zzw.java1000000.z1165603.generic.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigInteger;

/**
 * @author zhengzewang on 2019/3/31.
 */
public class BoxTest {

    Box<String> stringBox;

    Box<BigInteger> dateBox(Box<Math> mathBox) {
        return null;
    }

    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException {
        Class cls = BoxTest.class;
        // field
        Field field = cls.getDeclaredField("stringBox");
        Type type = field.getGenericType();
        printParamClass(type);
        // method
        Method method = cls.getDeclaredMethod("dateBox", Box.class);
        for (Type t : method.getGenericParameterTypes()) {
            printParamClass(t);
        }
        printParamClass(method.getGenericReturnType());
    }

    private static void printParamClass(Type type) {
        if (type instanceof ParameterizedType) {
            System.out.println(((ParameterizedType) type).getActualTypeArguments()[0]);
        } else {
            // 对于复杂类型的可以参考Box#getT()方法
            System.out.println("null");
        }
    }

}
