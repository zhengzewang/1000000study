package com.zzw.java1000000.z1166166.erasure.fruit;

/**
 * @author zhengzewang on 2019/3/31.
 */
public abstract class Fruit {

    public abstract String getName();

    @Override
    public String toString() {
        return getName();
    }

}
