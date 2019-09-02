package com.zzw.java1000000.z1142267.Class.test;

import java.lang.reflect.Field;

/**
 * @author zhengzewang on 2019/3/19.
 */
public class Erasure<T> {

    T object;

    public Erasure(T object) {
        this.object = object;
    }

    public static void main(String[] args) {
        Erasure<String> erasure = new Erasure<String>("hello");
        Class eclz = erasure.getClass();
        System.out.println("erasure class is:" + eclz.getName());
        //
        Field[] fs = eclz.getDeclaredFields();
        for ( Field f:fs) {
            System.out.println("Field name "+f.getName()+" type:"+f.getType().getName() + " genericType:" + f.getGenericType().getTypeName());
        }
    }

}
