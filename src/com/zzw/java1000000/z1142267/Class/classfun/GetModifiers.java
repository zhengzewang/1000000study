package com.zzw.java1000000.z1142267.Class.classfun;

import java.lang.reflect.Modifier;

/**
 * @author zhengzewang on 2019/2/21.
 */
public class GetModifiers {

    public static void main(String[] args) {
        int i1 = GetModifiers.class.getModifiers();
        int i2 = Inner.class.getModifiers();
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(Modifier.toString(i1));
        System.out.println(Modifier.toString(i2));
    }

    private static final class Inner {

    }

}
