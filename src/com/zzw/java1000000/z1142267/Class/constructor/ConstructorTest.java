package com.zzw.java1000000.z1142267.Class.constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author zhengzewang on 2019/3/24.
 */
public class ConstructorTest {

    public ConstructorTest() {

    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class cls = ConstructorTest.class;
        Constructor constructor = cls.getConstructor();
        //
        System.out.println(constructor.getName());
        //
        constructor.getDeclaringClass();
        //
        constructor.getParameters();
        constructor.getParameterTypes();
        constructor.getGenericParameterTypes();
        constructor.getParameterAnnotations();
        constructor.getAnnotatedParameterTypes();
        constructor.getParameterCount();
        constructor.isVarArgs();
        //
        constructor.getAnnotatedReturnType();
        //
        constructor.getAnnotations();
        constructor.getDeclaredAnnotations();
        constructor.getAnnotation(null);
        constructor.getDeclaredAnnotation(null);
        constructor.getAnnotationsByType(null);
        constructor.getDeclaredAnnotationsByType(null);
        constructor.isAnnotationPresent(null);
        //
        constructor.getExceptionTypes();
        constructor.getGenericExceptionTypes();
        constructor.getAnnotatedExceptionTypes();
        //
        constructor.getTypeParameters();
        //
        constructor.getAnnotatedReceiverType();
        //
        constructor.getModifiers();
        constructor.toString();
        constructor.toGenericString();
        //
        constructor.isSynthetic();
        //
        constructor.isAccessible();
        constructor.setAccessible(true);
        //
        constructor.newInstance();
        //
        constructor.hashCode();
        constructor.equals("");
    }

}
