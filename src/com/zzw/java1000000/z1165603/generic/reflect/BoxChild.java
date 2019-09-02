package com.zzw.java1000000.z1165603.generic.reflect;

/**
 * @author zhengzewang on 2019/3/31.
 */
public class BoxChild extends Box<String> {

    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println(new BoxChild().getT());

        System.out.println(String.class.getName());
        System.out.println(String[].class.getName());
        System.out.println(String[][].class.getName());
        System.out.println(Class.forName(String[].class.getName()));
        System.out.println(Class.forName("[L"+String.class.getName() + ";"));
//        System.out.println(Class.forName("[L"+String.class.getName())); // [Ljava/lang/String
    }

}
