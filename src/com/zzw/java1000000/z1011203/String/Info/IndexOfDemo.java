package com.zzw.java1000000.z1011203.String.Info;

public class IndexOfDemo {
	
	public static void main(String[] args) {
		String str = "my name is zhengzewang";
		System.out.println(str.length());//22
		
		System.out.println(str.indexOf(""));//0
		System.out.println(str.indexOf("z"));//11
		System.out.println(str.indexOf("b"));//-1
		
		System.out.println(str.lastIndexOf(""));//22
		System.out.println(str.lastIndexOf("z"));//16
		System.out.println(str.lastIndexOf("b"));//-1
		
		System.out.println(str.indexOf(97));//4
		System.out.println(str.indexOf("a"));//4
		System.out.println(str.indexOf(97, 5));//19
		System.out.println(str.indexOf("a", 5));//19
	}

}
