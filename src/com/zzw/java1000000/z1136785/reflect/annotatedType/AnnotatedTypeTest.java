package com.zzw.java1000000.z1136785.reflect.annotatedType;

import java.io.Serializable;
import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhengzewang on 2019/1/6.
 */
@TypeUseAnnotation
@TypeAnnotation
public class AnnotatedTypeTest<@TypeParameterAnnotation K extends @TypeUseAnnotation List<@TypeUseAnnotation ? extends @TypeUseAnnotation List<String>[]>>
        extends @TypeUseAnnotation ArrayList<@TypeUseAnnotation String[]> implements @TypeUseAnnotation Serializable {

    public void test(@ParameterAnnotation @TypeUseAnnotation String a) throws @TypeUseAnnotation TypeExpection, @TypeUseAnnotation IllegalArgumentException {
        throw new TypeExpection();
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Class cls = AnnotatedTypeTest.class;
        AnnotatedType[] annotatedTypes = cls.getAnnotatedInterfaces();
        for (AnnotatedType annotatedType : annotatedTypes) {
            decodeAnnotatedType(annotatedType);
        }
        //
        AnnotatedType annotatedType = cls.getAnnotatedSuperclass();
        System.out.println(annotatedType);
        //
        Method method = cls.getMethod("test",String.class);
        method.getAnnotatedReturnType();
        method.getAnnotatedExceptionTypes();
        method.getAnnotatedReceiverType();
        AnnotatedType[] annotatedTypess = method.getAnnotatedParameterTypes();
        System.out.println(annotatedTypess.length);
        //
    }

    public static void decodeAnnotatedType(AnnotatedType annotatedType) {
        if (annotatedType instanceof AnnotatedArrayType) {
            System.out.println(annotatedType.getType() + "：AnnotatedArrayType");
        } else if (annotatedType instanceof AnnotatedParameterizedType) {
            System.out.println(annotatedType.getType() + "：AnnotatedParameterizedType");
        } else if (annotatedType instanceof AnnotatedTypeVariable) {
            System.out.println(annotatedType.getType() + "：AnnotatedTypeVariable");
        } else if (annotatedType instanceof AnnotatedWildcardType) {
            System.out.println(annotatedType.getType() + "：AnnotatedWildcardType");
        } else {
            System.out.println(annotatedType.getType() + "：");
        }
    }

}
