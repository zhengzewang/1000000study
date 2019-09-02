package com.zzw.java1000000.z1126141.collection.map;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * @author zhengzewang on 2018/11/29.
 */
public class TreeMapTest {

    public static void main(String[] args) {
        TreeMap<String,String> treeMap1 = new TreeMap<>();
        treeMap1.put("bbb","bbb");
        treeMap1.put("aaa","aaa");
        for (String s : treeMap1.keySet()) {
            System.out.println(treeMap1.get(s));
        }
        //
        TreeMap<String,String> treeMap2 = new TreeMap<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        treeMap2.put("bbb","bbb");
        treeMap2.put("aaa","aaa");
        for (String s : treeMap2.keySet()) {
            System.out.println(treeMap2.get(s));
        }
    }

}
