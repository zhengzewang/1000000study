package com.zzw.java1000000.z1142267.Class.classfun;

/**
 * @author zhengzewang on 2019/2/21.
 */
public class GetPackage {

    public static void main(String[] args) {
        System.out.println(GetPackage.class.getPackage());
        System.out.println(GetPackage[].class.getPackage());
        System.out.println(GetPackage[].class.getComponentType().getPackage());
        System.out.println(Enum.class.getPackage());
    }

    static enum Enum {
        A,B
    }

}
