package com.zzw.java1000000.z1007682.variable;

public class VariableParent {

	private String id = "parent_id";//子类啥都不干
	private String code = "parent_code";//子类定义一个同名属性，但不重写get和set方法
	private String name = "parent_name";//子类定义一个同名属性，并且重写get和set方法

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	
	public static void method(){
		String id = new VariableParent().id;
	}

	
}
