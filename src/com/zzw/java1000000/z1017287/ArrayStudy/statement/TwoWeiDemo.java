package com.zzw.java1000000.z1017287.ArrayStudy.statement;

import java.util.Random;

public class TwoWeiDemo {
	
	public static void main(String[] args) {
		
		Object[][] objects = new Object[5][];
		Random random = new Random();
		for (int i = 0; i < objects.length; i++) {
			objects[i] = new Integer[i+2];
			for (int j = 0; j < objects[i].length; j++) {
				objects[i][j] = random.nextInt(10);
			}
		}
		
		for (int i = 0; i < objects.length; i++) {
			for (int j = 0; j < objects[i].length; j++) {
				System.out.print(objects[i][j]+",");
			}
			System.out.println();
			int total = 0;
			for (int j = 0; j < objects[i].length; j++) {
				total += (int) objects[i][j];
			}
			System.out.println(total);
			int max = (int) objects[i][0];
			for (int j = 1; j < objects[i].length; j++) {
				if((int)objects[i][j] > max){
					max = (int)objects[i][j];
				}
			}
			System.out.println(max);
			System.out.println();
		}
		
	}

}
