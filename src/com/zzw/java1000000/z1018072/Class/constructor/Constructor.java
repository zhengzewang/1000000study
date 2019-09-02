package com.zzw.java1000000.z1018072.Class.constructor;

import java.util.UUID;

public class Constructor {
	
	private String id;
	private String name;
	private int age;
	
	public Constructor() {
		this(UUID.randomUUID().toString());
	}
	
	Constructor(String id){
		this(id,"name");
	}
	
	protected Constructor(String id, String name){
		this(id,name,1);
	}
	
	private Constructor(String id, String name, int age){
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
		
	}

}
