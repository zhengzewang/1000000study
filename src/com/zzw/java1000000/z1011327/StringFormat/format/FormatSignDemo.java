package com.zzw.java1000000.z1011327.StringFormat.format;

public class FormatSignDemo {
	
	public static void main(String[] args) {
		System.out.println(String.format("%+f", 12.366));
		System.out.println(String.format("%-10ss", "hi"));
		System.out.println(String.format("%010g", 3.14));
		System.out.println(String.format("g% 20g", 3.2));
		System.out.println(String.format("%,f", 9564123621.36));
		System.out.println(String.format("%(f", -9.0));
		System.out.println(String.format("%(g", 9.0));
		System.out.println(String.format("%#x", 12));
		System.out.println(String.format("%#X", 12));
		System.out.println(String.format("%#o", 12));
		System.out.println(String.format("%f和%<10.1f", 12345.336));
		System.out.println(String.format("%2$d,%1$s","abc", 99));
	}

}
