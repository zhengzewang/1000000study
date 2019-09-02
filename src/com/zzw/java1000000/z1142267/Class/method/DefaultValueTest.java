package com.zzw.java1000000.z1142267.Class.method;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

/**
 * @author zhengzewang on 2019/3/24.
 */
public class DefaultValueTest {
    public static void main(String[] args) throws NoSuchMethodException {
        Method[] methods = DefaultValueAnnotation.class.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + "：" + method.getDefaultValue());
        }
    }
}

@Retention(RetentionPolicy.RUNTIME)
@interface DefaultValueAnnotation {
    String value() default "hello";

    String name();
}
