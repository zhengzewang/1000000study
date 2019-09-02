package com.zzw.java1000000.z1017587.ArraySort.select;


import com.zzw.java1000000.z1017587.ArraySort.Data.SortTestData;

public class SelectSort {
	
	public static void main(String[] args) {
		int[] arr = SortTestData.getBigData();
		long start = System.nanoTime();
		SelectSortAsc(arr);
		long end = System.nanoTime();
		System.out.println( (end - start) + "纳秒");
//		SortTestData.printArr(arr);
		
		arr = SortTestData.getBigData();
		start = System.nanoTime();
		SelectSortDesc(arr);
		end = System.nanoTime();
		System.out.println( (end - start) + "纳秒");
	}
	
	/**
	 * 选择排序
	 * asc
	 * 升序
	 * @param arr
	 */
	public static void SelectSortAsc(int[] arr){
		int len = arr.length;
		for (int i = 0; i < len-1; i++) {
			int minIndex = i;
			for (int j = i+1; j < len; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;//标记最小值的下标
				}
			}
			//交换
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}
	
	
	/**
	 * 降序
	 * desc
	 * @param arr
	 */
	public static void SelectSortDesc(int[] arr){
		int len = arr.length;
		for (int i = 0; i < len-1; i++) {
			int minIndex = i;
			for (int j = i+1; j < len; j++) {
				if (arr[j] > arr[minIndex]) {
					minIndex = j;//标记最大值的下标
				}
			}
			//交换
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}

}
