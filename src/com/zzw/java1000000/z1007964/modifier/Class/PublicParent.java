package com.zzw.java1000000.z1007964.modifier.Class;

public class PublicParent {
	
	public String publicAtt = "parent public att";
	protected String protectedAtt = "parent protected att";
	private String privateAtt = "parent private att";
	String defaultAtt = "parent default att";
	
	public void pulicFun(){
		System.out.println("parent public fun");
	}
	
	protected void protectedFun(){
		System.out.println("parent protected fun");
	}
	
	private void privateFun(){
		System.out.println("parent private fun");
	}
	
	void defaultFun(){
		System.out.println("parent default fun");
	}

}
