package com.zzw.java1000000.z1022174.Math$Random.Random;

import java.util.HashMap;
import java.util.Map;

public class RandomDemo {
	
	public static void main(String[] args) {
		mathRandom();
	}
	
	/**
	 * 产生A-Z以及a-z之间的随机字符并统计发生概率
	 */
	public static void mathRandom(){
		int totalCount = 10000;
		Map<Character, Integer> map = new HashMap<>();
		int randomCount = 0;
		while(randomCount++<totalCount){
			Character character = charAzRandom();
			Integer integer = 1;
			if(map.get(character) != null){
				integer = map.get(character)+1;
			}
			map.put(character, integer);
		}
		for(Character character : map.keySet()){
			System.out.println(character + ":" + 100*((double)map.get(character))/((double)totalCount) + "%" );
		}
	}
	
	/**
	 * 产生A-Z以及a-z之间的随机字符
	 * @return
	 */
	public static char charAzRandom(){
		int i = n1n2Random(0, 1+1);
		if(i == 0){
			return charAZInt();
		}else {
			return charazInt();
		}
	}
	
	/**
	 * 返回A-Z之间的字符
	 * @return
	 */
	public static char charAZInt(){
		char c = (char)n1n2Random(65, 90+1);
		return c;
	}
	
	/**
	 * 返回a-z之间的字符
	 * @return
	 */
	public static char charazInt(){
		char c = (char)n1n2Random(97, 122+1);
		return c;
	}
	
	/**
	 * 返回int型n1和n2之间的随机整数。左闭右开
	 */
	public static int n1n2Random(int n1, int n2){
		int i = (int)(Math.random()*(n2-n1));
		int result = n1 + i;
		return result;
	}

}
