package com.zzw.java1000000.z1017587.ArraySort.insertion;


import com.zzw.java1000000.z1017587.ArraySort.Data.SortTestData;

public class InsertionSort {
	
	public static void main(String[] args) {
		int[] arr;
		long start;
		long end;
		
		arr = SortTestData.getBigData();
		start = System.nanoTime();//纳秒
		insertionSortAsc(arr);
		end = System.nanoTime();//纳秒
		System.out.println( (end - start) + "纳秒");
//		SortTestData.printArr(arr);
		
		arr = SortTestData.getBigData();
		start = System.nanoTime();//纳秒
		insertionSortDesc(arr);
		end = System.nanoTime();//纳秒
		System.out.println( (end - start) + "纳秒");
//		SortTestData.printArr(arr);
		
		arr = SortTestData.getBigData();
		start = System.nanoTime();//纳秒
		binaryInsertionSortAsc(arr);
		end = System.nanoTime();//纳秒
		System.out.println( (end - start) + "纳秒");
//		SortTestData.printArr(arr);
	}
	
	/**
	 * 插入排序
	 * asc
	 * 升序
	 * @param arr
	 */
	public static void insertionSortAsc(int[] arr){
		int len = arr.length;
		for (int i = 0; i < len-1; i++) {
			//已排序序列[0,i]
			int key = arr[i+1];//待插入元素
			int j = i;
			while(j >= 0 && arr[j] > key) {
				arr[j+1] = arr[j];//往后挪
				j--;//从后向前扫描
			}
			arr[j+1] = key;//插入到下一个位置
		}
	}
	
	/**
	 * 二分插入排序
	 * asc
	 * 升序
	 * @param arr
	 */
	public static void binaryInsertionSortAsc(int[] arr){
		int len = arr.length;
		for (int i = 0; i < len-1; i++) {
			//已排序序列[0,i]
			int key = arr[i+1];//待插入元素
			int left = 0;
			int right = i;
			while (left <= right) {
				int middle = (left + right)/2;
				if(key < arr[middle]){//
					right = middle - 1;
				} else {
					left = middle + 1;
				}
			}
			//把left及之后的值往右挪一个位置
			for (int j = i; j >= left ; j--) {
				arr[j+1] = arr[j];
			}
			arr[left] = key;
		}
	}
	
	/**
	 * 插入排序
	 * desc
	 * 降序
	 * @param arr
	 */
	public static void insertionSortDesc(int[] arr){
		int len = arr.length;
		for (int i = 0; i < len-1; i++) {
			//已排序序列[0,i]
			int key = arr[i+1];//待插入元素
			int j = i;
			while(j >= 0 && arr[j] < key) {
				arr[j+1] = arr[j];//往后挪
				j--;//从后向前扫描
			}
			arr[j+1] = key;//插入到下一个位置
		}
	}

}
