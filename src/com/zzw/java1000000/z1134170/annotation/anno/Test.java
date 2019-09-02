package com.zzw.java1000000.z1134170.annotation.anno;

import com.zzw.java1000000.z1134170.annotation.target.TypeUseAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author zhengzewang on 2018/12/18.
 */
public class Test {

        private static int t = 2;

        @AnnotationTest(i = 5)
        private String test;
        //    @AnnotationTest(i = t) // error
        private String test2;
        //    @AnnotationTest(i = test()) // error
        private String test3;

        private static int test() {
            return 2;
        }

    public static void main(String[] args) {
        Field[] fields = Annotation1.class.getFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        //

    }

    public static void test(Annotation annotation) {
        Proxy.getInvocationHandler(annotation);
    }

}
