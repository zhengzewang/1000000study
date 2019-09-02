package com.zzw.java1000000.z1134170.annotation.document;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author zhengzewang on 2018/12/10.
 *
 * Documented 有点类似于生命周期，只不过生命周期的类型中不存在doc类型（当然，不存在才是合理的）
 *
 * 默认生成的javadoc的类和方法以及属性的注解是没有，除非这个注解被Documented注解
 *
 */
@Retention(RetentionPolicy.SOURCE)
@Documented
public @interface DocumentAnnotation {

    String value() default "zhangsan";
    String name() default "张三";

}
