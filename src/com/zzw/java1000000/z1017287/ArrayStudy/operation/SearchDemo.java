package com.zzw.java1000000.z1017287.ArrayStudy.operation;

import java.util.Arrays;

public class SearchDemo {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		String[] strings = {"zzw","wjy","ycl","wzy","wxl"};
		System.out.println(arraySearch(strings,"wjy"));
		Arrays.sort(strings);//采用二分法查询必须先排序
		System.out.println(Arrays.toString(strings));
		int index = Arrays.binarySearch(strings, "wzy");
		System.out.println(index);
		
		
		
		//test clone
		SortTestClass sortTestClass = new SortTestClass("test");
		SortTestClass sortTestClassClone = (SortTestClass) sortTestClass.clone();
		sortTestClassClone.setId("测试");
		System.out.println(sortTestClass.getId());
		System.out.println(sortTestClassClone.getId());
		
	}

	public static int arraySearch(Object[] objects, Object object) {
		int index = -1;
		for (int i = 0; i < objects.length; i++) {
			if(objects[i].equals(object)){
				index = i;
				break;
			}
		}
		return index;
	}

}
