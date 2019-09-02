package com.zzw.java1000000.z1136785.reflect.data;

/**
 * @author zhengzewang on 2018/12/19.
 */
public abstract class Parent<T> {

    private T t;
    private String pAttr;

    public String getpAttr() {
        return pAttr;
    }

    public void setpAttr(String pAttr) {
        this.pAttr = pAttr;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
