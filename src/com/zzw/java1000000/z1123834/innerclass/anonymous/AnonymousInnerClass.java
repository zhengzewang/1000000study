package com.zzw.java1000000.z1123834.innerclass.anonymous;

import com.zzw.java1000000.z1123834.innerclass.lcoal.Interface;

public class AnonymousInnerClass {

    private Interface anInterface;

    {
        anInterface = new Interface(){
            @Override
            public void doit(String x) {
                System.out.println("构造块作用域：" + x);
            }
        };
    }

    public Interface getInterfaceImpl2(String s) {
        return new Interface() {

            @Override
            public void doit(String x) {
                x = s;
                System.out.println("方法内内部类：" + x);
            }
        };
    }
    public static void main(String[] args) {
        AnonymousInnerClass anonymousInnerClass = new AnonymousInnerClass();
        anonymousInnerClass.anInterface.doit("test");
        anonymousInnerClass.anInterface = anonymousInnerClass.getInterfaceImpl2("fun test");
        anonymousInnerClass.anInterface.doit("test");
    }

}
