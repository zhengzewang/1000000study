package com.zzw.java1000000.z1011327.StringFormat.format;

import java.util.Date;

public class FormatCommonDemo {
	public static void main(String[] args) {
		System.out.println(String.format("%B", 1 == 2));//FALSE
		System.out.println(String.format("%h", new Date()));//11aaf016
		System.out.println(String.format("%s", new FormatCommonDemo()));//Test
		System.out.println(String.format("%S", new FormatCommonDemo()));//TEST
		System.out.println(String.format("%c", 97));//a
		System.out.println(String.format("%d", 0x12));//18
		System.out.println(String.format("%o", 18));//22
		System.out.println(String.format("%x", 18));//12
		System.out.println(String.format("%e", 115234.2));//1.152342e+05
		System.out.println(String.format("%f", 115234546546545645456484544.2));//115234546546545650000000000.000000
		System.out.println(String.format("%g", 115234.2));//115234
		System.out.println(String.format("%g", 115234546546545645456484544.2));//1.15235e+26
		System.out.println(String.format("%a", 115234.2));//0x1.c222333333333p16
		System.out.print(String.format("%n"));//
		//组合型、占位符
		System.out.println(String.format("测试类输出为：%s%n今天买水果花了%g", new FormatCommonDemo(),4.5*1.3));
		//测试类输出为：Test
		//今天买水果花了5.85000
	}
	@Override
	public String toString() {
		return "Test";
	}
}
