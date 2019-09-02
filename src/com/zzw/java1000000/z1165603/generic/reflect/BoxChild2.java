package com.zzw.java1000000.z1165603.generic.reflect;

import java.util.List;

/**
 * @author zhengzewang on 2019/3/31.
 */
public class BoxChild2 extends Box<List<String>> {

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println(new BoxChild2().getT());
    }

}
