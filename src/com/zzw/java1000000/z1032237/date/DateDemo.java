package com.zzw.java1000000.z1032237.date;

import java.util.Date;

public class DateDemo {
	
	public static void main(String[] args) {
		constructor();
		commonMethod();
	}
	
	/**
	 * 常用方法
	 */
	public static void commonMethod(){
		Date date = new Date();
		Date date2 = new Date(date.getTime() + 1000*60*60*24);
		System.out.println(date.after(date2));//after
		System.out.println(date.before(date2));//before
		Date date3 = (Date) date.clone();//clone
		date.setTime(date3.getTime() + 1000*60*60*24);
		System.out.println(date.compareTo(date2));//compareTo
		System.out.println(date.equals(date2));//equals
	}
	
	/**
	 * 构造函数
	 */
	@SuppressWarnings({ "deprecation", "unused" })
	public static void constructor(){
		Date date = new Date();
		Date date2 = new Date(date.getTime() + 1000*60*60*24);
		System.out.println(date);
		System.out.println(date.toGMTString());
		System.out.println(date.toLocaleString());
		System.out.println(date2.toString());
		/**
		 * 四个废弃构造函数
		 */
		Date date3 = new Date(2017, 12, 21);
		Date date4 = new Date(2017, 12, 1, 11, 11);
		Date date5 = new Date(2017, 10, 5, 10, 5, 2);
		Date date6 = new Date("2017/10/10");
		System.out.println(date6);
	}

}
