package com.zzw.java1000000.z1017287.ArrayStudy.operation;


import java.util.Arrays;

public class CopyDemo {

	public static void main(String[] args) {
		String[] strings = {"zzw","wjy","ycl","wzy","wxl"};
		String[] strings2 = strings.clone();
		strings2[2] = "test";
		System.out.println(strings == strings2);
		System.out.println(Arrays.toString(strings));
		System.out.println(Arrays.toString(strings2));
		
		SortTestClass[] testClasses = {new SortTestClass("zzw"),
				new SortTestClass("wjy"),new SortTestClass("ycl"),
				new SortTestClass("wzy"),new SortTestClass("wxl")};
		SortTestClass[] testClasses1 = testClasses;
		SortTestClass[] testClasses2 = Arrays.copyOf(testClasses, testClasses.length);
		System.out.println(testClasses == testClasses1);//true
		System.out.println(testClasses == testClasses2);//false
		System.out.println(testClasses[0] == testClasses2[0]);//true
		//指定返回类型
//		Parent[] parents = Arrays.copyOf(testClasses, testClasses.length, Child[].class);//运行时抛出异常
		//SortTestClassParent是SortTestClass的父类
		//用父类的引用parents指向子类的实例
		SortTestClassParent[] parents = Arrays.copyOf(testClasses, testClasses.length, SortTestClassParent[].class);
		System.out.println(parents[0]);
		
		//copyOfRange
		SortTestClass[] sortTestClass = Arrays.copyOfRange(testClasses, 1, 3);
		System.out.println(Arrays.toString(sortTestClass));
		SortTestClassParent[] parents2 = Arrays.copyOfRange(testClasses, 1, 3 , SortTestClassParent[].class);
		System.out.println(Arrays.toString(parents2));
	}

}

class Parent{
	
}

class Child extends Parent{
	
}
