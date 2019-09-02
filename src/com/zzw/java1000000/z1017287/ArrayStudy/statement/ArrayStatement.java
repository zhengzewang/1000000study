package com.zzw.java1000000.z1017287.ArrayStudy.statement;

import java.util.Date;

public class ArrayStatement {
	
	public static void main(String[] args) {
		int[] is = new int[5];
		String[] strings = new String[5];
		Object[] objects = {new Object(),new Object(),new Object(),new Object(),new Object()};
		Date[] dates = new Date[]{new Date(),new Date(),new Date(),new Date(),new Date()};
		for (int i = 0; i < is.length; i++) {
			System.out.println(is[i]);
		}
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		for (int i = 0; i < objects.length; i++) {
			System.out.println(objects[i]);
		}
		for (int i = 0; i < dates.length; i++) {
			System.out.println(dates[i]);
		}
	}

}
