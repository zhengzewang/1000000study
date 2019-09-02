package com.zzw.java1000000.z1136785.reflect.annotatedType;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author zhengzewang on 2019/1/7.
 * <p>
 * java 1.8之前获取type和注解的方法
 */
public class AnnotatedTypeOrigin<@TypeParameterAnnotation K extends Map<String, @TypeUseAnnotation List<String>[]>>
        extends @TypeUseAnnotation ArrayList<@TypeUseAnnotation String> {

    public void doit(@ParameterAnnotation String str, String str2) {

    }

    public static void main(String[] args) throws NoSuchMethodException {
        Class cls = AnnotatedTypeOrigin.class;
        Method method = cls.getMethod("doit", String.class, String.class);
        // 1.8之前
        Type[] types = method.getGenericParameterTypes();
        Annotation[][] annotations = method.getParameterAnnotations();
        // 1.8及之后
        AnnotatedType[] annotatedTypes = method.getAnnotatedParameterTypes();
        for (AnnotatedType annotatedType : annotatedTypes) {
            Annotation[] annotations1 = annotatedType.getAnnotations();
            System.out.println(annotations1.length);
        }
    }

}
