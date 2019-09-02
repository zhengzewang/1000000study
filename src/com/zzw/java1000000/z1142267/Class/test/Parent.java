package com.zzw.java1000000.z1142267.Class.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhengzewang on 2019/3/18.
 */
public abstract class Parent<K> {

    private List<B> bs = new ArrayList<>();

    public List<B> getBs() {
        return bs;
    }

    public void setBs(List<B> bs) {
        this.bs = bs;
    }


    public static void main(String[] args) {
        Child child = new Child();
    }

}

class Child extends Parent {

}

class B {
    private String b;

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
}