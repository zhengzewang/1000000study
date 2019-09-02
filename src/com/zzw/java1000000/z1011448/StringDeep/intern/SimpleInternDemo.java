package com.zzw.java1000000.z1011448.StringDeep.intern;

public class SimpleInternDemo {
	
	public static void main(String[] args) {
		String str = new String("Hello") + new String("World");
		str = str.intern();
		System.out.println(str == "HelloWorld");
	}

}
