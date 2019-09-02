package com.zzw.java1000000.z1165006.Enum;

import java.lang.reflect.Method;

/**
 * @author zhengzewang on 2019/3/27.
 */
public class Test {


    public static void main(String[] args) {
        Subject.valueOf("Chinese");
        Subject.values();
        //
        System.out.println(Subject.Chinese.getDeclaringClass());
        System.out.println(Subject.Chinese.hashCode());
        System.out.println(Subject.Chinese.name());
        System.out.println(Subject.Chinese.toString());
        System.out.println(Subject.Chinese.ordinal());
        System.out.println(Subject.Mathematics.ordinal());
        //
        System.out.println(Subject.Chinese.compareTo(Subject.Mathematics));
        System.out.println(Subject.Chinese.equals(Subject.Mathematics));
        //
        System.out.println(Subject.Chinese.getClass());
        //

        Method[] methods = Subject.class.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.toGenericString() + ":" + method.isSynthetic());
        }
    }

}
