package com.zzw.java1000000.z1134170.annotation.parent;

import java.lang.annotation.Annotation;

/**
 * @author zhengzewang on 2019/1/1.
 */
@AnnotationChild
public class MainTest {

    public static void main(String[] args) {
        System.out.println(Annotation.class.isAssignableFrom(AnnotationChild.class));
        Class cls = MainTest.class;
        Annotation annotation = cls.getAnnotation(AnnotationChild.class);
        System.out.println(annotation instanceof Object);
        System.out.println(annotation instanceof Annotation);
        System.out.println(annotation instanceof AnnotationChild);
    }

}
