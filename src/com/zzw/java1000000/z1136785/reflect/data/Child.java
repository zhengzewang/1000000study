package com.zzw.java1000000.z1136785.reflect.data;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

/**
 * @author zhengzewang on 2018/12/19.
 */
@TypeAnnotation
public class Child<U, V> extends Parent<String> implements AInterface, BInterface {

    @FieldAnnotation
    private String cAttr;

    public Child() {
    }

    public String getcAttr() {
        return cAttr;
    }

    public void setcAttr(String cAttr) {
        this.cAttr = cAttr;
    }

    private U u;


    public void getObj() {
        Class cls = this.getClass();
        TypeVariable[] typeVariables = cls.getTypeParameters();
        for (TypeVariable variable : typeVariables) {
            System.out.println(variable.getName());
            System.out.println(variable.getTypeName());
        }
    }

    public void getSuperClassGenricType() {
        Class cls = this.getClass();
        Type genType = cls.getGenericSuperclass();

        if (genType instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType)genType;
            Type[] params = parameterizedType.getActualTypeArguments();
            for (Type type : params) {
                System.out.println(type.getTypeName());
            }
        }
    }


    public void getTypeParameters() {
        Class cls = this.getClass();
        cls.getTypeParameters();
    }

    @MethodAnnotation
    @Override
    public void interFun() {
        System.out.println("interFun");
    }

    public U getU() {
        return u;
    }

    public void setU(U u) {
        this.u = u;
    }
}
