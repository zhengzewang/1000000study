package com.zzw.java1000000.z1123834.innerclass.staticinner;

public class OutClass {

    private String a = "1";
    private static String b = "1";

    public static class StaticInnerClass {
        private String a = "2";

        public void doit(String a) {
            System.out.println(a);
            System.out.println(this.a);
//            System.out.println(OutClass.this.a); // 编译报错
//            System.out.println(OutClass.this.b); // 编译报错
            System.out.println(OutClass.b);
        }
    }

}
