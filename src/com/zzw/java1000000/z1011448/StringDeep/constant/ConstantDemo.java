package com.zzw.java1000000.z1011448.StringDeep.constant;

public class ConstantDemo {
	
	public static void main(String[] args) {
		String a = "test";
		String b = "test";
		String test = new String("test");
		System.out.println(a==b);
		System.out.println(a==test);
		test = test.intern();
		System.out.println(a==test);
		
		System.out.println();
		
		String testtest = new String("test")+new String("test");
//		System.out.println(testtest==testtest2);
		testtest = testtest.intern();
		String testtest2 = "testtest";
		System.out.println(testtest==testtest2);
	}

}
