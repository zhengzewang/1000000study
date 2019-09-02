package com.zzw.java1000000.z1018072.Class.Static;

public class StaticDemo {
	
	public static String staticStr = "staticStr";
	
	static {
		System.out.println("static code block");
	}
	
	{
		System.out.println("code block");
	}
	
	public StaticDemo() {
		System.out.println("constructor");
	}
	
	public static void staticFun(){
		System.out.println("static function");
	}
	
	public void fun(){
//		static String test = "test";//编译报错
	}

}
