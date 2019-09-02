package com.zzw.java1000000.z1071365.Object;

import java.util.HashMap;
import java.util.Map;

public class Test {
	
	public static void main(String[] args) {
		String str1 = new String("zzw");
		String str2 = new String("zzw");
		String str3 = new String("wjy");
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		//
		HashCodeObject object1 = new HashCodeObject("zzw","郑泽旺");
		HashCodeObject object2 = new HashCodeObject("zzw","郑泽旺");
		HashCodeObject object3 = new HashCodeObject("test","测试");
		System.out.println(object1.equals(object2));
		System.out.println(object1.hashCode());
		System.out.println(object2.hashCode());
		System.out.println(object3.hashCode());
		//
		Map<HashCodeObject, String> map = new HashMap<>();
		map.put(object1, "test");
		map.put(object2, "test");
		map.put(object3, "test");
		/**
		 * 将 HashCodeObject重写的hashCode方法去掉，将会得到不同的结果
		 */
		System.out.println(map.values().size());
	}
	

}
