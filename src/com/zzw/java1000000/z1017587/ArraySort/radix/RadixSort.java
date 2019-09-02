package com.zzw.java1000000.z1017587.ArraySort.radix;


import com.zzw.java1000000.z1017587.ArraySort.Data.SortTestData;

/**
 * 基数排序MSD
 * @author 郑泽旺
 *
 */
public class RadixSort {
	
	public static void main(String[] args) {
		int[] arr;
		long start;
		long end;
		
		arr = SortTestData.getBigData();
		start = System.nanoTime();//纳秒
		RadixSortAsc(arr);
		end = System.nanoTime();//纳秒
		System.out.println( (end - start) + "纳秒");
//		SortTestData.printArr(arr);
	}
	
	/**
	 * 基数排序MSD
	 * asc
	 * 升序
	 * @param arr
	 */
	public static void RadixSortAsc(int[] arr){
		int min = 0;//主要用于处理负数的情况
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < min){
				min = arr[i];
			}
		}
		int max = 0;
		for (int i = 0; i < arr.length; i++) {//全部转化为非负数，并获得最大位数
			arr[i] -= min;//变为正数处理
			if(arr[i] > max){
				max = arr[i];
			}
		}
		int maxLen = Integer.toString(max).length();//数组中最大数的位数
		/**
		 * 先对最高位进行桶排序
		 */
		RadixSortAsc(arr,arr.length,maxLen-1);//先对最高位排序
		if (min<0) {
			for (int i = 0; i < arr.length; i++) {
				arr[i] += min;
			}
		}
	}

	/**
	 * 递归
	 * @param arr
	 * @param n 待桶排序的数据
	 * @param i 待排序的位数
	 */
	private static void RadixSortAsc(int[] arr,int n, int i) {
		int bucket[][] = new int[10][n];
		int index[] = new int[10];
		for (int j = 0; j < n; j++) {
			int temp = 0;
			String str = Integer.toString(arr[j]);
			if(str.length()>i){
				temp = str.charAt(str.length()-i-1)-'0';
			}
			//temp表示当前位数i对应的数字。
			bucket[temp][index[temp]++] = arr[j];
		}
		//对每个桶里面的数据再进行桶排序
		for (int j = 0; j < index.length; j++) {
			if(i<=0)
				break;
			if(index[j] == 0)
				continue;
			RadixSortAsc(bucket[j],index[j], i-1);//依次对每个桶的数据进行桶排序
		}
		int pos = 0;
		for (int j = 0; j < index.length; j++) {
			for (int k = 0; k < index[j]; k++) {
				arr[pos++] = bucket[j][k];
			}
		}
	}

}
