package com.zzw.java1000000.z1017287.ArrayStudy.operation;

import java.util.Arrays;

public class QueryDemo {
	
	public static void main(String[] args) {
		
		int[] is = {2,5,6,8,4};
		
		for (int i = 0; i < is.length; i++) {
			System.out.println(is[i]);
		}
		
		System.out.println();
		
		for(int i : is){
			System.out.println(i);
		}
		
		System.out.println();
		
		System.out.println(Arrays.toString(is));
		
	}

}
