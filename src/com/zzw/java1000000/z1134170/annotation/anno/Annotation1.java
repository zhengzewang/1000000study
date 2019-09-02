package com.zzw.java1000000.z1134170.annotation.anno;

/**
 * @author zhengzewang on 2018/12/18.
 */
public @interface Annotation1 {

    Enum1 value1(); // enum

    int value2(); // primitive

    Annotation2 value3(); // annotation

    Class value4(); // Class

    String value5(); // String

//    Object value6(); // error!

}
