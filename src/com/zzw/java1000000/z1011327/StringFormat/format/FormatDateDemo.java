package com.zzw.java1000000.z1011327.StringFormat.format;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class FormatDateDemo {
	
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2017, 1, 1);//2017年2月1日
		Date date = new Date(calendar.getTimeInMillis());
		System.out.println(String.format("%te", date));//1
		System.out.println(String.format("%td", date));//01
		System.out.println(String.format("%tB", date));//二月
		System.out.println(String.format(Locale.UK,"%tb", date));//Feb
		System.out.println(String.format("%tA", date));//星期三
		System.out.println(String.format(Locale.UK,"%ta", date));//Wed
		System.out.println(String.format("%tY", date));//2017
		System.out.println(String.format("%tj", date));//032
		System.out.println(String.format("%tm", date));//02
		System.out.println(String.format("%ty", date));//17
	}

}
