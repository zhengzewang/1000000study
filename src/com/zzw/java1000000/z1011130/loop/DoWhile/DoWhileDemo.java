package com.zzw.java1000000.z1011130.loop.DoWhile;

public class DoWhileDemo {
	
	public static void main(String[] args) {
		
		int x = 10;
		do;
		while(x-- > 0);
		
		System.out.println(x);
		int sum = 0;
		do{
			sum += x;
		}while(x++ < 10);
		System.out.println(sum);
		
	}

}
