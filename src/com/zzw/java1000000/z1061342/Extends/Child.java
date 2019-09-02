package com.zzw.java1000000.z1061342.Extends;

public class Child extends Parent {
	
	public static String static_test = "static_child";
	public String public_test = "public_child";
	
	@Override
	public String test() {
		return "child_test_fun";
	}
	
	public static void main(String[] args) {
		Child child = new Child();
		System.out.println(child.static_test);
		System.out.println(child.public_test);
		System.out.println(child.test());
		
		Parent parent_child = child;
		System.out.println(parent_child.static_test);
		System.out.println(parent_child.public_test);
		System.out.println(parent_child.test());
	}

}
