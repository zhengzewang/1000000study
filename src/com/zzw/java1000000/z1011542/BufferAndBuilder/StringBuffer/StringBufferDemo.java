package com.zzw.java1000000.z1011542.BufferAndBuilder.StringBuffer;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		
		StringBuffer buffer = new StringBuffer("This is a StringBuffer ");
		
		buffer.append("Object");//重载了各种数据类型参数
		buffer.reverse();//翻转
		buffer.reverse();//翻转
		buffer.delete(0, 10);
		buffer.insert(0, "this is a ");//重载了各种类型
		buffer.replace(8, 10, "");
		//以上返回值均为StringBuffer，但均可以不用接受返回
		System.out.println(buffer.capacity());
		System.out.println(buffer.charAt(8));
		buffer.ensureCapacity(100);
		System.out.println(buffer.capacity());
		char [] cs = new char[10] ;
		buffer.getChars(5, 10, cs, 2);
		System.out.println(cs);
		System.out.println(buffer.indexOf("Ob"));
		System.out.println(buffer.indexOf(""));
		System.out.println(buffer.lastIndexOf("i"));
		System.out.println(buffer.length());
		buffer.setCharAt(8, 'a');
		buffer.setLength(30);
		System.out.println(buffer.subSequence(0, 5));
		System.out.println(buffer.substring(0, 5));
		System.out.println(buffer.toString());
		
	}

}
