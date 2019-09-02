package com.zzw.java1000000.z1126141.collection.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

/**
 * 分别比较List和Set判断两个对象是否相等的标准
 */
public class CollTest {

    public static void main(String[] args) {
        equalsTest();
//        hashCodeTest();
        hashCodeAndEqualsTest();
    }
    private static void hashCodeAndEqualsTest() {
        System.out.println("\nhashCodeAndEqualsTest");
        ArrayList<HashCodeAndEqualsObj> hashCodeAndEqualsObjArrayList = new ArrayList<>();
        HashSet<HashCodeAndEqualsObj> hashCodeAndEqualsObjHashSet = new HashSet<>();
        //
        HashCodeAndEqualsObj hashCodeAndEqualsObj1 = new HashCodeAndEqualsObj();
        hashCodeAndEqualsObj1.setId("zhengzewang");
        HashCodeAndEqualsObj hashCodeAndEqualsObj2 = new HashCodeAndEqualsObj();
        hashCodeAndEqualsObj2.setId("zhengzewang");
        //
        hashCodeAndEqualsObjArrayList.add(hashCodeAndEqualsObj1);
        hashCodeAndEqualsObjHashSet.add(hashCodeAndEqualsObj1);
        //
        System.out.println(hashCodeAndEqualsObjArrayList.contains(hashCodeAndEqualsObj2));
        System.out.println(hashCodeAndEqualsObjHashSet.contains(hashCodeAndEqualsObj2));
        //
        hashCodeAndEqualsObjArrayList.remove(hashCodeAndEqualsObj2);
        hashCodeAndEqualsObjHashSet.remove(hashCodeAndEqualsObj2);
        System.out.println(hashCodeAndEqualsObjArrayList.size());
        System.out.println(hashCodeAndEqualsObjHashSet.size());
        //
        hashCodeAndEqualsObjArrayList.add(hashCodeAndEqualsObj1);
        hashCodeAndEqualsObjHashSet.add(hashCodeAndEqualsObj1);
        hashCodeAndEqualsObjArrayList.add(hashCodeAndEqualsObj2);
        hashCodeAndEqualsObjHashSet.add(hashCodeAndEqualsObj2);
        System.out.println(hashCodeAndEqualsObjArrayList.size());
        System.out.println(hashCodeAndEqualsObjHashSet.size());
        //
        HashCodeAndEqualsObj hashCodeAndEqualsObj3 = new HashCodeAndEqualsObj();
        hashCodeAndEqualsObj3.setId("zhengzewang");
        hashCodeAndEqualsObjHashSet.remove(hashCodeAndEqualsObj3);
        System.out.println(hashCodeAndEqualsObjHashSet.size());
    }

    private static void hashCodeTest() {
        System.out.println("\nhashCodeTest");
        ArrayList<HashCodeObj> hashCodeObjArrayList = new ArrayList<>();
        HashSet<HashCodeObj> hashCodeObjHashSet = new HashSet<>();
        //
        HashCodeObj hashCodeObj1 = new HashCodeObj();
        hashCodeObj1.setId("zhengzewang");
        HashCodeObj hashCodeObj2 = new HashCodeObj();
        hashCodeObj2.setId("zhengzewang");
        //
        hashCodeObjArrayList.add(hashCodeObj1);
        hashCodeObjHashSet.add(hashCodeObj1);
        //
        System.out.println(hashCodeObjArrayList.contains(hashCodeObj2));
        System.out.println(hashCodeObjHashSet.contains(hashCodeObj2));
        //
        hashCodeObjArrayList.remove(hashCodeObj2);
        hashCodeObjHashSet.remove(hashCodeObj2);
        System.out.println(hashCodeObjArrayList.size());
        System.out.println(hashCodeObjHashSet.size());
        //
    }

    private static void equalsTest() {
        System.out.println("\nequalsTest");
        ArrayList<EqualsObj> equalsObjArrayList = new ArrayList<>();
        HashSet<EqualsObj> equalsObjHashSet = new HashSet<>();
        //
        EqualsObj equalsObj1 = new EqualsObj();
        equalsObj1.setId("zhengzewang");
        EqualsObj equalsObj2 = new EqualsObj();
        equalsObj2.setId("zhengzewang");
        //
        equalsObjArrayList.add(equalsObj1);
        equalsObjHashSet.add(equalsObj1);
        //
        System.out.println(equalsObjArrayList.contains(equalsObj2));
        System.out.println(equalsObjHashSet.contains(equalsObj2));
        //
        equalsObjArrayList.remove(equalsObj2);
        equalsObjHashSet.remove(equalsObj2);
        System.out.println(equalsObjArrayList.size());
        System.out.println(equalsObjHashSet.size());
        //
        equalsObjArrayList.add(equalsObj1);
        equalsObjArrayList.add(equalsObj2);
        System.out.println(equalsObjArrayList.size());
        EqualsObj equalsObj3 = new EqualsObj();
        equalsObj3.setId("zhengzewang");
        equalsObjArrayList.remove(equalsObj3);
//        equalsObjArrayList.removeAll(Arrays.asList(equalsObj3));
        System.out.println(equalsObjArrayList.size());
        if (!equalsObjArrayList.isEmpty()) {
            System.out.println(equalsObjArrayList.get(0) == equalsObj1);
            System.out.println(equalsObjArrayList.get(0) == equalsObj2);
        }
    }

}
