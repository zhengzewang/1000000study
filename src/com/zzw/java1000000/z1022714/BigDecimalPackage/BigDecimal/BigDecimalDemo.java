package com.zzw.java1000000.z1022714.BigDecimalPackage.BigDecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalDemo {
	
	public static void main(String[] args) {
		bigDecimalConstructor();
		System.out.println();
		commonMethod();
		System.out.println();
		testRoundingMode();
	}
	
	/**
	 * 常用方法
	 */
	public static void commonMethod(){
		BigDecimal bigDecimal = new BigDecimal("3.14159265358979323846");
		MathContext mathContext = new MathContext(10, RoundingMode.HALF_UP);
		//
		System.out.println(bigDecimal.add(new BigDecimal("3.14159265358979323846")));
		System.out.println(bigDecimal.add(bigDecimal, mathContext));
		System.out.println(bigDecimal.subtract(bigDecimal.divide(new BigDecimal("2"))));
		System.out.println(bigDecimal.multiply(new BigDecimal("2")));
		System.out.println(bigDecimal.divide(new BigDecimal("2")));
		System.out.println(bigDecimal.divide(bigDecimal, 4, BigDecimal.ROUND_HALF_UP));
		//
		System.out.println(bigDecimal.compareTo(new BigDecimal("10")));
		System.out.println(bigDecimal.equals(new BigDecimal("10")));
		System.out.println(bigDecimal.min(new BigDecimal("10")));
		System.out.println(bigDecimal.max(new BigDecimal("10")));
		
	}
	
	/**
	 * 模式常量
	 */
	public static void testRoundingMode(){
		BigDecimal bigDecimal = new BigDecimal("3.1415");
		BigDecimal one = new BigDecimal("1");
		System.out.println(bigDecimal.divide(one, 3, BigDecimal.ROUND_UP));
		System.out.println(bigDecimal.divide(one, 3, BigDecimal.ROUND_DOWN));
		System.out.println(bigDecimal.divide(one, 3, BigDecimal.ROUND_CEILING));
		System.out.println(bigDecimal.divide(one, 3, BigDecimal.ROUND_FLOOR));
		System.out.println(bigDecimal.divide(one, 3, BigDecimal.ROUND_HALF_DOWN));
		System.out.println(bigDecimal.divide(one, 3, BigDecimal.ROUND_HALF_UP));
		System.out.println(bigDecimal.divide(one, 3, BigDecimal.ROUND_HALF_EVEN));
		
		System.out.println(new BigDecimal("-3.1415").divide(one, 3, BigDecimal.ROUND_CEILING));
		System.out.println(new BigDecimal("3.1415").divide(one, 3, BigDecimal.ROUND_CEILING));
		System.out.println(new BigDecimal("-3.1415").divide(one, 3, BigDecimal.ROUND_FLOOR));
		System.out.println(new BigDecimal("3.1415").divide(one, 3, BigDecimal.ROUND_FLOOR));
		System.out.println(new BigDecimal("3.1415").divide(one, 3, BigDecimal.ROUND_HALF_EVEN));
		System.out.println(new BigDecimal("3.1425").divide(one, 3, BigDecimal.ROUND_HALF_EVEN));
	}
	
	
	/**
	 * 常用构造法方法
	 */
	public static void bigDecimalConstructor(){
		BigDecimal bigDecimal1 = new BigDecimal("3.1415926");
		BigDecimal bigDecimal2 = new BigDecimal(3.1415926);
		System.out.println(bigDecimal1.equals(bigDecimal2));
	}

}
