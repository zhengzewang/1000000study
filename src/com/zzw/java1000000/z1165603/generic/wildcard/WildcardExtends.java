package com.zzw.java1000000.z1165603.generic.wildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author zhengzewang on 2019/3/31.
 */
public class WildcardExtends {

    public static void main(String[] args) {
        List<? extends Date> dates = null;
        dates = new ArrayList<>();
        dates = new ArrayList<Date>();
//        dates = new ArrayList<String>(); // 报错
//        dates.add(new Date());
        dates = new ArrayList<>(Arrays.asList(new Date()));
//        dates = new ArrayList<>(Arrays.asList("hello")); //报错
        Date date = dates.get(0);
//        String str = dates.get(0); // 报错
    }

}
