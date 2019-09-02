package com.zzw.java1000000.z1011203.String.format;

import java.util.Date;

public class FormatDemo {
	
	public static void main(String[] args) {
		
		String str = "my name is zhengzewang";
		
		System.out.println(String.format("%b", 0));
		
		System.out.println(String.format("%te", new Date(), new Date(new Date().getTime()+3600*24*1000)));
		
	}

}
