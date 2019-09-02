package com.zzw.java1000000.z1142267.Class.innerclass;

/**
 * @author zhengzewang on 2019/1/8.
 */
public class OutClass {

    private InConstructorInterface inConstructorInterface;
    private InMethodInterface inMethodInterface1;
    private static InMethodInterface inMethodInterface2;
    private InBlockInterface inBlockInterface1;
    private static InBlockInterface inBlockInterface2;

    OutClass() {
        class InConstructor implements InConstructorInterface {

        }
        this.inConstructorInterface = new InConstructor();
    }

    public void doit() {
        class InMethod implements InMethodInterface {

        }
        this.inMethodInterface1 = new InMethod();
        // 不允许创建static class
    }

    public static void doitStatic() {
        class InStaticMethod implements InMethodInterface {

        }
        inMethodInterface2 = new InStaticMethod();
        // 不允许创建static class
    }

    class InClass1 {

    }

    static class InClass2 {

    }

    {
        class InBlock implements InBlockInterface {

        }
        this.inBlockInterface1 = new InBlock();
        // 不允许创建static class
    }

    static {
        class InStaticBlock implements InBlockInterface {
        }
        inBlockInterface2 = new InStaticBlock();
        // 不允许创建static class
    }


    public static void main(String[] args) {
        Class[] classes = OutClass.class.getDeclaredClasses();
        for (Class cls : classes) {
            System.out.println(cls);
        }
        System.out.println();
        testConstructor();
        System.out.println();
        testMethod();
        System.out.println();
        testStaticMethod();
        System.out.println();
        testBlock();
        System.out.println();
        testStaticBlock();
        System.out.println();
        testClass();
        System.out.println();
        testClassStatic();
        System.out.println();
        // brother
        getClassFor(BrotherClass.class);
    }

    private static void testClassStatic() {
        // Test class
        InClass2 inClass2 = new InClass2();
        Class cls = inClass2.getClass();
        getClassFor(cls);
    }

    private static void testClass() {
        // Test class
        OutClass outClass = new OutClass();
        InClass1 inClass1 = outClass.new InClass1();
        Class cls = inClass1.getClass();
        getClassFor(cls);
    }

    private static void testStaticBlock() {
        // static bolck
        Class cls = OutClass.inBlockInterface2.getClass();
        getClassFor(cls);
    }

    private static void testBlock() {
        // bolck
        OutClass outClass = new OutClass();
        Class cls = outClass.inBlockInterface1.getClass();
        getClassFor(cls);
    }

    private static void testStaticMethod() {
        // static Method
        OutClass.doitStatic();
        Class cls = inMethodInterface2.getClass();
        getClassFor(cls);
    }

    private static void testMethod() {
        // Method
        OutClass outClass = new OutClass();
        outClass.doit();
        Class cls = outClass.inMethodInterface1.getClass();
        getClassFor(cls);
    }

    private static void testConstructor() {
        // 构造方法
        OutClass outClass = new OutClass();
        Class cls = outClass.inConstructorInterface.getClass();
        getClassFor(cls);
    }

    private static void getClassFor(Class cls) {
        System.out.println(cls);
        System.out.println(cls.getName());
        System.out.println(cls.getSimpleName());
        System.out.println(cls.getTypeName());
        System.out.println(cls.getCanonicalName());
        System.out.println("declaringClass：" + cls.getDeclaringClass());
        System.out.println("enclosingClass：" + cls.getEnclosingClass());
        System.out.println("enclosingConstructor：" + cls.getEnclosingConstructor());
        System.out.println("enclosingMethod：" + cls.getEnclosingMethod());
    }


}


class BrotherClass {

}
// 不允许创建static class