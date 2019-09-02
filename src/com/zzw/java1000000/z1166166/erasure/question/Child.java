package com.zzw.java1000000.z1166166.erasure.question;

import java.lang.reflect.Method;

/**
 * @author zhengzewang on 2019/4/2.
 */
public class Child extends Parent<String> {
    @Override
    public void fun(String o) {

    }

    public static void main(String[] args) {
        Method[] methods = Child.class.getDeclaredMethods();
        for (Method method : methods) {
            if (method.getName().equals("main")) {
                continue;
            }
            System.out.println(method + "，是否编译器生成：" + method.isSynthetic() + "，是否桥接方法" + method.isBridge());
        }
    }
}

abstract class Parent<T> {

    public abstract void fun(T t);

}
