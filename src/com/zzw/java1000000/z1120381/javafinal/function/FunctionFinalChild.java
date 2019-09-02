package com.zzw.java1000000.z1120381.javafinal.function;

public class FunctionFinalChild extends FunctionFinal {

    @Override
    public void test() {
        System.out.println("this is a normal child method");
    }

    // 编译报错
//    @Override
//    public void testFinal() {
//        System.out.println("this is a normal child method");
//    }

    // 加不加Override编译都报错
//    public static final void testStaticFinal() {
//        System.out.println("this is a static final method");
//    }

    //    @Override // 加Override编译报错
    public static void testStatic() {
        // 注意，这个实际上不是重写。这跟父类的同名方法时两个不同的方法，只是因为名称一样父类的被覆盖了。
        System.out.println("this is a static child method");
    }

    public static void main(String[] args) {
        FunctionFinalChild.testStatic();
        FunctionFinalChild.testStaticFinal();
        //
        FunctionFinalChild finalChild = new FunctionFinalChild();
        finalChild.test();
        finalChild.testFinal();
        finalChild.testStatic();
        finalChild.testStaticFinal();
    }

}
