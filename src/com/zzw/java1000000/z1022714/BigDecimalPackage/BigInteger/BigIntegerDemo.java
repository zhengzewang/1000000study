package com.zzw.java1000000.z1022714.BigDecimalPackage.BigInteger;

import java.math.BigInteger;

public class BigIntegerDemo {

	public static void main(String[] args) {
		bigIntegerConstructor();
		System.out.println();
		commonMethod();
	}
	
	/**
	 * 常用方法
	 */
	public static void commonMethod(){
		//加减乘除/取余
		BigInteger bigInteger = new BigInteger("8");
		System.out.println(bigInteger.add(new BigInteger("2")));//加
		System.out.println(bigInteger.subtract(new BigInteger("3")));
		System.out.println(bigInteger.multiply(new BigInteger("3")));
		System.out.println(bigInteger.divide(new BigInteger("2")));
		System.out.println(bigInteger.remainder(new BigInteger("3")));
		System.out.println(bigInteger.divideAndRemainder(new BigInteger("3"))[0]);
		//
		System.out.println(bigInteger.pow(3));//3次方
		System.out.println(bigInteger.negate());//相反数，如10的相反数是-10
		//位操作
		System.out.println(bigInteger.shiftLeft(2));//左移n位，同int的位运算相同
		System.out.println(bigInteger.shiftRight(2));//右移n位，同int的位运算相同
		System.out.println(bigInteger.and(new BigInteger("9")));//与操作
		System.out.println(bigInteger.or(new BigInteger("4")));//或操作
		System.out.println(bigInteger.xor(new BigInteger("3")));//异或
		System.out.println(bigInteger.not());//非操作
		System.out.println(bigInteger.andNot(new BigInteger("8")));//先将参数进行非操作，再与调用对象进行与操作
		//
		System.out.println(bigInteger.compareTo(new BigInteger("1")));
		System.out.println(bigInteger.equals(new BigInteger("8")));
		System.out.println(bigInteger.min(new BigInteger("10")));
		System.out.println(bigInteger.max(new BigInteger("10")));
	}

	
	/**
	 * BigInteger构造方法
	 */
	public static void bigIntegerConstructor(){
		//常用构造方法
		BigInteger bigInteger = new BigInteger("1000");
		BigInteger bigInteger2 = new BigInteger("10", 2);
		System.out.println(bigInteger);
		System.out.println(bigInteger2);
	}
	
}
