package com.zzw.java1000000.z1011203.String.String;

public class InternDemo {
	
	public static void main(String[] args) {
		
//		String str2 = "helloword";//有这一行和没有这一行结果完全不同
	    String str1 = new String("hello")+ new String("word");      
	    System.out.println(str1.intern() == str1);   
//	    str1=str1.intern();//不管何种情况，加入这行代码都会使下一行代码为true。
	    System.out.println(str1 == "helloword");  
		
	}

}
