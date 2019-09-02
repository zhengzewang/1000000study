package com.zzw.java1000000.z1134170.annotation.retention;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * @author zhengzewang on 2018/12/10.
 * <p>
 * 不会被加载到class文件中，可以仅用于开发人员标识用。或者是编译时需要的注解，比如lombok
 */
@Retention(RetentionPolicy.SOURCE)
public @interface SourceAnnotaion {
}
