package com.zzw.java1000000.z1142267.Class.classfun;

/**
 * @author zhengzewang on 2019/2/21.
 */
public class GetName {

    public static void main(String[] args) {
        Class cls1 = GetName.class;
        Class cls2 = GetName[].class;
        Class cls3 = Enum.class;
        Class cls4 = Enum[].class;
        System.out.println(cls1.getName());
        System.out.println(cls2.getName());
        System.out.println(cls3.getName());
        System.out.println(cls4.getName());
        System.out.println("==");
        System.out.println(cls1.getSimpleName());
        System.out.println(cls2.getSimpleName());
        System.out.println(cls3.getSimpleName());
        System.out.println(cls4.getSimpleName());
        System.out.println("==");
        System.out.println(cls1.getTypeName());
        System.out.println(cls2.getTypeName());
        System.out.println(cls3.getTypeName());
        System.out.println(cls4.getTypeName());
        System.out.println("==");
        System.out.println(cls1.getCanonicalName());
        System.out.println(cls2.getCanonicalName());
        System.out.println(cls3.getCanonicalName());
        System.out.println(cls4.getCanonicalName());
        //
    }

    static void fun() {
        class inner{

        }
    }

    static enum Enum {

    }

}
