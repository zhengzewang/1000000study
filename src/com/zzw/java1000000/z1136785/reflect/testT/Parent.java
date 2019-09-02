package com.zzw.java1000000.z1136785.reflect.testT;

import com.zzw.java1000000.z1136785.reflect.type.SimpleType;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/**
 * @author zhengzewang on 2018/12/29.
 */
public abstract class Parent<T> {

    public void getT() {
        Class cls = this.getClass();
        TypeVariable[] variables =  cls.getTypeParameters();
        for (TypeVariable variable : variables) {
            System.out.println(variable.getName());
        }
        //
        System.out.println("----");
        Type type = cls.getGenericSuperclass();
        System.out.println(SimpleType.getTypeInfo("",type));
    }

}
