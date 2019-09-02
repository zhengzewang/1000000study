
package com.zzw.java1000000.z1134170.annotation.target;

import java.lang.annotation.Annotation;
import java.lang.annotation.Target;

/**
 * @author zhengzewang on 2018/12/10.
 */
//@FieldAnnotation
public class TargetTest {

    @FieldAnnotation(name = "test")
    private String test;

//    @LocalVariable
    @FieldAnnotation(name = "test2")
    private static String test2;
    @FieldAnnotation(name = "test2")
    private static final String test3 = "test3";

    public static void main(String[] args) {
        @LocalVariableAnnotation
        String a = "a";
        //
        Class aClass = TargetTest.class;
        Package pkg = aClass.getPackage();
        Annotation[] annotations = pkg.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }
}
