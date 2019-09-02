package com.zzw.java1000000.z1134170.annotation.repeatable;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author zhengzewang on 2018/12/10.
 */
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Persons.class)
public @interface Person {

    String[] value() default "person";

}
