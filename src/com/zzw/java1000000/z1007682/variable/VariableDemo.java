package com.zzw.java1000000.z1007682.variable;

public class VariableDemo {
	
	public static void main(String[] args) {
		
		VariableParent variable = new VariableChild();

		System.out.println(variable.getId());
		System.out.println(variable.getCode());
		System.out.println(variable.getName());
		
	}

}
