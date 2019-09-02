package com.zzw.java1000000.z1019580.DecimalFormat.DecimalFormat;

import java.text.DecimalFormat;

public class DecimalFormatDemo {
	
	public static String SimpleFormat(String pattern, double value){
		DecimalFormat decimalFormat = new DecimalFormat(pattern);
		String result = decimalFormat.format(value);
		System.out.println(value + " " + pattern + " " + result);
		return result;
	}
	
	public static String useApplyPatternFormat(String pattern, double value){
		DecimalFormat decimalFormat = new DecimalFormat();
		decimalFormat.applyPattern(pattern);
		String result = decimalFormat.format(value);
		System.out.println(value + " " + pattern + " " + result);
		return result;
	}

}
