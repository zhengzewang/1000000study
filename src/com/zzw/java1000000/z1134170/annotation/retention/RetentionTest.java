package com.zzw.java1000000.z1134170.annotation.retention;

import java.lang.annotation.Annotation;

/**
 * @author zhengzewang on 2018/12/10.
 * <p>
 * 可以将 class文件反编译出来
 */
@SourceAnnotaion
@ClassAnnotation
@RuntimeAnnotation
@DefaultAnnotation
@AnnotatedRuntimeAnnotation
public class RetentionTest {

    public static void main(String[] args) {
        Class<RetentionTest> clz = RetentionTest.class;
        Annotation[] annotations = clz.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }

}
