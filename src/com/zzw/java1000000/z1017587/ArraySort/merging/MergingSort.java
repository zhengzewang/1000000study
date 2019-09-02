package com.zzw.java1000000.z1017587.ArraySort.merging;


import com.zzw.java1000000.z1017587.ArraySort.Data.SortTestData;

/**
 * 归并排序
 * @author zhengzewang
 *
 */
public class MergingSort {
	
    /**
     * 　*　<pre>
     * 　*　二路归并
     * 　*　原理：将两个有序表合并和一个有序表
     * 　*　</pre>
     * 　*
     * 　*　@param　a
     * 　*　@param　s
     * 　*　第一个有序表的起始下标
     * 　*　@param　m
     * 　*　第二个有序表的起始下标
     * 　*　@param　t
     * 　*　第二个有序表的结束小标
     * 　*
     */
    private static void merge(int[] a, int s, int m, int t) {
        int[] tmp = new int[t - s + 1];
        int i = s, j = m, k = 0;
        while (i < m && j <= t) {
            if (a[i] <= a[j]) {
                tmp[k] = a[i];
                k++;
                i++;
            } else {
                tmp[k] = a[j];
                j++;
                k++;
            }
        }
        while (i < m) {
            tmp[k] = a[i];
            i++;
            k++;
        }
        while (j <= t) {
            tmp[k] = a[j];
            j++;
            k++;
        }
        System.arraycopy(tmp, 0, a, s, tmp.length);
    }
 
    /**
     * 　*
     * 　*　@param　a
     * 　*　@param　s
     * 　*　@param　len
     * 　*　每次归并的有序集合的长度
     */
    public static void mergeSort(int[] a, int s, int len) {
        int size = a.length;
        int mid = size / (len << 1);
        int c = size & ((len << 1) - 1);
        //　-------归并到只剩一个有序集合的时候结束算法-------//
        if (mid == 0)
            return;
        //　------进行一趟归并排序-------//
        for (int i = 0; i < mid; ++i) {
            s = i * 2 * len;
            merge(a, s, s + len, (len << 1) + s - 1);
        }
        //　-------将剩下的数和倒数一个有序集合归并-------//
        if (c != 0)
            merge(a, size - c - 2 * len, size - c, size - 1);
        //　-------递归执行下一趟归并排序------//
        mergeSort(a, 0, 2 * len);
    }
    
    /*
     * 上面的代码是从百科里摘抄过来的
     */
	
	public static void main(String[] args) {
		int[] arr;
		long start;
		long end;
		
		arr = SortTestData.getBigData();
		start = System.nanoTime();//纳秒
		mergeSort(arr, 0, 1);
		end = System.nanoTime();//纳秒
		System.out.println( (end - start) + "纳秒");
//		SortTestData.printArr(arr);
		
		arr = SortTestData.getBigData();
		start = System.nanoTime();//纳秒
		mergingSortAsc(arr);
		end = System.nanoTime();//纳秒
		System.out.println( (end - start) + "纳秒");
//		SortTestData.printArr(arr);
		
		arr = SortTestData.getBigData();
		start = System.nanoTime();//纳秒
		mergingSortAscImprove(arr);
		end = System.nanoTime();//纳秒
		System.out.println( (end - start) + "纳秒");
//		SortTestData.printArr(arr);
	}
	
	
	/**
	 * 归并排序
	 * 改进
	 * asc
	 * 升序
	 * @param arr
	 */
	public static void mergingSortAscImprove(int[] arr){
		mergeSortAscImprove(arr, 1);
	}
	
	/**
	 * 
	 * @param arr
	 * @param size 从第一个元素开始，依次将相邻两个将长度为size的子序列合并成长度为2*size的序列
	 */
	private static void mergeSortAscImprove(int[] arr, int size){
		int len = arr.length;
		int sum = len/(size*2);
		if(sum <= 0){//不能再拆分了
			return ;
		}
		for (int i = 0; i < sum; i++) {
			int left =  i*size*2;
			mergeAscImprove(arr,left , left+size, left+size*2);
		}
		int c = len%(size*2);//余数
		if (c != 0){//余数与最后一个有序子序列归并排序。（如果最后一个也是第一个，那么这趟排序完整个排序就结束了。下次递归得到的sum==0）
			mergeAscImprove(arr, len-c-size*2, len-c, len);
		}
		mergeSortAscImprove(arr,2*size);
	}
	
	/**
	 * 归并排序（子序列已经是有序的）
	 * @param arr
	 * @param left
	 * @param middle
	 * @param right
	 */
	private static void mergeAscImprove(int[] arr, int left, int middle, int right) {
		//归并操作
		int[] is = new int[right - left];//申请空间
		int k = 0;
		//设定两个指针
		int m = left;
		int n = middle;
		while (m < middle && n < right) {
			if(arr[m] > arr[n])
				is[k++] = arr[n++];
			else 
				is[k++] = arr[m++];
		}
		while (m < middle)
			is[k++] = arr[m++];
		while (n < right) 
			is[k++] = arr[n++];
		for (int i = 0; i < is.length; i++) {
			arr[left+i] = is[i];
		}
	}

	/**
	 * 归并排序
	 * asc
	 * 升序
	 * @param arr
	 */
	public static void mergingSortAsc(int[] arr){
		int len = arr.length;
		if (len < 2) {
			return;
		}
		int middle = len/2;//把长度为n的输入序列分成两个长度为n/2的子序列；
		mergeAsc(arr,0,middle,len);
	}

	/**
	 * 将子序列[left,middle)与子序列[middle,right)归并排序
	 * @param arr
	 * @param left
	 * @param middle
	 * @param right
	 */
	private static void mergeAsc(int[] arr, int left, int middle, int right) {
		if ( (middle - left)==1 && (right - middle)==1 ){
			//左右各为1
			if(arr[left] > arr[middle]){
				//交换
				int temp = arr[middle];
				arr[middle] = arr[left];
				arr[left] = temp;
			}
			return;
		}
		/**
		 * 对这两个子序列分别采用归并排序；
		 */
		//先将子序列1归并排序
		if( (middle - left) > 1){
			int m_mid = (middle + left) / 2;
			mergeAsc(arr, left, m_mid, middle);
		}
		//再将子序列2归并排序
		if ( (right - middle) > 1 ){
			int m_mid = (right + middle) / 2;
			mergeAsc(arr, middle, m_mid, right);
		}
		//归并操作
		int[] is = new int[right - left];//申请空间
		int k = 0;
		//设定两个指针
		int m = left;
		int n = middle;
		while (m < middle && n < right) {
			if(arr[m] > arr[n])
				is[k++] = arr[n++];
			else 
				is[k++] = arr[m++];
		}
		while (m < middle)
			is[k++] = arr[m++];
		while (n < right) 
			is[k++] = arr[n++];
		for (int i = 0; i < is.length; i++) {
			arr[left+i] = is[i];
		}
	}
	
	/**
	 * 归并排序
	 * desc
	 * 降序
	 * @param arr
	 */
	public static void mergingSortDesc(int[] arr){
		int len = arr.length;
		if (len < 2) {
			return;
		}
		int middle = len/2;//把长度为n的输入序列分成两个长度为n/2的子序列；
		mergeDesc(arr,0,middle,len);
	}

	/**
	 * 将子序列[left,middle)与子序列[middle,right)归并排序
	 * @param arr
	 * @param left
	 * @param middle
	 * @param right
	 */
	private static void mergeDesc(int[] arr, int left, int middle, int right) {
		if ( (middle - left)==1 && (right - middle)==1 ){
			//左右各为1
			if(arr[left] < arr[middle]){
				//交换
				int temp = arr[middle];
				arr[middle] = arr[left];
				arr[left] = temp;
			}
			return;
		}
		/**
		 * 对这两个子序列分别采用归并排序；
		 */
		//先将子序列1归并排序
		if( (middle - left) > 1){
			int m_mid = (middle + left) / 2;
			mergeDesc(arr, left, m_mid, middle);
		}
		//再将子序列2归并排序
		if ( (right - middle) > 1 ){
			int m_mid = (right + middle) / 2;
			mergeDesc(arr, middle, m_mid, right);
		}
		//归并操作
		int[] is = new int[right - left];//申请空间
		int k = 0;
		//设定两个指针
		int m = left;
		int n = middle;
		while (m < middle && n < right) {
			if(arr[m] < arr[n])
				is[k++] = arr[n++];
			else 
				is[k++] = arr[m++];
		}
		while (m < middle)
			is[k++] = arr[m++];
		while (n < right) 
			is[k++] = arr[n++];
		for (int i = 0; i < is.length; i++) {
			arr[left+i] = is[i];
		}
	}

}
