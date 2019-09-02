package com.zzw.java1000000.z1018072.Class.member;

public class Person {
	
	private String name;//姓名
	private String sex;//性别
	
	/*
	 * 省略geter和seter
	 */
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public void study(){
		System.out.println("I am studying");
	}
	
}
