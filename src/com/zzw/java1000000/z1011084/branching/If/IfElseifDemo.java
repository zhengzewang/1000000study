package com.zzw.java1000000.z1011084.branching.If;

/**
 * 
 * @author zhengzewang
 *
 */
public class IfElseifDemo {
	
	public static void main(String[] args) {
		
		int month = 2;
		int year = 2016;
		int days = 28;
		
		if(month == 1 
				|| month == 3
				|| month == 5
				|| month == 7
				|| month == 8
				|| month == 10
				|| month == 12)
			days = 31;
		else if(month == 4 
				|| month == 6
				|| month == 9
				|| month == 11)
			days = 30;
		else if(month == 2 && ((year%4 == 0 && year%100 != 0)||year%400==0))
			days = 29;
		System.out.println(days);
		
		//转化为三元运算符
		days = 
				month == 1 
				|| month == 3
				|| month == 5
				|| month == 7
				|| month == 8
				|| month == 10
				|| month == 12 ? 31 : month == 4 
				|| month == 6
				|| month == 9
				|| month == 11 ? 30 : month == 2 && ((year%4 == 0 && year%100 != 0) || year%400==0) ? 29 : 28;
		System.out.println(days);
		
	}

}
