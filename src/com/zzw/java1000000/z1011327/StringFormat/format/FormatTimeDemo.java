package com.zzw.java1000000.z1011327.StringFormat.format;

import java.util.Calendar;
import java.util.Locale;

public class FormatTimeDemo {
	
	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(2017, 1, 1,00,03,04);
		System.out.println(String.format("%tH",calendar));//00
		System.out.println(String.format("%tI",calendar));//12
		System.out.println(String.format("%tk",calendar));//0
		System.out.println(String.format("%tl",calendar));//12
		System.out.println(String.format("%tM",calendar));//03
		System.out.println(String.format("%tS",calendar));//04
		System.out.println(String.format("%tL",calendar));//821
		System.out.println(String.format("%tN",calendar));//821000000
		System.out.println(String.format(Locale.JAPAN,"%tp",calendar));//午前
		System.out.println(String.format(Locale.US,"%tz", calendar));//+0800
		System.out.println(String.format("%tZ", calendar));//CST
		System.out.println(String.format("%ts", calendar));//1485878584
		System.out.println(String.format("%tQ", calendar).equals(calendar.getTimeInMillis()+""));//true
	}

}
