package com.zzw.java1000000.z1165006.Enum;

import java.lang.reflect.Method;

/**
 * @author zhengzewang on 2019/3/28.
 */
public class ValuesTest {

    public static void main(String[] args) {
        Method[] methods = Subject.class.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.toGenericString() + ":" + method.isSynthetic());
        }
        //
        methods = ValuesTest.class.getDeclaredMethods();
        System.out.println(methods.length);
    }

}
