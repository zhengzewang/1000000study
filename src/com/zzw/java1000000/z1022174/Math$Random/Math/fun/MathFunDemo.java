package com.zzw.java1000000.z1022174.Math$Random.Math.fun;

public class MathFunDemo {
	
	public static void main(String[] args) {
		constant();
		System.out.println();
		exponential();
		System.out.println();
		rounding();
		System.out.println();
		MaxMinEg();
	}
	
	/**
	 * 最大、最小、绝对值
	 */
	public static void MaxMinEg(){
		//重载了4种方法，分别为float/double/int/long
		System.out.println(Math.max(12.3, 52.2));
		System.out.println(Math.min(25, 30));
		System.out.println(Math.abs(-20));
	}
	
	/**
	 * 取整函数
	 */
	public static void rounding(){
		//取整函数
		System.out.println(Math.ceil(2.3));//3.0
		System.out.println(Math.floor(2.3));//2.0
		System.out.println(Math.rint(2.4));//2.0
		System.out.println(Math.rint(2.6));//3.0
		System.out.println(Math.rint(2.5));//2.0
		System.out.println(Math.rint(3.5));//4.0
		System.out.println(Math.round(2.4));//2
		System.out.println(Math.round(2.6));//3
		System.out.println(Math.round(2.5f));//3
		System.out.println(Math.round(3.5f));//4
	}
	
	/**
	 * 指数函数
	 */
	public static void exponential(){
		//指数函数
		System.out.println(Math.exp(2));//7.38905609893065
		System.out.println(Math.log(Math.E));//1.0
		System.out.println(Math.log10(100));//2.0
		System.out.println(Math.sqrt(4));//2.0
		System.out.println(Math.cbrt(27));//3.0
		System.out.println(Math.pow(3, 4));//81.0
	}
	
	/**
	 * 三角函数
	 */
	public static void trigonometric(){
		//三角函数
		System.out.println(Math.sin(Math.PI/2));//1.0
		System.out.println(Math.cos(Math.PI/2));//6.123233995736766E-17（近似于0）
		System.out.println(Math.tan(Math.PI/4));//0.9999999999999999（近似于1）
		System.out.println(Math.asin(1));//1.5707963267948966（π/2）
		System.out.println(Math.acos(1));//0.0
		System.out.println(Math.atan(1));//0.7853981633974483（π/4）
		System.out.println(Math.toRadians(180));//3.141592653589793（π）
		System.out.println(Math.toDegrees(Math.PI));//180.0
	}
	
	/**
	 * 常量
	 */
	public static void constant(){
		System.out.println(Math.E);
		System.out.println(Math.PI);
	}

}
