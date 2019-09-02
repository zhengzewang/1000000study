package com.zzw.java1000000.z1018396.Packingclass.Integer;

public class IntegerDemo {
	
	public static void main(String[] args) {
		
		Integer integer = new Integer("200");
		Integer int_i = 300;
		Integer integer2 = new Integer(200);
		
		byte b = integer.byteValue();
		System.out.println(integer.compareTo(integer2));
		System.out.println(integer.equals(integer2));
		int i = integer.intValue();
		short s = integer.shortValue();
		float f = integer.floatValue();
		double d = integer.doubleValue();
		long l = integer.longValue();
		System.out.println(integer.toString());
		Integer integer3 = Integer.valueOf("13");
		System.out.println(Integer.valueOf("10", 2));
		int j = Integer.parseInt("2");
		System.out.println(Integer.parseInt("12", 16));
		
		System.out.println(Integer.toBinaryString(Integer.MAX_VALUE));//二进制
		System.out.println(Integer.toHexString(integer));//十六进制
		System.out.println(Integer.toOctalString(integer));//八进制
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
//		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.TYPE);
		
	}

}
