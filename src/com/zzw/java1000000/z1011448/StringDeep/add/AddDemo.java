package com.zzw.java1000000.z1011448.StringDeep.add;

import java.util.Date;

public class AddDemo {
	
	public static void main(String[] args) {
		String s = "a" + "b" + "c";
		String s1 = "a";
		String s2 = "b";
		String s3 = "c";
		String s4 = s1 + s2 + s3;
		//=====================>>
		StringBuilder sb = new StringBuilder();
		sb.append("a").append("b").append("c");
		s = sb.toString();
		
		String str = null;
		for(int i=0; i<100 ; i++){
			str += "a";
		}
		System.out.println(str);
		
		
		///////
		Date start = new Date();
		String string = "";
		for (int i = 0; i < 10000; i++) {
			string += "b";
		}
		System.out.println(string.length());
		Date end = new Date();
		System.out.println("用String连接符+进行字符串连接花费时间："+(end.getTime()-start.getTime()));
		start = new Date();
		StringBuilder stringBuilder = new StringBuilder("");
		for (int i = 0; i < 10000; i++) {
			stringBuilder.append("b");
		}
		System.out.println(stringBuilder.length());
		end = new Date();
		System.out.println("用StringBuilder的append进行字符串连接花费时间："+(end.getTime()-start.getTime()));
		
	}

}
