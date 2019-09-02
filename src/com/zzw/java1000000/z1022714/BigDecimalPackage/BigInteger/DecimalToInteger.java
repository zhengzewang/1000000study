package com.zzw.java1000000.z1022714.BigDecimalPackage.BigInteger;

import java.math.BigDecimal;
import java.math.BigInteger;

public class DecimalToInteger {
	
	public static void main(String[] args) {
		System.out.println(isInt(new BigDecimal("12.36")));
		System.out.println(isInt(new BigDecimal("12.00")));
	}
	
	/**
	 * 判断是否为整数
	 * @param num
	 * @return
	 */
	private static boolean isInt(BigDecimal num){
		BigInteger bigInteger = num.toBigInteger();
		return num.compareTo(new BigDecimal(bigInteger)) == 0;
	}

}
