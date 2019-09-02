package com.zzw.java1000000.z1017587.ArraySort.shell;

import com.zzw.java1000000.z1017587.ArraySort.Data.SortTestData;

public class ShellSort {
	
	public static void main(String[] args) {
		int[] arr;
		long start;
		long end;
		
		/**
		 * 预热
		 * 方法执行第二遍的时候速度会明显加快
		 * 
		 */
		arr = SortTestData.getBigData();
		shellSortAsc(arr);
		arr = SortTestData.getBigData();
		shellSortDesc(arr);
		arr = SortTestData.getBigData();
		shellSortIncrementAsc(arr,2);
		
		
		arr = SortTestData.getBigData();
		start = System.nanoTime();//纳秒
		shellSortAsc(arr);
		end = System.nanoTime();//纳秒
		System.out.println( (end - start) + "纳秒");
//		SortTestData.printArr(arr);

		arr = SortTestData.getBigData();
		start = System.nanoTime();//纳秒
		shellSortDesc(arr);
		end = System.nanoTime();//纳秒
		System.out.println( (end - start) + "纳秒");
//		SortTestData.printArr(arr);
		
		System.out.println();
		
		for (int i = 10; i >1; i--) {
			arr = SortTestData.getBigData();
			start = System.nanoTime();//纳秒
			shellSortIncrementAsc(arr, i);
			end = System.nanoTime();//纳秒
			System.out.println( (end - start) + "纳秒");
		}
	}
	
	/**
	 * 希尔排序
	 * asc
	 * 升序
	 * @param arr
	 */
	public static void shellSortAsc(int[] arr){
		int len = arr.length;
		int d = len/2;//设置第一个增量
		if(d < 1)
			d = 1;
		while (true) {//增量d
			//分组
			for (int i = 0; i < d; i++) {//[0,0+d,0+d+d,...],[1,1+d,1+d+d,...],...[i,i+d,i+d+d,...],...[d-1,d-1+d,d-1+d+d,...]
				for (int j = i; j < len-1; j+=d) {
					//已排好序的是[i,j]
					int key = arr[j+1];//带插入元素
					int k = j;
					while (k >= i && arr[k] > key) {
						arr[k+1] = arr[k];
						k--;
					}
					arr[k+1] = key;
				}
			}
			if(d == 1)
				break;
			d = d/2 - 1;//尽量保证相邻的增量直接互不为倍数关系
			if(d<1)
				d = 1;
		}
	}
	
	/**
	 * 希尔排序
	 * 自定义增量变化规律
	 * 升序
	 * @param arr
	 * @param increment
	 */
	public static void shellSortIncrementAsc(int[] arr, int increment){
		int len = arr.length;
		int d = len/increment;//设置第一个增量
		if(d < 1)
			d = 1;
		
		while (true) {//增量d
			//分组
			for (int i = 0; i < d; i++) {//[0,0+d,0+d+d,...],[1,1+d,1+d+d,...],...[i,i+d,i+d+d,...],...[d-1,d-1+d,d-1+d+d,...]
				for (int j = i; j < len-1; j+=d) {
					//已排好序的是[i,j]
					int key = arr[j+1];//带插入元素
					int k = j;
					while (k >= i && arr[k] > key) {
						arr[k+1] = arr[k];
						k--;
					}
					arr[k+1] = key;
				}
			}
			if(d == 1)
				break;
			d = d/increment - 1;//尽量保证相邻的增量直接互不为倍数关系
			if(d<1)
				d = 1;
		}
	}
	
	/**
	 * 希尔排序
	 * asc
	 * 降序
	 * @param arr
	 */
	public static void shellSortDesc(int[] arr){
		int len = arr.length;
		int d = len/2;//设置第一个增量
		if(d < 1)
			d = 1;
		
		while (true) {//增量d
			//分组
			for (int i = 0; i < d; i++) {//[0,0+d,0+d+d,...],[1,1+d,1+d+d,...],...[i,i+d,i+d+d,...],...[d-1,d-1+d,d-1+d+d,...]
				for (int j = i; j < len-1; j+=d) {
					//已排好序的是[i,j]
					int key = arr[j+1];//带插入元素
					int k = j;
					while (k >= i && arr[k] < key) {
						arr[k+1] = arr[k];
						k--;
					}
					arr[k+1] = key;
				}
			}
			if(d == 1)
				break;
			d = d/2 - 1;//尽量保证相邻的增量直接互不为倍数关系
			if(d<1)
				d = 1;
		}
	}

}
