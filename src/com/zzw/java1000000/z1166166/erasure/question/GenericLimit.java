package com.zzw.java1000000.z1166166.erasure.question;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author zhengzewang on 2019/4/2.
 */
public class GenericLimit {

    public static void main(String[] args) throws Exception {
        List<String> list = new ArrayList<>();
        Date date = new Date();
//        list.add(date);// 报错
        doSomeThing(list, date);
        Object o = list.get(0);
        System.out.println(o == date);
        System.out.println(list.get(0));
    }

    private static void doSomeThing(List<String> list, Date date) throws Exception {
        Method add = list.getClass().getMethod("add", Object.class);
        add.invoke(list, date);
    }

}
