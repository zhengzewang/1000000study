package com.zzw.java1000000.z1011698.Unicode.demo;

import java.io.UnsupportedEncodingException;

/**
 * 字符串转UTF-8编码
 * @author zhengzewang
 *
 */
public class TranslateUTF8 {
	
	public static void main(String[] args) {
		System.out.println(convert("郑"));
	}

	public static String convert(String str){
		byte [] bs = new byte[str.length()*3];//unicode编码在2位之内的，string的length都是1，utf-8最大可能占用的字节为3。
		try {
			bs = str.getBytes("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		StringBuffer sb = new StringBuffer("");
		for (int i = 0; i < bs.length; i++) {
			sb.append(convert(bs[i]));
		}
		return sb.toString();
	}
	

	/**
	 * 返回整数byte的二进制补码
	 * @param number
	 * @return
	 */
	private static String convert(byte number){
		int length = 8;//1个字节，8位长度
		StringBuffer builder = new StringBuffer("");
		for (int i = length-1; i >= 0; i--) {
			//每一位和1比较，如果为0表示对应的位数为0，如果为1表示对应的位数为1
			if(((1<<i)&number) == 0){
				builder = builder.append("0");
			}else {
				builder = builder.append("1");
			}
		}
		return builder.toString();
	}
	
}
