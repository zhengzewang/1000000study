package com.zzw.java1000000.z1136785.reflect.annotatedElement;

/**
 * @author zhengzewang on 2019/1/1.
 */
@InheritedAnnotation
@InheritedAnnotation2(value = "parent")
public class AnnotatedElementParentTest {

    @InheritedAnnotation
    public void doit() {
        System.out.println("parent");
    }

}
