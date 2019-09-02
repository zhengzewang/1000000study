package com.zzw.java1000000.z1011448.StringDeep.intern;

public class ClassicDemo {
	
	public static void main(String[] args) {
		String str1 = "HelloWorld";
		String str = new String("Hello") + new String("World");
		str.intern();
		System.out.println(str == "HelloWorld");
	}

}
