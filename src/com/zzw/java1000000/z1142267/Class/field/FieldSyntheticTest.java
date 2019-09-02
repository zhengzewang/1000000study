package com.zzw.java1000000.z1142267.Class.field;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author zhengzewang on 2019/3/27.
 */
public class FieldSyntheticTest {

    private void test() {
        Inner inner = new Inner();
        String a = inner.a;
    }

    static class Inner {
        private String a;
    }

    public static void main(String[] args) {
        Inner inner = new Inner();
        inner.a = "test";
        String a = inner.a;
        System.out.println(a);
        Class cls = Inner.class;
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + "：" + field.isSynthetic());
        }
        //
        Class[] classes = FieldSyntheticTest.class.getDeclaredClasses();
        for (Class c : classes) {
            System.out.println(c.getName() + "：" + c.isSynthetic());
        }
        //
        Method[] methods = cls.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName() + "：" + method.isSynthetic() + "、" + method.toGenericString());
        }
    }

}
