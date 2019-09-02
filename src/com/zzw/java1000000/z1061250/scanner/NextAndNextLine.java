package com.zzw.java1000000.z1061250.scanner;

import java.util.Scanner;

public class NextAndNextLine {
	
	public static void main(String[] args) {
//		test1();
//		test2();
//		test3();
		test5();
//		nextTest(scanner);
//		nextLineTest(scanner);
		// 获取数据  
//		if (scanner.hasNext()) {
//			System.out.println(1);
//		}
//		if (scanner.hasNext()) {
//			System.out.println(2);
//		}
//        if (scanner.hasNextInt()) {  
//            int i = scanner.nextInt();  
//            System.out.println("i:" + i);  
//        } else if (scanner.hasNextFloat()) {  
//            float f = scanner.nextFloat();  
//            System.out.println("f:" + f);  
//        } else if (scanner.hasNextBoolean()) {  
//            boolean b = scanner.nextBoolean();  
//            System.out.println("b:" + b);  
//        } else if (scanner.hasNext()) {  
//            String s = scanner.next();  
//            System.out.println("s:" + s);  
//        } else {  
//            System.out.println("您好,您当前输入的数据无效！");  
//        }
	}
	
	private static void test5() {
		Scanner scanner = new Scanner(System.in);
		int i = 0;
		scanner.hasNext();
		System.out.println("while开始");
		while (scanner.hasNext()) {
			System.out.println("while");
			System.out.println(scanner.next());
			i++;
			if (i>0) {
				break;
			}
		}
	}
	
	private static void test4() {
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNextInt()) {
			int i = scanner.nextInt();
			System.out.println("i：" + i);
		} else if (scanner.hasNextFloat()) {
			float f = scanner.nextFloat();
			System.out.println("f：" + f);
		} else if (scanner.hasNext()) {
			String s = scanner.next();
			System.out.println("s：" + s);
		}
	}
	
	private static void test3() {
		Scanner scanner = new Scanner(System.in);
		if (scanner.hasNext()) {
			System.out.println("11");
		}
		if (scanner.hasNext()) {
			System.out.println(scanner.next());
			System.out.println(scanner.next());
		}
	}
	
	private static void test2() {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		System.out.println(str);
//		scanner.close();
	}
	
	private static void test1() {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		System.out.println(str);
//		scanner.close();
	}
	
	private static void nextTest(Scanner scanner) {
		System.out.println("请输入：");
		int i = 1;
		while (scanner.hasNext()) {
			System.out.println("第" + (i++) + "次输入");
			System.out.println(scanner.next());
		}
	}
	
	private static void nextLineTest(Scanner scanner) {
		System.out.println("请输入：");
		while (scanner.hasNextLine()) {
			System.out.println(scanner.nextLine());
		}
	}

}
