package com.zzw.java1000000.z1134170.annotation.document;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author zhengzewang on 2018/12/10.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface NotDocumentAnnotation {

    String value() default "zhengzewang";
    String name() default "zzw";

}
