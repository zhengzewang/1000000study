package com.zzw.java1000000.z1142267.Class.method;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/**
 * @author zhengzewang on 2019/3/12.
 */
public class ParameterAnnotationTest {

    private void test(@ParameterAnnotation String str) {

    }

    public static void main(String[] args) {
        Class cls = ParameterAnnotationTest.class;
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            AnnotatedType[] annotatedTypes = method.getAnnotatedParameterTypes();
            for (AnnotatedType annotatedType : annotatedTypes) {
                Annotation[] annotations = annotatedType.getAnnotations();
                Type type = annotatedType.getType();
                System.out.println(annotations.length);
            }
        }
    }

}
