package com.zzw.java1000000.z1007917.constant;

public class MethodFour {
	//private static final变量
	private final static String SUNDAY = "SUNDAY";
	private final static String MONDAY = "MONDAY";
	private final static String TUESDAY = "TUESDAY";
	private final static String WEDNESDAY = "WEDNESDAY";
	private final static String THURSDAY = "THURSDAY";
	private final static String FRIDAY = "FRIDAY";
	private final static String SATURDAY = "SATURDAY";
	//通过static get方法获取private常量
	public static String getSunday() {
		return SUNDAY;
	}
	public static String getMonday() {
		return MONDAY;
	}
	public static String getTuesday() {
		return TUESDAY;
	}
	public static String getWednesday() {
		return WEDNESDAY;
	}
	public static String getThursday() {
		return THURSDAY;
	}
	public static String getFriday() {
		return FRIDAY;
	}
	public static String getSaturday() {
		return SATURDAY;
	}
}
