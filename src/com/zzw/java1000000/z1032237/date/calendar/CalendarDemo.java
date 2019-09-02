package com.zzw.java1000000.z1032237.date.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class CalendarDemo {
	
	public static void main(String[] args) {
		testGet();
		System.out.println();
		testSet();
		System.out.println();
		testGetTime();
		System.out.println();
		addAndRoll();
		System.out.println();
		maxAndMin();
	}
	
	private static void maxAndMin() {
		Calendar calendar = Calendar.getInstance(Locale.CHINA);
		calendar.set(2016, 1, 25, 23, 49, 10);//2月
		System.out.println(calendar.getMaximum(Calendar.DATE));
		System.out.println(calendar.getActualMaximum(Calendar.DATE));
		System.out.println(calendar.getMinimum(Calendar.MONTH));
		System.out.println(calendar.getActualMinimum(Calendar.MONTH));
	}
	
	/**
	 * 
	 */
	private static void addAndRoll() {
		Calendar calendar = Calendar.getInstance(Locale.CHINA);
		calendar.set(2017, 11, 25, 23, 49, 10);//
		calendar.roll(Calendar.MONTH, 12);
		System.out.println(calendar.getTime());
		calendar.add(Calendar.MONTH, 12);
		System.out.println(calendar.getTime());
	}
	
	/**
	 * 
	 */
	private static void testGetTime() {
		Calendar calendar = Calendar.getInstance(Locale.CHINA);
		calendar.set(2017, 11, 25, 23, 49, 10);//
		System.out.println(calendar.getTime());
		System.out.println(calendar.getTimeInMillis());
	}
	
	/**
	 * 
	 */
	private static void testSet() {
		Calendar calendar = Calendar.getInstance(Locale.CHINA);
		calendar.set(100, 11, 25, 23, 49, 10);//
		calendar.set(Calendar.ERA, GregorianCalendar.AD);
		calendar.set(Calendar.MONTH, Calendar.JUNE);
		calendar.set(Calendar.AM_PM, Calendar.AM);
		System.out.println(calendar.getTime());
	}
	
	/**
	 * 
	 */
	private static void testGet() {
		Calendar calendar = Calendar.getInstance(Locale.CHINA);
		calendar.set(2017, 11, 25, 23, 49, 10);//
		System.out.println(calendar.get(Calendar.ERA));//1
		System.out.println(calendar.get(Calendar.YEAR));//2017
		System.out.println(calendar.get(Calendar.MONTH));//11
		System.out.println(calendar.get(Calendar.WEEK_OF_YEAR));//52
		System.out.println(calendar.get(Calendar.WEEK_OF_MONTH));//5
		System.out.println(calendar.get(Calendar.DATE));//25
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));//25
		System.out.println(calendar.get(Calendar.DAY_OF_YEAR));//359
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));//2
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));//4
		System.out.println(calendar.get(Calendar.AM_PM));//1
		System.out.println(calendar.get(Calendar.HOUR));//11
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));//23
		System.out.println(calendar.get(Calendar.MINUTE));//49
		System.out.println(calendar.get(Calendar.SECOND));//10
		System.out.println(calendar.get(Calendar.MILLISECOND));//925
		System.out.println(calendar.get(Calendar.ZONE_OFFSET));//28800000
		System.out.println(calendar.get(Calendar.DST_OFFSET));//0
	}

}
