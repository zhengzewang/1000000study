package com.zzw.java1000000.z1011130.loop.While;

public class WhileDemo {
	
	public static void main(String[] args) {
		
		int x = 10;
		while(x-- > 0);
		
		System.out.println(x);
		int sum = 0;
		while(x++<10){
			sum += x;
		}
		System.out.println(sum);
		
	}

}
