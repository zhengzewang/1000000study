package com.zzw.java1000000.z1123834.innerclass.anonymous;

public class Parent {

    Parent(String x, String y) {
        System.out.println(x + y);
    }

    Parent() {
    }

    void doit() {

    }

    public void getChild(String x, String y) {
        Parent child1 = new Parent(x, y) {
            @Override
            void doit() {
                System.out.println("子类1");
            }
        };
        Parent child2 = new Parent() {
            @Override
            void doit() {
                System.out.println("子类2");
            }
        };
    }

}
