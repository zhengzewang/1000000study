package com.zzw.java1000000.z1142267.Class.classfun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhengzewang on 2019/3/5.
 */
public class GetEnclosingClass {

    // 本例中：以下所有定义为public的类均支持所有的修饰符。未用修饰符的类表明不能使用其他修饰符

    private final Inner inner1 = new Inner1();
    private final Inner inner2 = new Inner2();
    private final Inner inner3;
    private final static Inner inner4;
    private Inner inner5;
    private static Inner inner6;
    private Inner inner7 = ((Inner1) this.inner1).get7();

    public class Inner1 implements Inner {
        // 实例内部类（成员内部类）
        public class Inner7 implements Inner {

        }

        public Inner get7() {
            return new Inner7();
        }
    }

    public static class Inner2 implements Inner {
        // 静态内部类（成员内部类）
    }

    {
        class Inner3 implements Inner {

        }
        this.inner3 = new Inner3();
        this.inner5();
        // 不允许创建 static class
    }

    static {
        class Inner4 implements Inner {

        }
        inner4 = new Inner4();
        inner6();
        // 不允许创建 static class
    }

    void inner5() {
        class Inner5 implements Inner {

        }
        this.inner5 = new Inner5();
        // 不允许创建 static class
    }

    static void inner6() {
        class Inner6 implements Inner {

        }
        inner6 = new Inner6();
        // 不允许创建 static class
    }

    public static void main(String[] args) {
        GetEnclosingClass obj = new GetEnclosingClass();
        Class objClass = obj.getClass();
        System.out.println(Arrays.toString(objClass.getDeclaredClasses()));
        List<Class<? extends Inner>> classes = new ArrayList<>();
        classes.add(obj.inner1.getClass());
        classes.add(obj.inner2.getClass());
        classes.add(obj.inner3.getClass());
        classes.add(obj.inner4.getClass());
        classes.add(obj.inner5.getClass());
        classes.add(obj.inner6.getClass());
        classes.add(obj.inner7.getClass());
        for (Class<? extends Inner> cls : classes) {
            System.out.println(cls.getTypeName() + "：" + cls.getDeclaringClass() + "：" + cls.getEnclosingClass());
        }
    }

}

interface Inner {

}
