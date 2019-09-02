package com.zzw.java1000000.z1165006.Enum.enumType;

import com.zzw.java1000000.z1165006.Enum.Subject;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.Arrays;

/**
 * @author zhengzewang on 2019/3/28.
 */
public class EnumType {

    public static void main(String[] args) {
        Class cls = Subject.Chinese.getClass(); // 说明是一个实例
        System.out.println(cls);
        System.out.println(cls.toGenericString());
        System.out.println(cls.isEnum());
        System.out.println(cls.getSuperclass());
        //
        Constructor[] constructors = cls.getDeclaredConstructors();
        System.out.println(Arrays.toString(constructors));
        //
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field + "：" + field.isSynthetic());
        }
    }

}
