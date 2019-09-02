package com.zzw.java1000000.z1011698.Unicode.Complement;

import java.io.UnsupportedEncodingException;

public class Complement {
	
	/**
	 * test
	 * @param args
	 * @throws UnsupportedEncodingException
	 */
	public static void main(String[] args) throws UnsupportedEncodingException {
		String zheng = "𢀖";
		byte [] bs = new byte[100];
		bs = zheng.getBytes("UTF-16");
		for (int i = 0; i < bs.length; i++) {
			System.out.print(convert(bs[i])+" ");
		}
		bs = zheng.getBytes("UTF-8");
		System.out.println();
		for (int i = 0; i < bs.length; i++) {
			System.out.print(convert(bs[i])+" ");
		}
		
		
		
//		char c = '郑';
//		short s = (short) c;
//		System.out.print(convert(s));
	}
	
	/**
	 * 返回整数byte的二进制补码
	 * @param number
	 * @return
	 */
	public static String convert(byte number){
		int length = 8;//1个字节，8位长度
		StringBuilder builder = new StringBuilder("");
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
	
	/**
	 * 返回整数short的二进制补码
	 * @param number
	 * @return
	 */
	public static String convert(short number){
		int length = 16;//2个字节，16位长度
		StringBuilder builder = new StringBuilder("");
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
	
	/**
	 * 返回整数int的二进制补码
	 * @param number
	 * @return
	 */
	public static String convert(int number){
		int length = 32;//4个字节，32位长度
		StringBuilder builder = new StringBuilder("");
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
