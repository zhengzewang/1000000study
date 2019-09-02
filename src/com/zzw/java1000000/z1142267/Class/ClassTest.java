package com.zzw.java1000000.z1142267.Class;

import java.io.Serializable;

/**
 * @author zhengzewang on 2019/1/7.
 */
@TestAnnotation
public class ClassTest implements Serializable {

    public ClassTest() {
    }

    public ClassTest(String arg) {

    }

    public String arg1 = "arg1";
    private String arg2;

    public void doit1(String arg) {

    }

    private void doit2(String arg) {

    }


    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, IllegalAccessException, InstantiationException, ClassNotFoundException {
        Class cls = ClassTest.class;
        /**
         * DECLARED：当前类声明的
         *
         * PUBLIC：当前类以及父类声明的
         */
        // 基本信息
        System.out.println(cls.getName()); // 全限定类名
        System.out.println(cls.getSimpleName()); // 简单类名
        System.out.println(cls.getModifiers()); // 修饰符
        System.out.println(cls.getTypeName()); // 继承自type并重写
        System.out.println(cls.getCanonicalName()); // 主要是很对数组和内部类做了一些输出优化
        System.out.println(cls.getProtectionDomain()); // todo 单独讲解
        System.out.println(cls.getSigners()); //
        System.out.println(cls.getClassLoader());
        System.out.println(cls.isEnum());
        System.out.println(cls.getEnumConstants()); // 获取枚举的所有值
        // 包信息
        cls.getPackage();
        // Constructor
        cls.getConstructors();
        cls.getDeclaredConstructors(); //
        cls.getConstructor(String.class);
        cls.getDeclaredConstructor(String.class);
        cls.getEnclosingConstructor(); // 如果该类是内部类，且定义在构造方法中，则返回该构造方法
        //Field
        cls.getFields();
        cls.getDeclaredFields();
        cls.getField("arg1");
        cls.getDeclaredField("arg2");
        // Method
        cls.getMethods();
        cls.getDeclaredMethods();
        cls.getMethod("doit1", String.class);
        cls.getDeclaredMethod("doit2", String.class);
        cls.getEnclosingMethod(); // 如果该类是内部类，且定义在方法中，则返回该方法。
        // 内部类
        cls.getClasses();
        cls.getDeclaredClasses();
        cls.getDeclaringClass(); // 如果该类为内部类，则返回声明该类的类，前提是内部类是外部类的成员类，而不是该类的任何一个方法（包括构造）或块中定义的类
        cls.getEnclosingClass(); // 如果该类是内部类，则返回声明该类的类。该内部类可以是成员类，也可以是任何一个代码块中定义的类
        // 注解
        cls.getAnnotations();
        cls.getDeclaredAnnotations();
        cls.getAnnotation(TestAnnotation.class);
        cls.getDeclaredAnnotation(TestAnnotation.class);
        cls.getAnnotationsByType(TestAnnotation.class);
        cls.getDeclaredAnnotationsByType(TestAnnotation.class);
        // 父类
        cls.getSuperclass();
        cls.getGenericSuperclass();
        cls.getAnnotatedSuperclass();
        // 接口
        cls.getInterfaces();
        cls.getGenericInterfaces();
        cls.getAnnotatedInterfaces();
        // 类型变量
        cls.getTypeParameters();
        // 数组
        System.out.println(cls.isArray());
        System.out.println(cls.getComponentType());
        //
        System.out.println(cls.getResource("/"));
        System.out.println(cls.getResource(""));
        System.out.println(cls.getResourceAsStream(""));
        System.out.println(cls.getClassLoader().getResource(""));
        // is
        System.out.println(cls.isAnnotation());
        System.out.println(cls.isInterface());
        System.out.println(cls.isAnonymousClass()); // 是否为匿名内部类
        System.out.println(cls.isLocalClass()); // 是否是局部类
        System.out.println(cls.isMemberClass());
        System.out.println(cls.isPrimitive()); // 是否是简单数据类型
        System.out.println(cls.isSynthetic()); // 是由java编译器生成的类。实际生产中，基本不存在需要程序员考虑的场景
        System.out.println(cls.isAssignableFrom(Object.class));
        System.out.println(cls.isAnnotationPresent(TestAnnotation.class));
        System.out.println(cls.isInstance(new ClassTest()));
        //
        cls.asSubclass(Object.class); // 获得父类class
        cls.cast(new ClassTest()); // 相当于（cls）obj
        System.out.println(cls.desiredAssertionStatus()); // 判断是否开启了断言
        System.out.println(cls.toString());
        System.out.println(cls.toGenericString()); // 另给出细节，比如修饰符
        System.out.println(ClassTest.class.cast(cls.cast(cls.newInstance())).arg1);
        //

        // staic
        Class.forName("");
    }

}
