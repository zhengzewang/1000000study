package com.zzw.java1000000.z1166166.erasure;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhengzewang on 2019/4/25.
 */
public class ListTest {

    public static void main(String[] args) {
//        List<String> list = new ArrayList<Number>();
        List list = new ArrayList<Number>();
        List list2 = list;
        List<String> objects = list2;
    }

}
