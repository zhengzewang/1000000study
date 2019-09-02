package com.zzw.java1000000.z1011130.loop.ForEach;

import java.util.ArrayList;
import java.util.List;

public class ForEachDemo {
	
	
	public static void main(String[] args) {
		
		Integer integer [] = new Integer[5];
		List<Integer> integers = new ArrayList<>();
		
		for(Integer i : integer){
			integers.add(i);
		}
		
		for(Integer i : integers){//实现了Iterable
			System.out.println(i);
		}
	}

}
