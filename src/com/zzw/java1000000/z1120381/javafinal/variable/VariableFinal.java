package com.zzw.java1000000.z1120381.javafinal.variable;

import java.math.BigDecimal;

public class VariableFinal {

    /**
     * 不能被改变
     */
    public static final double PI = 3.14159265;
    public final BigDecimal π = new BigDecimal("3.14159265");

    public static void main(String[] args) {
        System.out.println(PI);
        System.out.println(VariableFinal.PI);
        //
        VariableFinal aFinal = new VariableFinal();
        System.out.println(aFinal.π);
        System.out.println(aFinal.PI);
        //
        final String a;
        a = "test";
        //a = "test1"; // 编译器报错
        final ClassTest classTest = new ClassTest();
        classTest.a = "test";
        classTest.a = "test1";
    }

}
