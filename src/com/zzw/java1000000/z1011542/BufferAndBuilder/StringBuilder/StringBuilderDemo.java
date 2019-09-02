package com.zzw.java1000000.z1011542.BufferAndBuilder.StringBuilder;

public class StringBuilderDemo {
	
	public static void main(String[] args) {
		StringBuilder builder = new StringBuilder("This is a StringBuffer ");
		
		builder.append("Object");//重载了各种数据类型参数
		builder.reverse();//翻转
		builder.reverse();//翻转
		builder.delete(0, 10);
		builder.insert(0, "this is a ");//重载了各种类型
		builder.replace(8, 10, "");
		//以上返回值均为StringBuffer，但均可以不用接受返回
		System.out.println(builder.capacity());
		System.out.println(builder.charAt(8));
		builder.ensureCapacity(100);
		System.out.println(builder.capacity());
		char [] cs = new char[10] ;
		builder.getChars(5, 10, cs, 2);
		System.out.println(cs);
		System.out.println(builder.indexOf("Ob"));
		System.out.println(builder.indexOf(""));
		System.out.println(builder.lastIndexOf("i"));
		System.out.println(builder.length());
		builder.setCharAt(8, 'a');
		builder.setLength(30);
		System.out.println(builder.subSequence(0, 5));
		System.out.println(builder.substring(0, 5));
		System.out.println(builder.toString());
	}

}
