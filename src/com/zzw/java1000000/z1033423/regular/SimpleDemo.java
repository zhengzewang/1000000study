package com.zzw.java1000000.z1033423.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleDemo {
	public static void main(String[] args) {
		System.out.println(isMobile("15388951793"));
		System.out.println(isMobile("1153889517931"));
		System.out.println(isMobile2("17621963326"));
		System.out.println(isMobile2("1176219633261"));
		System.out.println(isContainMobile("15388951793"));
		System.out.println(isContainMobile("1176219633261"));
	}
	/**
	 * @param str
	 * @return
	 */
	private static boolean isMobile(String str){
		String mobile = "^1[3|4|5|7|8][0-9]\\d{8}$";
		return Pattern.matches(mobile, str);
	}
	/**
	 * 匹配
	 * @param str
	 * @return
	 */
	private static boolean isMobile2(String str){
		String mobile = "^1[3|4|5|7|8][0-9]\\d{8}$";
		Pattern pattern = Pattern.compile(mobile);
		Matcher matcher = pattern.matcher(str);
		return matcher.matches();
	}
	/**
	 * 检索
	 * @param str
	 * @return
	 */
	private static boolean isContainMobile(String str){
		String mobile = "1[3|4|5|7|8][0-9]\\d{8}";
		Pattern pattern = Pattern.compile(mobile);
		Matcher matcher = pattern.matcher(str);
		return matcher.find();
	}
}
