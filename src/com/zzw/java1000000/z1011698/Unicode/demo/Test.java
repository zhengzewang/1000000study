package com.zzw.java1000000.z1011698.Unicode.demo;

public class Test {
	
	public static void main(String[] args) {
		char c1 = '郑';//FFFF
//		char c2 = '𢀖';//
		//unicode
		System.out.println(Translate.convert("郑"));
		System.out.println(Translate.convert("𢀖"));//实际为0x22016(十六进制)
		
		System.out.println("郑".length());
		System.out.println("𢀖".length());
		
		//utf-8
		System.out.println(TranslateUTF8.convert("郑"));
		System.out.println(TranslateUTF8.convert("𢀖"));
	}

}
