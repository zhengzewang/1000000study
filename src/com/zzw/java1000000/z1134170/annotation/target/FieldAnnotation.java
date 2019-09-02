package com.zzw.java1000000.z1134170.annotation.target;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author zhengzewang on 2018/12/10.
 * <p>
 * 定义一个用于field的注解
 */
@Target(ElementType.FIELD)
public @interface FieldAnnotation {

    /**
     * 注解的属性只有value才可以不指定变量名
     *
     * @return
     */
    String value() default "test";

    /**
     * 未设置默认值的使用时必须赋值
     *
     * @return
     */
    String name();

}
