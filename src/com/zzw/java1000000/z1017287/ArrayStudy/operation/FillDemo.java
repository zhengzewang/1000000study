package com.zzw.java1000000.z1017287.ArrayStudy.operation;

import java.util.Arrays;

public class FillDemo {
	
	public static void main(String[] args) {
		int[] is = {2,5,6,8,4};
		Arrays.fill(is, 1, 3, 7);
		System.out.println(Arrays.toString(is));
		Arrays.fill(is, 3);
		System.out.println(Arrays.toString(is));
	}

}
