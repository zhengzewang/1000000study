package com.zzw.java1000000.z1134170.annotation.retention;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author zhengzewang on 2018/12/10.
 *
 * 会被编译加载到class文件中，但不会加载到jvm中
 *
 */
@Retention(RetentionPolicy.CLASS)
public @interface ClassAnnotation {
}
