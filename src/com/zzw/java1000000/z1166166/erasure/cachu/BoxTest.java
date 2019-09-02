package com.zzw.java1000000.z1166166.erasure.cachu;

import com.zzw.java1000000.z1166166.erasure.Box;
import com.zzw.java1000000.z1166166.erasure.Figure;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author zhengzewang on 2019/4/6.
 */
public class BoxTest {

    public static void main(String[] args) throws Exception {
        Class cls = Box.class;
        Field field = cls.getDeclaredField("t");
        System.out.println(field);
        //
        Method method = cls.getDeclaredMethod("setT", Object.class);
        System.out.println(method);
        //
        cls = Figure.class;
        field = cls.getDeclaredField("t");
        System.out.println(field);
        method = cls.getDeclaredMethod("setT", Number.class);
        System.out.println(method);
    }

}
