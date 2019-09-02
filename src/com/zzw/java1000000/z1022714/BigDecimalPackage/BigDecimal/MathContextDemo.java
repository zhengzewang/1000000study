package com.zzw.java1000000.z1022714.BigDecimalPackage.BigDecimal;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class MathContextDemo {
	
	public static void main(String[] args) {
		System.out.println(new BigDecimal("3.1415926",new MathContext(4, RoundingMode.CEILING)));
		System.out.println(new BigDecimal("3.1415926",new MathContext(4, RoundingMode.FLOOR)));
		System.out.println(new BigDecimal("3.1415926",new MathContext(4, RoundingMode.HALF_DOWN)));
		System.out.println(new BigDecimal("3.1415926",new MathContext(4, RoundingMode.HALF_UP)));
		System.out.println(new BigDecimal("3141.5926",new MathContext(3, RoundingMode.DOWN)));
	}

}
