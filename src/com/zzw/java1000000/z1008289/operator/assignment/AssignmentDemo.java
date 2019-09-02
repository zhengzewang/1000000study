package com.zzw.java1000000.z1008289.operator.assignment;

public class AssignmentDemo {
	
	public static void main(String[] args) {
		
		int c;
		
		System.out.println(c = 1+2);
		System.out.println(c += 2);
		System.out.println(c -= 1);
		System.out.println(c *= 30);
		System.out.println(c /= 4);
		System.out.println(c %= 20);
		System.out.println(c <<= 2);//10 <<= 2也就是1010左移两位，为101000，转化为十进制40
		System.out.println(c >>= 4);//101000右移动三位，10
		
	}

}
