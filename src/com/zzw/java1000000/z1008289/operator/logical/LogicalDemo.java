package com.zzw.java1000000.z1008289.operator.logical;

public class LogicalDemo {
	public static void main(String[] args) {
		
		logic(false, true);
		
	}
	private static void logic(boolean bool1, boolean bool2) {
		int a = 4;
		int b = 4;
		System.out.println("a:"+a);
		if(bool1 && a++<10){
			//
		}
		System.out.println("a:"+a);
		if(bool1 & a++<10){
			//
		}
		System.out.println("a:"+a);

		System.out.println("b:"+b);
		if(bool2 || b++<10){
			
		}
		System.out.println("b:"+b);
		if(bool2 | b++<10){
			
		}
		System.out.println("b:"+b);
	}
}
