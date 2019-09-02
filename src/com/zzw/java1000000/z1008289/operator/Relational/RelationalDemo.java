package com.zzw.java1000000.z1008289.operator.Relational;

public class RelationalDemo {
	
	public static void main(String[] args) {
		
		System.out.println('c'=='c');
		System.out.println('y'!='t');
		System.out.println('a'>'b');
		System.out.println(156<456);
		System.out.println(479>=426);
		System.out.println(12.5<=45.5);
		
		RelationalDemo demo1 = new RelationalDemo();
		RelationalDemo demo2 = new RelationalDemo();
		
		//error
//		System.out.println(demo1 > demo2);
		System.out.println(demo1 == demo2);
		
	}

}
