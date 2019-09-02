package com.zzw.java1000000.z1011130.loop.For;

public class ForDemo {
	
	public static void main(String[] args) {
		
		int i = 0;
		int sum = 0;
		for (;;) {
			sum += i++;
			if(i>10)
				break;
		}
		System.out.println(sum);
		
		//判断出现break时，表达式3是否会被执行
		i = 0;
		for(;;i++){
			if(i>4)
				break;
		}
		System.out.println(i);
		
	}

}
