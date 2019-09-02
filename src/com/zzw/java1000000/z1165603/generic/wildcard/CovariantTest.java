package com.zzw.java1000000.z1165603.generic.wildcard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhengzewang on 2019/3/31.
 */
public class CovariantTest {

    public static void main(String[] args) {
        Number[] numbers = null;
        numbers = new Number[1];
        numbers = new Integer[1];
        //
        List<Number> numberList = null;
        numberList = new ArrayList<Number>();
//        numberList = new ArrayList<Integer>(); // 报错
        wildcardTest();
        wildcardTest3();
    }

    private static void wildcardTest() {
        List<? extends Number> numberList = null;
        numberList = new ArrayList<Number>();
        numberList = new ArrayList<Integer>();
    }

    private static void wildcardTest2() {
        List<? extends Number> numberList = null;
        numberList = new ArrayList<>(Arrays.asList(new Integer(1)));
        Number number = numberList.get(0);
//        numberList.add(new Integer(0));// 报错
    }

    private static void wildcardTest3() {
        List<? extends Number> numberList = null;
        numberList = new ArrayList<>(Arrays.asList(new Integer(1)));
        Number number = numberList.get(0);
//        numberList.add(new Integer(0));// 报错
        wildcardHelper(numberList, new Integer(10));
        System.out.println(numberList.get(1));
    }

    private static <T> void wildcardHelper(List<T> list, Object t) {
        list.add((T) t);
    }

    private static void wildcardHelper2(List list, Object t) {
        list.add(t);
    }

}
