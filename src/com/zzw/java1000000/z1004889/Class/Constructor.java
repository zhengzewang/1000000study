package com.zzw.java1000000.z1004889.Class;

import java.util.UUID;

public class Constructor {
	
	private String id;
	private String name;
	
	public Constructor() {
		setId(UUID.randomUUID().toString());
	}
	
	public Constructor(String name) {
		this();
		this.setName(name);
	}
	
	public Constructor(String id, String name) {
		this.setId(id);
		this.setName(name);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		Constructor constructor = new Constructor();
		Constructor constructor2 = new Constructor("test");
		
	}

}
