package com.zzw.java1000000.z1166166.erasure.question;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author zhengzewang on 2019/4/2.
 */
public class GenericEquals {

    public static void main(String[] args) {
        List<String> l1 = new ArrayList<>();
        List<Date> l2 = new ArrayList<>();
        System.out.println(l1.getClass());
    }

}
