package com.zzw.java1000000.z1165603.generic.limit;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author zhengzewang on 2019/3/30.
 */
public class ExtendsTest<T extends Date> {

    private T t; // 编译后是`private Date t`

    public <K extends List> List fun(K k) {
        return k;
    }

    public static void main(String[] args) {
//        ExtendsTest<String> test1 = new ExtendsTest<String>(); // 报错
        ExtendsTest<Date> test2 = new ExtendsTest<>();
        //
//        test2.fun(new HashMap<>());// 报错
        test2.fun(new ArrayList());
    }

}
