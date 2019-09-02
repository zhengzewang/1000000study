package com.zzw.java1000000.z1142267.Class.method;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author zhengzewang on 2019/3/24.
 */
public interface DefaultTest {

    void test1();

    default void test2() {
        System.out.println("inter-test2");
    }

    static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class cls = DefaultTest.class;
        Class impl1 = Impl1.class;
        Class impl2 = Impl2.class;
        Method method = cls.getMethod("test2");
        System.out.println(method.isDefault());
        method.invoke(impl1.newInstance());
        method.invoke(impl2.newInstance());
        Method method1 = impl1.getMethod("test2");
        System.out.println(method1.isDefault());
        method1.invoke(impl1.newInstance());
        Method method2 = impl2.getMethod("test2");
        System.out.println(method2.isDefault());
        method2.invoke(impl2.newInstance());
    }

}

class Impl1 implements DefaultTest {

    @Override
    public void test1() {

    }
}


class Impl2 implements DefaultTest {

    @Override
    public void test1() {

    }
    @Override
    public void test2() {
        System.out.println("Impl2-test2");
    }
}