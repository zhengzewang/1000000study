package com.zzw.java1000000.z1011203.String.String;

public class StringEqualDemo {
	
	public static void main(String[] args) {
		int int_neg_1 = -1;
		final int final_int_neg_1 = -1;
		final String final_str_neg_1 = "-1";
		final String final_strobj_neg_1 = new String("-1");
		
		String string1;
		String string2;
		//1
		string1 = "str1";
		string2 = "str1";
		System.out.println(string1 == string2);//true
		
		//2
		string1 = "str2";
		string2 = new String("str2");
		System.out.println(string1 == string2);//false

		//3
		string1 = "str3-1";
		string2 = "str3" + -1;
		System.out.println(string1 == string2);//true
		
		//4
		string1 = "str4-1";
		string2 = "str4" + int_neg_1;
		System.out.println(string1 == string2);//false
		
		//5
		string1 = "str5-1";
		string2 = "str5" + final_int_neg_1;
		System.out.println(string1 == string2);//true
		
		//6
		string1 = "str6-1";
		string2 = "str6" + final_str_neg_1;
		System.out.println(string1 == string2);//true
		
		//7
		string1 = "str7-1";
		string2 = "str7" + final_strobj_neg_1;
		System.out.println(string1 == string2);//false
		
		//8
		string1 = "str8";
		string2 = string1.intern();
		System.out.println(string1 == string2);//true
		
		//9
		string1 = new String("str9");
		string1 = string1.intern();
		string2 = "str9";
		System.out.println(string1 == string2);//true
		
		//10
		string1 = new String("str10");
		string2 = string1.intern();
		System.out.println(string1 == string2);//false
		
		//11
		string1 = "str11-1";
		string2 = "str11" + int_neg_1;
		string2.intern();
		System.out.println(string1 == string2);//false
		
		//12
		string2 = "str12" + int_neg_1;
		string2.intern();
		string1 = "str12-1";
		System.out.println(string1 == string2);//true
		
		//
//		test = 2;//error
//		str1 = "2";//error
//		str2 = "2";//error
//		str1 = new String("2");//error
//		str2 = new String("2");//error
	}

}
