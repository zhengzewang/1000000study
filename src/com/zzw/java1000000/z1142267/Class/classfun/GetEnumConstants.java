package com.zzw.java1000000.z1142267.Class.classfun;

import java.util.Arrays;

/**
 * @author zhengzewang on 2019/2/21.
 */
public class GetEnumConstants {

    public static void main(String[] args) {
        System.out.println(GetEnumConstants.class.isEnum());
        System.out.println(Arrays.toString(GetEnumConstants.class.getEnumConstants()));
        System.out.println(Enum1.class.isEnum());
        System.out.println(Arrays.toString(Enum1.class.getEnumConstants()));
        System.out.println(Enum2.class.isEnum());
        System.out.println(Arrays.toString(Enum2.class.getEnumConstants()));
    }

    static enum Enum1 {
        A,B
    }

    static enum Enum2 {
    }

}
