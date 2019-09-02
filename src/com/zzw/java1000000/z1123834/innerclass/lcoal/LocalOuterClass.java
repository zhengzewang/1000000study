package com.zzw.java1000000.z1123834.innerclass.lcoal;

public class LocalOuterClass {

    private Interface anInterface;

    {
        class InterfaceImpl1 implements Interface {

            @Override
            public void doit(String x) {
                System.out.println("构造块作用域：" + x);
            }
        }
        anInterface = new InterfaceImpl1();
    }

    public Interface getInterfaceImpl2(String s) {
        class InterfaceImpl2 implements Interface {

            @Override
            public void doit(String x) {
                x = s;
                System.out.println("方法内内部类：" + x);
            }
        }
        return new InterfaceImpl2();
    }

    public static void main(String[] args) {
        LocalOuterClass localOuterClass = new LocalOuterClass();
        localOuterClass.anInterface.doit("test");
        localOuterClass.anInterface = localOuterClass.getInterfaceImpl2("fun test");
        localOuterClass.anInterface.doit("test");
    }

}
