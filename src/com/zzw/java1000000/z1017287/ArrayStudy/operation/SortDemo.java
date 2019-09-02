package com.zzw.java1000000.z1017287.ArrayStudy.operation;

import java.util.Arrays;
import java.util.Comparator;

public class SortDemo {
	
	public static void main(String[] args) {
		int[] is = {2,5,6,8,4};
		Arrays.sort(is);
		System.out.println(Arrays.toString(is));
		String[] strings = {"zzw","wjy","ycl","wzy","wxl"};
		Arrays.sort(strings,2,4);
		System.out.println(Arrays.toString(strings));
		Arrays.sort(strings);
		System.out.println(Arrays.toString(strings));
		//
		SortTestClass[] testClasses = {new SortTestClass("zzw"),
				new SortTestClass("wjy"),new SortTestClass("ycl"),
				new SortTestClass("wzy"),new SortTestClass("wxl")};
		Arrays.sort(testClasses);
		System.out.println(Arrays.toString(testClasses));
		//
		SortTestClass2[] testClasses2 = {new SortTestClass2("zzw"),
				new SortTestClass2("wjy"),new SortTestClass2("ycl"),
				new SortTestClass2("wzy"),new SortTestClass2("wxl")};
		Arrays.sort(testClasses2, new Comparator<SortTestClass2>() {
			@Override
			public int compare(SortTestClass2 o1, SortTestClass2 o2) {
				// TODO Auto-generated method stub
				return o1.getId().compareTo(o2.getId());
			}
		});
		System.out.println(Arrays.toString(testClasses2));
	}

}
