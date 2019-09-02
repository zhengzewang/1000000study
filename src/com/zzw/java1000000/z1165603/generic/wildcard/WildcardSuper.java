package com.zzw.java1000000.z1165603.generic.wildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @author zhengzewang on 2019/3/31.
 */
public class WildcardSuper {

    public static void main(String[] args) {
        List<? super Integer> integers = null;
        integers = new ArrayList<>();
        integers = new ArrayList<Number>();
    }

}
