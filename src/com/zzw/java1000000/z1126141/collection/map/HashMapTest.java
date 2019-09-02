package com.zzw.java1000000.z1126141.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

    public static void main(String[] args) {
        Map<String,String> hashMap = new HashMap<>();
        hashMap.put("test","111");
        hashMap.entrySet();
        //
        System.out.println(hashMap.get("111"));
        System.out.println(hashMap.get("test"));
        //
    }
}
