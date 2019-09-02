package com.zzw.java1000000.z1120381.javafinal.function;

public class FunctionFinal {


    public void test() {
        System.out.println("this is a normal method");
    }

    /**
     * 无法被子类重写
     */
    public final void testFinal() {
        System.out.println("this is a final method");
    }

    public static final void testStaticFinal() {
        System.out.println("this is a static final method");
    }

    public static void testStatic() {
        System.out.println("this is a static method");
    }


}
