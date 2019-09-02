package com.zzw.java1000000.z1004918.basedatatype.Char;

public class CharDemo {
	
	char c ;
	
	public static void main(String[] args) {
		System.out.println(new CharDemo().c);
		if(new CharDemo().c == '\u0000'){
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		System.out.println('\u0000');
	}

}
