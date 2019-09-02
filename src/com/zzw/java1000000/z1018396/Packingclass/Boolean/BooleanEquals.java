package com.zzw.java1000000.z1018396.Packingclass.Boolean;

public class BooleanEquals {
	
	public static void main(String[] args) {
		boolean b = true;
		
		Boolean boolean1 = true;
		Boolean boolean2 = true;
		System.out.println(boolean1 == boolean2);//true
		System.out.println(boolean1 == b);//true
		
		Boolean boolean3 = new Boolean(true);
		Boolean boolean4 = new Boolean(true);
		System.out.println(boolean3 == boolean4);//false
		System.out.println(boolean3 == b);//true
	}

}
