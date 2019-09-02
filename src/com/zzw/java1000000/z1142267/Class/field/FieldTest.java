package com.zzw.java1000000.z1142267.Class.field;

import java.lang.reflect.Field;

/**
 * @author zhengzewang on 2019/3/24.
 */
public class FieldTest {

    private boolean bool;
    private byte b;
    private short s;
    private int i;
    private long l;
    private float f;
    private double d;
    private char c;
    @FieldAnnotation
    private String str;
    private FieldEnum anEnum;

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InstantiationException {
        FieldTest fieldTest = new FieldTest();
        Class cls = fieldTest.getClass();
        Field field = cls.getDeclaredField("str");
        // 名称与声明类
        System.out.println(field.getName());
        System.out.println(field.getDeclaringClass());
        // 获取类型
        System.out.println(field.getType());
        System.out.println(field.getGenericType());
        field.getAnnotatedType();
        // 注解
        field.getAnnotations();
        field.getDeclaredAnnotations();
        field.getAnnotation(FieldAnnotation.class);
        field.getDeclaredAnnotation(FieldAnnotation.class);
        field.getAnnotationsByType(FieldAnnotation.class);
        field.getDeclaredAnnotationsByType(FieldAnnotation.class);
        field.isAnnotationPresent(FieldAnnotation.class);
        // 修饰符
        field.getModifiers();
        // 是否为枚举类的变量属性
        System.out.println(field.isEnumConstant()); // false
        System.out.println(cls.getDeclaredField("anEnum").isEnumConstant()); // false
        System.out.println(FieldEnum.class.getDeclaredField("a").isEnumConstant()); // true
        // 是否可访问的
        System.out.println(field.isAccessible());
        field.setAccessible(true);
        // 设置值
        field.set(fieldTest, "test");
        cls.getDeclaredField("bool").setBoolean(fieldTest, true);
        cls.getDeclaredField("b").setByte(fieldTest, new Byte("1"));
        cls.getDeclaredField("s").setShort(fieldTest, new Short("2"));
        cls.getDeclaredField("i").setInt(fieldTest, 3);
        cls.getDeclaredField("l").setLong(fieldTest, 4);
        cls.getDeclaredField("f").setFloat(fieldTest, 0.1f);
        cls.getDeclaredField("d").setDouble(fieldTest, 1.1);
        cls.getDeclaredField("c").setChar(fieldTest, 'c');
        // 获取值
        System.out.println(field.get(fieldTest));
        System.out.println(cls.getDeclaredField("bool").getBoolean(fieldTest));
        System.out.println(cls.getDeclaredField("b").getByte(fieldTest));
        System.out.println(cls.getDeclaredField("s").getShort(fieldTest));
        System.out.println(cls.getDeclaredField("i").getInt(fieldTest));
        System.out.println(cls.getDeclaredField("l").getLong(fieldTest));
        System.out.println(cls.getDeclaredField("f").getFloat(fieldTest));
        System.out.println(cls.getDeclaredField("d").getDouble(fieldTest));
        System.out.println(cls.getDeclaredField("c").getChar(fieldTest));
        //
        System.out.println(field.isSynthetic()); // false
        System.out.println(field.toString());
        System.out.println(field.toGenericString());
    }

}
