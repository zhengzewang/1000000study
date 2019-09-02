package com.zzw.java1000000.z1124409.exception.throwable;

public class ThrowableTest extends Throwable {

    class ErrorTest extends Error {
        ErrorTest(String message) {
            super(message);
        }
    }

    public void test()  {
        throw new Error("test");
    }

    public void test2() {
        try {
            test();
        } catch (Error e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new ThrowableTest().test2();
        new ThrowableTest().test();
    }

}
