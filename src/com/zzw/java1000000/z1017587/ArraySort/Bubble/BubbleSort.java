package com.zzw.java1000000.z1017587.ArraySort.Bubble;


import com.zzw.java1000000.z1017587.ArraySort.Data.SortTestData;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] arr = SortTestData.getBigData();
//		SortTestData.printArr(arr);
		long start = System.nanoTime();//纳秒
		bubbleSortAsc(arr);
		long end   = System.nanoTime();//纳秒
		System.out.println( (end - start) + "纳秒");

		arr = SortTestData.getBigData();
		start = System.nanoTime();//纳秒
		bubbleSortAscImprove(arr);
		end = System.nanoTime();//纳秒
		System.out.println( (end - start) + "纳秒");

		arr = SortTestData.getBigData();
		start = System.nanoTime();//纳秒
		bubbleSortAscImproveAgain(arr);
		end = System.nanoTime();//纳秒
		System.out.println( (end - start) + "纳秒");
		
		
		System.out.println();
		
		/**
		 * --------------------------------------------------------------
		 * 最好的情况
		 * 
		 */
		/**
		 * 已经是顺序的
		 */
		start = System.nanoTime();//纳秒
		bubbleSortAsc(arr);
		end   = System.nanoTime();//纳秒
		System.out.println( (end - start) + "纳秒");

		/**
		 * 已经是顺序的
		 */
		start = System.nanoTime();//纳秒
		bubbleSortAscImprove(arr);
		end = System.nanoTime();//纳秒
		System.out.println( (end - start) + "纳秒");

		/**
		 * 已经是顺序的
		 */
		start = System.nanoTime();//纳秒
		bubbleSortAscImproveAgain(arr);
		end = System.nanoTime();//纳秒
		System.out.println( (end - start) + "纳秒");
		
		
		System.out.println();
		
		/**
		 * --------------------------------------------------------------
		 * 最坏的情况（几次测试下来，所花费时间竟然不是最长的。why？）
		 * 
		 */
		/**
		 * 逆序的
		 */
		bubbleSortDesc(arr);
//		SortTestData.printArr(arr);
		start = System.nanoTime();//纳秒
		bubbleSortAsc(arr);
		end   = System.nanoTime();//纳秒
		System.out.println( (end - start) + "纳秒");

		/**
		 * 逆序的
		 */
		bubbleSortDesc(arr);
		start = System.nanoTime();//纳秒
		bubbleSortAscImprove(arr);
		end = System.nanoTime();//纳秒
		System.out.println( (end - start) + "纳秒");

		/**
		 * 逆序的
		 */
		bubbleSortDesc(arr);
		start = System.nanoTime();//纳秒
		bubbleSortAscImproveAgain(arr);
		end = System.nanoTime();//纳秒
		System.out.println( (end - start) + "纳秒");
	}

	/**
	 * 从小到大
	 * asc
	 * 升序
	 * @param arr
	 */
	public static void bubbleSortAsc(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < len-1; i++) {
			for (int j = 0; j < len-1-i; j++) {
				if(arr[j] > arr[j+1]){
					//交换
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	/**
	 * 冒泡排序改进
	 * @param arr
	 */
	public static void bubbleSortAscImprove(int[] arr){
		int len = arr.length;
		int i = len-1-0;
		while(i > 0){
			int pos = 0;
			for (int j = 0; j < i; j++) {
				if(arr[j] > arr[j+1]){
					pos = j;//记录最后一次交换的位置。显然，在此位置之后的一定都已经是排好序了的
					//交换
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
			i = pos;
		}
	}
	
	/**
	 * 并没有觉得效率有提高
	 * 
	 * @param arr
	 */
	@Deprecated
	public static void bubbleSortAscImproveAgain(int[] arr){
		int low = 0;
		int high = arr.length-1;
		while (low < high){
//			int pos = low;
			for (int i = low; i < high; i++) {//正向走一次
				if(arr[i] > arr[i+1]){
//					pos = i;
					//交换
					int temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = temp;
				}
			}
//			high = pos;
			high--;
			for (int i = high; i > low; i--) {//反向走一次
				if(arr[i] < arr[i-1]){
//					pos = i;
					//交换
					int temp = arr[i-1];
					arr[i-1] = arr[i];
					arr[i] = temp;
				}
			}
//			low = pos;
			low++;
		}
	}
	
	/**
	 * 从大到小
	 * 降序
	 * @param arr
	 */
	public static void bubbleSortDesc(int[] arr) {
		int len = arr.length;
		for (int i = 0; i < len-1; i++) {
			for (int j = 0; j < len-1-i; j++) {
				if(arr[j] < arr[j+1]){//与上面一个函数相比，改变的仅仅是将大于号变成小于号
					//交换
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
					/**
					 * 如果在循环之外定义一个max和一个sign
					 * max = a[0]
					 * 每当a[j+1]>max时
					 * max=a[j+1]，sign=j+1
					 * 最后另a[sign]=a[len-1-i]，a[len-1-i] = max
					 * 但这样的话就不是冒泡排序
					 */
				}
			}
		}
	}

}
