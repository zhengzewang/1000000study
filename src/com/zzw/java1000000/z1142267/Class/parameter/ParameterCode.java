package com.zzw.java1000000.z1142267.Class.parameter;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * @author zhengzewang on 2019/3/26.
 */
public class ParameterCode {

    public void test(String value) {
        System.out.println(value);
    }

    public static void main(String[] args) throws NoSuchMethodException {
        Method method = ParameterCode.class.getMethod("test", String.class);
        Parameter parameter = method.getParameters()[0];
        System.out.println(parameter.getName());
        System.out.println(parameter.isNamePresent());
    }

}
