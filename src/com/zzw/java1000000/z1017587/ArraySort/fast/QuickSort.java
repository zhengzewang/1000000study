package com.zzw.java1000000.z1017587.ArraySort.fast;


import com.zzw.java1000000.z1017587.ArraySort.Data.SortTestData;

public class QuickSort {
	
	public static void main(String[] args) {
		int[] arr;
		long start;
		long end;
		
		arr = SortTestData.getBigData();
		start = System.nanoTime();//纳秒
		quickSortAsc(arr);
		end = System.nanoTime();//纳秒
		System.out.println( (end - start) + "纳秒");
//		SortTestData.printArr(arr);
		
		arr = SortTestData.getBigData();
		start = System.nanoTime();//纳秒
		quickSortDesc(arr);
		end = System.nanoTime();//纳秒
		System.out.println( (end - start) + "纳秒");
//		SortTestData.printArr(arr);
	}
	
	/**
	 * 快速排序
	 * asc
	 * 升序
	 * @param arr
	 */
	public static void quickSortAsc(int[] arr){
		int len = arr.length;
		int i = 0;
		int j = len-1;
		quickSortAscRe(arr,i,j);
	}

	/**
	 * 递归
	 * 升序
	 * @param arr
	 * @param low
	 * @param high
	 */
	private static void quickSortAscRe(int[] arr, int low, int high) {
		int i = low;
		int j = high;
		int key = arr[i];
		while (i < j) {
			//从j开始由后往前找到第一个小于key的数
			while(i < j && arr[j] >= key){
				j--;
			}
			if (i < j) {//找到了
				//交换
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
			//从i开始由前往后找到第一个大于key（此时key值对应的下边为j）的值
			while (i < j && arr[i] <= key) {
				i++;
			}
			if (i < j) {//找到了
				//交换
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				//key又跑到i这里了
			}
		}
		if (i > low) {
			quickSortAscRe(arr, low, i-1);
		}
		if (j < high) {
			quickSortAscRe(arr, i+1, high);
		}
	}
	
	
	/**
	 * 快速排序
	 * desc
	 * 降序
	 * @param arr
	 */
	public static void quickSortDesc(int[] arr){
		int len = arr.length;
		int i = 0;
		int j = len-1;
		quickSortDescRe(arr,i,j);
	}

	/**
	 * 递归
	 * 降序
	 * @param arr
	 * @param low
	 * @param high
	 */
	private static void quickSortDescRe(int[] arr, int low, int high) {
		int i = low;
		int j = high;
		int key = arr[i];
		while (i < j) {
			//从j开始由后往前找到第一个大于key的数
			while(i < j && arr[j] <= key){
				j--;
			}
			if (i < j) {//找到了
				//交换
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
			//从i开始由前往后找到第一个小于key（此时key值对应的下边为j）的值
			while (i < j && arr[i] >= key) {
				i++;
			}
			if (i < j) {//找到了
				//交换
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				//key又跑到i这里了
			}
		}
		if (i > low) {
			quickSortDescRe(arr, low, i-1);
		}
		if (j < high) {
			quickSortDescRe(arr, i+1, high);
		}
	}
	
	

}
