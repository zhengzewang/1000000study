package com.zzw.java1000000.z1165006.Enum.constructor;


import java.lang.reflect.Constructor;

/**
 * @author zhengzewang on 2019/3/29.
 */
public class ATest {

    public static void main(String[] args) {
        Class cls = A.class;
        Constructor[] constructors = cls.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor.toGenericString() + ":" + constructor.isSynthetic());
        }
    }

}
