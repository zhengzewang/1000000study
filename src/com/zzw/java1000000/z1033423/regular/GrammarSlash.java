package com.zzw.java1000000.z1033423.regular;

import java.util.regex.Pattern;

public class GrammarSlash {
	
	public static void main(String[] args) {
		String regex = "\\d";//不是\d，是\\d
		System.out.println(Pattern.matches(regex, "1"));
		System.out.println(Pattern.matches(regex, "s"));
	}

}
