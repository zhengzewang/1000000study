package com.zzw.java1000000.z1142267.Class.getResource;

/**
 * @author zhengzewang on 2019/3/27.
 */
public class Test {

    public static void main(String[] args) {
        System.out.println(Test.class.getResource("")); // 当前class的资源路径
        System.out.println(Test.class.getResource("/"));// 根路径
        System.out.println(Test.class.getResource(Test.class.getSimpleName() + ".class")); // 当前class资源路径下查找
        System.out.println(Test.class.getResource("/" + Test.class.getSimpleName() + ".class")); // 根路径下查找
        System.out.println(Test.class.getResource(Test.class.getName().replace(".", "/") + ".class"));
        System.out.println(Test.class.getResource("/" + Test.class.getName().replace(".", "/") + ".class"));
        //
        System.out.println();
        ClassLoader classLoader = Test.class.getClassLoader();
        System.out.println(classLoader.getResource(""));
        System.out.println(classLoader.getResource("/"));
        System.out.println(classLoader.getResource(Test.class.getSimpleName() + ".class")); // 当前class资源路径下查找
        System.out.println(classLoader.getResource("/" + Test.class.getSimpleName() + ".class")); // 根路径下查找
        System.out.println(classLoader.getResource(Test.class.getName().replace(".", "/") + ".class"));
        System.out.println(classLoader.getResource("/" + Test.class.getName().replace(".", "/") + ".class")); // null
    }

}
