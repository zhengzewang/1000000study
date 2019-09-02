package com.zzw.java1000000.z1011698.Unicode.JavaCode;

import java.io.UnsupportedEncodingException;

public class JavaStringCode {
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		
		String str = "郑泽旺";
		
		//指定用何种编码方式读取字符串
		byte [] utf8bs = str.getBytes("UTF-8");//得到字符的UTF-8编码字节
		byte [] utf16bs = str.getBytes("UTF-16");//得到字符的UTF-16编码字节
		
		//必须以正确的编码方式读取字节，才能获得正确的字符串
		//指定用何种方式读取字节
		String str1 = new String(utf8bs, "UTF-8");
		String str2 = new String(utf16bs, "UTF-16");
		
		System.out.println(str1);
		System.out.println(str2);
		
	}

}
