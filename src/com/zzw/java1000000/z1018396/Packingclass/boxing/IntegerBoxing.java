package com.zzw.java1000000.z1018396.Packingclass.boxing;

public class IntegerBoxing {
	public static void main(String[] args) {
		Integer integer = 10;
		int i = integer;
		
		Integer.valueOf(10);
		
		Integer integer_127 = 127;
		Integer integer_127_2 = 127;
		Integer integer_128 = 128;
		Integer integer_128_2 = 128;
		System.out.println(integer_127 == integer_127_2);//true
		System.out.println(integer_128 == integer_128_2);//false
	}
}
