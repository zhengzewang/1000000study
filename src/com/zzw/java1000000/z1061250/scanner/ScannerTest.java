package com.zzw.java1000000.z1061250.scanner;

import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("输入第一个数：");
		String str1 = scanner.nextLine();
		System.out.print("输入第二个数：");
		String str2 = scanner.nextLine();
		Integer i = Integer.valueOf(str1);
		Integer j = Integer.valueOf(str2);
		System.out.println(str1 + "+" + str2 + "=" + (i+j));
		scanner.close();
	}

}
