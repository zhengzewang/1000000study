package com.zzw.java1000000.z1018072.Class.codeblock;

public class CodeDemo {
	/**
	 * 构造代码块1
	 */
	{
		System.out.println("构造代码块1");
	}
	/**
	 * 静态代码块
	 */
	static {
		System.out.println("静态代码块");
	}
	/**
	 * 构造方法
	 */
	public CodeDemo() {
		System.out.println("构造方法");
	}
	/**
	 * 构造代码块2
	 */
	{
		System.out.println("构造代码块2");
	}
	//main方法
	public static void main(String[] args) {
		
		{//方法内代码块
			String str = "局部变量，作用为当前代码块";
		}
//		System.out.println(str);//编译报错
		new CodeDemo();
		
	}
}
