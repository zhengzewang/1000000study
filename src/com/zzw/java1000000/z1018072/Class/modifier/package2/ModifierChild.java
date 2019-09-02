package com.zzw.java1000000.z1018072.Class.modifier.package2;


import com.zzw.java1000000.z1018072.Class.modifier.package1.ModifierParent;

public class ModifierChild extends ModifierParent {
	
	public void test(){
//		System.out.println(privateStr);//编译报错
		System.out.println(protectedStr);
		System.out.println(publicStr);
//		System.out.println(defaultStr);//编译报错
//		privateFun();//编译报错
		protectedFun();
		publicFun();
//		defaultFun();//编译报错
		System.out.println(new publicInnerClass());
		System.out.println(new protectedInnerClass());
//		System.out.println(new privateInnerClass());//编译报错
//		System.out.println(new defaultInnerClass());//编译报错
	}
	
	public static void main(String[] args) {
		new ModifierChild().test();
		System.out.println(new ModifierChild().new protectedInnerClass());
	}

}