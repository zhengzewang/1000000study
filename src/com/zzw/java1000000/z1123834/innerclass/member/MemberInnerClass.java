package com.zzw.java1000000.z1123834.innerclass.member;

public class MemberInnerClass {

    private int x = 9;

    private class Inner {
        private int x = 8;
        public void doit(int x) {
            System.out.println(x);
            System.out.println(this.x);
            System.out.println(MemberInnerClass.this.x);
        }
    }

    public class InnerClass {

    }
    public static class InnerClass2 {

    }

    public static void main(String[] args) {
        MemberInnerClass memberInnerClass = new MemberInnerClass();
//        InnerClass innerClass = new InnerClass();  // 编译报错
        InnerClass innerClass = memberInnerClass.new InnerClass();
        InnerClass2 innerClass2 = new InnerClass2();
        //
        Inner inner = memberInnerClass.new Inner();
        inner.doit(7);
    }

}
