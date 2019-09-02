package com.zzw.java1000000.z1017587.ArraySort.heap;


import com.zzw.java1000000.z1017587.ArraySort.Data.SortTestData;

/**
 * 堆排序
 * @author zhengzewang
 *
 */
public class HeapSort {
	
	public static void main(String[] args) {
		int[] arr;
		long start;
		long end;
		
		/**
		 * 预热
		 * 不知道为什么，执行过一次之后，第二次就相当快
		 */
		arr = SortTestData.getBigData();
		heapSortAsc(arr);
		
		arr = SortTestData.getBigData();
		start = System.nanoTime();//纳秒
		heapSortAsc(arr);
		end = System.nanoTime();//纳秒
		System.out.println( (end - start) + "纳秒");
//		SortTestData.printArr(arr);
	}
	
	/**
	 * 堆排序
	 * asc
	 * 升序
	 * @param arr
	 */
	public static void heapSortAsc(int[] arr){
		int len = arr.length;
		if (len <= 1)
			return;
		//建堆
		int startIndex = getParentIndex(len-1);//从最后一个节点的父节点开始创建堆
		for (int i = startIndex; i >=0 ; i--) {
			buildHeapAsc(arr,len,i);
		}
		//头与尾交换，交换之后再建堆。之后再交换
		for (int i = len-1; i >0 ; i--) {
			int temp = arr[i];
			arr[i] = arr[0];
			arr[0] = temp;
			//交换之后原堆除了跟节点，其他的子节点仍是大根堆。所以只要重新调整index为0的堆。堆的大小刚好为i
			buildHeapAsc(arr, i, 0);
		}
	}
	
	/**
	 * 
	 * @param arr 堆数组
	 * @param size 堆的大小
	 * @param i 保证父节点i为大根堆
	 */
	private static void buildHeapAsc(int[] arr, int size, int i) {
		int left = getLeftChildIndex(i);
		int right = getRightChildIndex(i);
		int max = i;
		if(left < size && arr[left] > arr[max]){
			max = left;
		}
		if(right < size && arr[right] > arr[max]){
			max = right;
		}
		if(max != i){
			//交换
			int temp = arr[i];
			arr[i] = arr[max];
			arr[max] = temp;
			//交换之后的子节点可能不是最大堆。需要重新建堆
			buildHeapAsc(arr, size, max);
		}
	}

	/**
	 * 返回左子节点
	 * 
	 * 如果大于size，表示无左子节点
	 * 
	 * @param i
	 * @return
	 */
	private static int getLeftChildIndex(int i){
		return 2*i + 1;
	}
	
	/**
	 * 返回右子节点
	 * 
	 * 如果大于size，表示无左子节点
	 * 
	 * @param i
	 * @return
	 */
	private static int getRightChildIndex(int i){
		return 2*i + 2;
	}
	
	/**
	 * 返回父节点
	 * 
	 * 如果是负数，表示没有父节点
	 * 
	 * @param i
	 * @return
	 */
	private static int getParentIndex(int i){
		return (i-1)/2;
	}

}
