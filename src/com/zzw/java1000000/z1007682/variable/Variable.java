package com.zzw.java1000000.z1007682.variable;

public class Variable {
	public static int i = 12;//类变量
	public int j = 13;//成员变量
	public int m,n;
	public int l;
	public int a = 0,b=1;
	public void method(){
		int k = 14;//局部变量
	}
	
	//测试默认值
	public static int default_int;//数值型
	public static char default_char;//char
	public static boolean default_bool;//bool型
	public static String default_str;//字符串 
	
	public static Variable default_object;//引用数据类型
	public static int [] default_int_arr;
	public static String [] default_str_arr;
	public static Variable [] default_obj_arr;
	
	public static void main(String[] args) {
		System.out.println(Variable.default_int);
		System.out.println(Variable.default_char);
		System.out.println(Variable.default_bool);
		System.out.println(Variable.default_str);
		System.out.println(Variable.default_object);
		System.out.println(Variable.default_int_arr);
		System.out.println(Variable.default_str_arr);
		System.out.println(Variable.default_obj_arr);
	}
}
