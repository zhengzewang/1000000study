package com.zzw.java1000000.z1071412.polymorphic;

public class OverloadingTest {
	
	public void fun(int a,int b) {
		System.out.println("fixed");
	}
	
	public void fun(int a, int... is) {
		System.out.println("variable1");
	}
	
	public void fun(int... is) {
		System.out.println("variable2");
	}
	
	public static void main(String[] args) {
//		new OverloadingTest().fun(1, 2, 3);//编译报错
		new OverloadingTest().fun(1, 2);
		new OverloadingTest().fun(1, new int[2]);
		new OverloadingTest().fun(new int[3]);
	}
	
}
