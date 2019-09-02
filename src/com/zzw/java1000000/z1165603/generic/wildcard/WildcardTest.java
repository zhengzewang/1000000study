package com.zzw.java1000000.z1165603.generic.wildcard;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author zhengzewang on 2019/3/31.
 */
public class WildcardTest {

    public static void main(String[] args) {
        List<?> objects = new ArrayList<>();
        objects = new ArrayList<String>();
        objects = new ArrayList<Date>();
    }

}
