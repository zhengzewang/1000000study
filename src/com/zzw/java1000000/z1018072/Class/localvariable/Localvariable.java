package com.zzw.java1000000.z1018072.Class.localvariable;

public class Localvariable {
	
	private String id;
	
	{
		String temp = "temp";
		setId(temp);
	}
	
	public Localvariable(String id) {
		this.setId(id);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public static void main(String[] args) {
		Localvariable localvariable = new Localvariable("id");
		System.out.println(localvariable.getId());
	}

}
