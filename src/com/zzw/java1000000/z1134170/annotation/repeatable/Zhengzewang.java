package com.zzw.java1000000.z1134170.annotation.repeatable;

import java.lang.annotation.Annotation;

/**
 * @author zhengzewang on 2018/12/10.
 */
@Person({"程序员", "java"})
@Person("江西人")
@Person("上海工作")
public class Zhengzewang {

    public static void main(String[] args) {
        Annotation[] annotations = Zhengzewang.class.getAnnotations();
        System.out.println(annotations.length);
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }

}
