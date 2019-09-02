package com.zzw.java1000000.z1166166.erasure;

import com.zzw.java1000000.z1166166.erasure.fruit.Fruit;

/**
 * @author zhengzewang on 2019/3/31.
 */
public class Eat<T extends Fruit> {

    public void eat(T t) {
        System.out.println("吃水果：" + t);
    }

}
