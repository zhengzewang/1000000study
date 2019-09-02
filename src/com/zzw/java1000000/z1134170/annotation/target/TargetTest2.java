package com.zzw.java1000000.z1134170.annotation.target;

import com.zzw.java1000000.z1071365.Object.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.TypeVariable;
import java.util.Date;

/**
 * @author zhengzewang on 2018/12/18.
 */
@TypeAnnotation
@TypeUseAnnotation
public class TargetTest2<@TypeParameterAnnotation @TypeUseAnnotation T>
        extends @TypeUseAnnotation TargetTest
        implements @TypeUseAnnotation Test1<@TypeUseAnnotation String>,
        Test2<@TypeUseAnnotation T, @TypeUseAnnotation Date> {

    public <@TypeParameterAnnotation @TypeUseAnnotation T>
    @TypeUseAnnotation T test(@TypeUseAnnotation Test1<@TypeUseAnnotation T> tTest1) {
        return null;
    }


    public static void main(String[] args) {
        TypeVariable<? extends Class<? extends TargetTest2>>[] typeVariables = TargetTest2.class.getTypeParameters();
        for (TypeVariable typeVariable : typeVariables) {
            Annotation[] annotations = typeVariable.getAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof TypeParameterAnnotation) {
                    System.out.println("TypeParameterAnnotation");
                }
                if (annotation instanceof TypeUseAnnotation) {
                    System.out.println("TypeUseAnnotation");
                }
            }
        }
    }

}
