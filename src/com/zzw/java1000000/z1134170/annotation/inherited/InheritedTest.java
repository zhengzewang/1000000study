package com.zzw.java1000000.z1134170.annotation.inherited;

import java.lang.annotation.Annotation;

/**
 * @author zhengzewang on 2018/12/10.
 */
public class InheritedTest {
    public static void main(String[] args) {
        Class parent = InheritedParent.class;
        Class child = InheritedChild.class;
        //
        Annotation[] parentAnnotations = parent.getAnnotations();
        Annotation[] childAnnotations = child.getAnnotations();
        System.out.println(parentAnnotations.length);
        System.out.println(childAnnotations.length);
        //
        System.out.println();
        //
        for (Annotation annotation : parentAnnotations) {
            System.out.println(annotation);
        }
        System.out.println();
        for (Annotation annotation : childAnnotations) {
            System.out.println(annotation);
        }
    }
}
