package com.zzw.java1000000.z1011203.String.operation;

public class OperationDemo {
	
	public static void main(String[] args) {
		String str = "my name is zhengzewang ";
		
		System.out.println(str.substring(11));
		System.out.println(str.substring(3, 7));
//		System.out.println(str.substring(30));//抛出异常
//		System.out.println(str.substring(6, 3));//抛出异常
		
		System.out.println(str.trim());
		
		System.out.println(str.replace('m', 'n'));
		System.out.println(str.replace('b', 'n'));//没有b
		System.out.println(str.replace("ng", "n"));//String实现了CharSequence
		System.out.println(str.replaceAll("ng", "n"));
		System.out.println(str.replaceFirst("ng", "n"));
		
		System.out.println(str.startsWith("m"));
		System.out.println(str.startsWith("n", 3));
		System.out.println(str.endsWith("g"));
		System.out.println(str.endsWith(" "));
		
		System.out.println(str.equals("my name is zhengzewang "));
		System.out.println(str.equals("my name is zhengzewang ".trim()));
		System.out.println(str.equals("my name is ZhengZewang "));
		System.out.println(str.equalsIgnoreCase("my name is ZhengZewang "));
		
		System.out.println(str.compareTo("my name is zhengzewang "));
		System.out.println(str.compareTo("my name is zhengzewang ".trim()));
		System.out.println(str.compareTo("my name is ZhengZewang "));
		System.out.println(str.compareToIgnoreCase("my name is ZhengZewang "));
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		String [] arr1 = str.split(" ");
		String [] arr2 = str.split("b",6);
		String [] arr3 = str.split("b");
		System.out.println();
		System.out.println(arr1.length);
		for(String string:arr1){
			System.out.println(string);
		}
		System.out.println();
		System.out.println(arr2.length);
		for(String string:arr2){
			System.out.println(string);
		}
		System.out.println();
		System.out.println(arr3.length);
		for(String string:arr3){
			System.out.println(string);
		}
		
		System.out.println((int)'a');//97
		System.out.println((int)'A');//65
	}
}
