package com.zzw.java1000000.z1011448.StringDeep.intern;

import java.math.BigDecimal;
import java.math.BigInteger;

public class InternDemo {
	
	public static void main(String[] args) {
//		String test = "22222";
		BigDecimal bigDecimal = new BigDecimal(new BigInteger("11111"));
		bigDecimal = bigDecimal.add(bigDecimal);
		String str = bigDecimal.toString();
		System.out.println(str.intern()==str);
		System.out.println(str=="22222");
	}

}
