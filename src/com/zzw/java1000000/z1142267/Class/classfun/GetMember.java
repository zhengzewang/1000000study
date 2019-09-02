package com.zzw.java1000000.z1142267.Class.classfun;

import com.zzw.java1000000.z1142267.Class.classfun.getmember.GetMemberChild;

import java.lang.reflect.Constructor;

/**
 * @author zhengzewang on 2019/3/4.
 */
public class GetMember {

    public static void main(String[] args) {
        Class cls = GetMemberChild.class;
        Constructor<?>[] constructors = cls.getConstructors();
        for (Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println();
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        for (Constructor constructor : declaredConstructors) {
            System.out.println(constructor);
        }
    }

}
