package com.zzw.java1000000.z1033423.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GroupDemo {
	public static void main(String[] args) {
		System.out.println(testGroup());
	}
	/**
	 * groupCount
	 * @return
	 */
	private static int testGroup(){
		String str = "dsabcabc";
		String patt = "(ds)(abc)(a(bc))";
		Pattern pattern = Pattern.compile(patt);
		Matcher matcher = pattern.matcher(str);
		int count = matcher.groupCount();
		if (matcher.find()) {
			for (int i = 0; i <= count; i++) {
				System.out.println(matcher.group(i));
			}
		} else {
			System.out.println("没有匹配项");
		}
		return count;
	}
}
