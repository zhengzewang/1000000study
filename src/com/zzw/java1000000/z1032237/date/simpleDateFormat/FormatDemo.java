package com.zzw.java1000000.z1032237.date.simpleDateFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class FormatDemo {
	
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yy-MM-dd");
		Date date = new Date();
		System.out.println(format.format(date));
		format.applyPattern("G E yyyy/MM/dd hh:mm:ss a z 'yyyy'");
		System.out.println(format.format(date));
		format.applyPattern("yyyy/MM/dd hh:mm:ss");
		date = format.parse("2018/1/1 00:11:11");
		System.out.println(date);
		
		System.out.println();
		test();
	}
	
	private static void test(){
		SimpleDateFormat format = new SimpleDateFormat("",Locale.CHINA);
		format.applyPattern("G E yy/MM/dd kk:mm:ss a z 'yyyy'");
		Date date = new Date();
		System.out.println(format.format(date));//
		date.setTime(date.getTime() - 1000l*60*60*24*365*3000);
		System.out.println(format.format(date));//
		date = new Date();
		format.applyPattern("D F w W");
		System.out.println(format.format(date));
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(2016, 0, 4, 8, 8, 8);
		date = calendar.getTime();
		System.out.println(date);
		System.out.println(format.format(date));
	}
	
	

}
