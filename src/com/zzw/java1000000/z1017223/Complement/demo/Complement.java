package com.zzw.java1000000.z1017223.Complement.demo;

public class Complement {
	
	public static void main(String[] args) throws IllegalAccessException {
		System.out.println(revertInt("11111111111111111111111111110100"));
	}
	
	/**
	 * 将二进制补码字符串转化为int型整数
	 * @param str
	 * @return
	 */
	public static int revertInt(String str){
		int result = 0;
		int length = 32;
		StringBuffer buffer = new StringBuffer(str);
		if(buffer.length() < length){
			while(buffer.length() < length){
				buffer = buffer.insert(0, "0");
			}
		}
		for (int i = 0; i < length; i++) {
			if(buffer.charAt(i) == '1'){
				result = result | (1<<(length-i-1));
			}
		}
		return result;
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
	
	/**
	 * 返回整数int的二进制补码
	 * @param number
	 * @return
	 */
	public static String convert(long number){
		int length = 64;//4个字节，32位长度
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
