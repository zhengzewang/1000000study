package com.zzw.java1000000.z1022174.Math$Random.Random;

import java.util.Random;

public class RandomClass {
	
	public static void main(String[] args) {
		Random random = new Random();
		System.out.println(random.nextInt());//返回一个随机整数
		System.out.println(random.nextInt(1000));//左闭右开
		System.out.println(random.nextLong());
		System.out.println(random.nextBoolean());
		System.out.println(random.nextFloat());
		System.out.println(random.nextDouble());
		System.out.println(random.nextGaussian());
	}
	
	/**
	 * Random类的构造方法
	 */
	public static void randomConstructor(){
		Random random1 = new Random(1000);
		System.out.println(random1.nextLong());
		System.out.println(random1.nextLong());
		System.out.println(random1.nextInt(1000));
		System.out.println(random1.nextInt(1000));
		Random random2 = new Random(1000);//种子相同
		System.out.println(random2.nextLong());
		System.out.println(random2.nextLong());
		System.out.println(random2.nextInt(1000));
		System.out.println(random2.nextInt(1000));
	}

}
