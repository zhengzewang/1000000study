package com.zzw.java1000000.z1008289.operator.arithmetic;

public class SelfDemo {
	
	public static void main(String[] args) {
		
		int a = 3;
		int b = a++ + a;
		System.out.println(b);
		a = 3;
		b = a + a++;
		System.out.println(b);
		a = 3;
		b = a++ + a++;
		System.out.println(b);
		a = 3;
		b = a++ + ++a;
		System.out.println(b);
		a = 3;
		b = a + ++a;
		System.out.println(b);
		a = 3;
		b = a++ + 3;
		System.out.println(b);
		
	}

}
