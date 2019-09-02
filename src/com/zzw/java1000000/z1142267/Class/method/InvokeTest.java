package com.zzw.java1000000.z1142267.Class.method;

import java.lang.reflect.Method;

/**
 * @author zhengzewang on 2019/3/24.
 */
public class InvokeTest {

    public void test(String test) {
        System.out.println("invoke：" + test);
    }

    public static void main(String[] args) throws Exception {
        Method method = InvokeTest.class.getMethod("test", String.class);
        method.invoke(InvokeTest.class.newInstance(), "hello");
    }

}
