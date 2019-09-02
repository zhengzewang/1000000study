package com.zzw.java1000000.z1011448.StringDeep.summary;

public class StringAddDemo {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String a = "aa";
	    String b = "bb";
	    String c = "xx" + "yy" + a + "zz" + "mm" + b;
	    //测试字符串常量池数据
	    String testxx = new String("x") + new String("x");
	    testxx.intern();
	    System.out.println(testxx == "xx");//true
	    String testxxyy = testxx + new String("y") + new String("y");
	    testxxyy.intern();
	    System.out.println(testxxyy == "xxyy");//false
	    String testzz = new String("z") + new String("z");
	    testzz.intern();
	    System.out.println(testzz == "zz");//false
	    String testzzmm = testzz + new String("m") + new String("m");
	    testzzmm.intern();
	    System.out.println(testzzmm == "zzmm");//true
	    String testxxyyzzmm = testxxyy + new String("z") + new String("z") + new String("m") + new String("m");
	    testxxyyzzmm.intern();
	    System.out.println(testxxyyzzmm == "xxyyzzmm");//true
	}
	
}
