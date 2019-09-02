package com.zzw.java1000000.z1011327.StringFormat.learnmore;

import java.util.Date;

public class StringFormatDemo {

    public static void main(String[] args) {
        //%[index$][标识][最小宽度]转换符
        String hello = "hello";
        System.out.println(String.format("%2$7s", null, hello));
        System.out.println(String.format("%3$7c", null, null, 97));
        System.out.println(String.format("%3$7b", null, null, 97));
        /**
         *   hello
         *       a
         *    true
         */

        //%[index$][标识]*[最小宽度]转换符
        System.out.println(String.format("%(,d", -1000));
        System.out.println(String.format("% (7d", -1000));
        System.out.println(String.format("%2$+7d", null, 1234));
        /**
         * (1,000)
         *   +1234
         */

        //%[index$][标识]*[最小宽度][.精度]转换符
        System.out.println(String.format("%#15.3f", 10.26));
        System.out.println(String.format("%#15x", 1));
        System.out.println(String.format("%#15e", 1.2));
        System.out.println(String.format("%015a", 1.5));
        /**
         *          10.260
         *             0x1
         *    1.200000e+00
         * 0x000000001.8p0
         */

        //%[index$]t转换符
        System.out.println(String.format("%-12tFblank", new Date()));
        System.out.println(String.format("%12tF", new Date()));
        /**
         * 2017-10-16  blank
         *   2017-10-16
         */

        //<
        System.out.println(String.format("%2$7.3f,%0<7.2f,%s", "ok", 1.23));
        System.out.println(String.format("%2$7d,%0#<7x", null, 12));
        /**
         *   2017-10-16
         *   1.230,0001.23,ok
         *      12,0x0000c
         */
    }

}
