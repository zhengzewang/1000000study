package com.zzw.java1000000.z1018072.Class.This;

public class ThisDemo {
	
	private String id;
	
	public ThisDemo(){
		this("id");
	}
	public ThisDemo(String id){
		this.id = id;
	}
	
	public void fun(ThisDemo demo){
		System.out.println(demo.id);
	}
	
	public void testFun(){
		fun(this);
	}
	
//	public static void staticFun(){//static方法中不能使用this
//		fun(this);
//	}
	
	public static void main(String[] args) {
		new ThisDemo().testFun();
	}

}
