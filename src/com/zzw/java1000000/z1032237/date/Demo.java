package com.zzw.java1000000.z1032237.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Demo {
	
	private static final String str = "20180101";
	
	public static void main(String[] args) throws ParseException {
		System.out.println(preDayStr(str));
	}
	
	private static String preDayStr(String str) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		Date date = format.parse(str);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.add(Calendar.DATE, -1);
		date = calendar.getTime();
		return format.format(date);
	}

}
