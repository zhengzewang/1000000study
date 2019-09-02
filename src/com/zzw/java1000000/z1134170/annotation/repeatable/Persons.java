package com.zzw.java1000000.z1134170.annotation.repeatable;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author zhengzewang on 2018/12/10.
 * <p>
 * 该注解只能Person注解用。
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Persons {

    Person[] value();

}
