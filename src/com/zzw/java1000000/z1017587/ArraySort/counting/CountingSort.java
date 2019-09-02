package com.zzw.java1000000.z1017587.ArraySort.counting;


import com.zzw.java1000000.z1017587.ArraySort.Data.SortTestData;

/**
 * 计数排序
 * @author zhengzewang
 *
 */
public class CountingSort {
	
	public static void main(String[] args) {
		int[] arr;
		long start;
		long end;
		
		arr = SortTestData.getBigData();
		start = System.nanoTime();//纳秒
		countingSortAsc(arr);
		end = System.nanoTime();//纳秒
		System.out.println( (end - start) + "纳秒");
//		SortTestData.printArr(arr);
		
		arr = SortTestData.getBigData();
		start = System.nanoTime();//纳秒
		countingSortAsc2(arr);
		end = System.nanoTime();//纳秒
		System.out.println( (end - start) + "纳秒");
//		SortTestData.printArr(arr);
	}
	
	/**
	 * 计数排序
	 * asc
	 * 升序
	 * 比较适合于数量大但数值的范围是在一定限度内。
	 * 比如统计100万学生高考成绩的排名，由于高考成绩一定是在0-满分(假如750)之间。
	 * 所以一次遍历便可以统计每个分数所对应的人数。（假设分数是整数）
	 * 最后根据每个分数对应的人数排序即可。
	 * @param arr
	 */
	public static void countingSortAsc(int[] arr){
		//先确定最大值和最小值
		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		//定义一个有序集
		int[] order = new int[max-min+1];//arr数组中所有的数一定是在区间[min,max]
		//统计区间中的每个数有多少个。为了不浪费空间，我们将数组arr中的数都减去min，得到的值对应order的下边。
		//则order[index] = 数组arr中值为index+min的数量
		for (int i = 0; i < arr.length; i++) {
			order[arr[i]-min] += 1;
		}
		int k = 0;
		for (int i = 0; i < order.length; i++) {
			for (int j = 0; j < order[i]; j++) {
				arr[k++] = i+min;
			}
		}
	}
	
	/**
	 * 计数排序
	 * asc
	 * 升序
	 * 比较适合于数量大但数值的范围是在一定限度内。
	 * 比如统计100万学生高考成绩的排名，由于高考成绩一定是在0-满分(假如750)之间。
	 * 所以一次遍历便可以统计每个分数所对应的人数。（假设分数是整数）
	 * 最后根据每个分数对应的人数排序即可。
	 * @param arr
	 */
	public static void countingSortAsc2(int[] arr){
		//先确定最大值和最小值
		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		//定义一个有序集
		int[] order = new int[max-min+1];//arr数组中所有的数一定是在区间[min,max]
		//统计区间中的每个数有多少个。为了不浪费空间，我们将数组arr中的数都减去min，得到的值对应order的下边。
		//则order[index] = 数组arr中值为index+min的数量
		for (int i = 0; i < arr.length; i++) {
			order[arr[i]-min] += 1;
		}
		int k = 0;
		for (int i = 0; i < order.length; i++) {
			for (int j = 0; j < order[i]; j++) {
				arr[k++] = i+min;
			}
		}
		for (int i = 1; i < order.length; i++) {
			order[i] = order[i] + order[i-1];
		}
		int[] result = new int[arr.length];
		for (int i = arr.length-1; i >= 0; i--) {
			result[order[arr[i]-min]-1] = arr[i];
			order[arr[i]-min] = order[arr[i]-min]-1;
		}
		System.arraycopy(result, 0, arr, 0, result.length);
	}

}
