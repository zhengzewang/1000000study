package com.zzw.java1000000.z1011327.StringFormat.format;

import java.util.Calendar;

public class FormatDateTimeDemo {
	
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2017, 1, 1,00,03,04);
		System.out.println(String.format("%tF",calendar));//2017-02-01
		System.out.println(String.format("%tD",calendar));//02/01/17
		System.out.println(String.format("%tc",calendar));//Wed Feb 01 00:03:04 CST 2017
		System.out.println(String.format("%tr",calendar));//12:03:04 上午
		System.out.println(String.format("%tT",calendar));//00:03:04
		System.out.println(String.format("%tR",calendar));//00:03
	}

}
