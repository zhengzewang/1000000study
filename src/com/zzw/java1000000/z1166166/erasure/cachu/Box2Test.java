package com.zzw.java1000000.z1166166.erasure.cachu;

import com.zzw.java1000000.z1166166.erasure.Box;

/**
 * @author zhengzewang on 2019/4/6.
 */
public class Box2Test {

    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.setT("test");
        String t = box.getT();
    }

}
