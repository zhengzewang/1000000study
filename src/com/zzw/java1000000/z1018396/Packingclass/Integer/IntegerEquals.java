package com.zzw.java1000000.z1018396.Packingclass.Integer;

public class IntegerEquals {
	
	public static void main(String[] args) {
		int i_127 = 127;
		int i_128 = 128;
		
		Integer int_127 = 127;
		Integer int_128 = 128;
		Integer int_127_2 = 127;
		Integer int_128_2 = 128;
		System.out.println(int_127 == int_127_2);//true
		System.out.println(int_128 == int_128_2);//false
		
		System.out.println(int_127 == i_127);//true
		System.out.println(int_128 == i_128);//true
		
		Integer integer_127 = new Integer(127);
		Integer integer_127_2 = new Integer(127);
		Integer integer_128 = new Integer(128);
		Integer integer_128_2 = new Integer(128);
		System.out.println(integer_127 == integer_127_2);//false
		System.out.println(integer_128 == integer_128_2);//false
		
		System.out.println(integer_127 == int_127);//false
		System.out.println(integer_128 == int_128);//false
		
		System.out.println(integer_127 == i_127);//true
		System.out.println(integer_128 == i_128);//true
		
		Integer integer_neg_128 = -128;
		Integer integer_neg_128_2 = -128;
		Integer integer_neg_129 = -129;
		Integer integer_neg_129_2 = -129;
		System.out.println(integer_neg_128 == integer_neg_128_2);//true
		System.out.println(integer_neg_129 == integer_neg_129_2);//false
		
		Integer integer = 10000;
		System.out.println(integer == 10000);
		Integer.valueOf(128);
	}

}
