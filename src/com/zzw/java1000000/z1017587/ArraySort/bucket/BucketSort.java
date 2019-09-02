package com.zzw.java1000000.z1017587.ArraySort.bucket;


import com.zzw.java1000000.z1017587.ArraySort.Data.SortTestData;

/**
 * 桶排序
 * @author 郑泽旺
 *
 */
public class BucketSort {

	public static void main(String[] args) {
		int[] arr;
		long start;
		long end;
		
		arr = SortTestData.getBigData();
		start = System.nanoTime();//纳秒
		basket(arr);
		end = System.nanoTime();//纳秒
		System.out.println( (end - start) + "纳秒");
//		SortTestData.printArr(arr);
		
		arr = SortTestData.getBigData();
		start = System.nanoTime();//纳秒
		BucketSortAsc(arr);
		end = System.nanoTime();//纳秒
		System.out.println( (end - start) + "纳秒");
//		SortTestData.printArr(arr);
	}
	
	/**
	 * 桶排序
	 * asc
	 * 升序
	 * @param arr
	 */
	public static void BucketSortAsc(int[] arr){
		int n = arr.length;
		int bucket[][] = new int[10][n];
		int index[] = new int[10];
		int min = 0;//主要用于处理负数的情况
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] < min){
				min = arr[i];
			}
		}
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] -= min;//变为正数处理
			if(arr[i] > max){
				max = arr[i];
			}
		}
		int maxLen = Integer.toString(max).length();//数组中最大数的位数
		for (int i = 0; i < maxLen; i++) {//从个位数开始比较。如果该位数为0，则放在第一个桶子里，以此类推。
			for (int j = 0; j < arr.length; j++) {
				int temp = 0;
				String str = Integer.toString(arr[j]);
				if(str.length()>i){
					temp = str.charAt(str.length()-i-1)-'0';
				}
				//temp表示当前位数i对应的数字。
				bucket[temp][index[temp]++] = arr[j];
			}
			//经过一次分类之后。每个桶按照当前位数从小到大排列了。即第1一个桶子的位数i均为0。
			//等到排列下一位的时候，该位相同的数会被放入同一个桶子里，而该位的低位已经在前一次循环中排好序了。
			//所以对每一位桶排序之后，整个数组就有序了。
			int pos = 0;
			for (int j = 0; j < index.length; j++) {
				for (int k = 0; k < index[j]; k++) {
					arr[pos++] = bucket[j][k];
				}
			}
			for (int j = 0; j < index.length; j++) {
				index[j] = 0;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			arr[i] += min;
		}
	}
	
	/**
	 * 摘自百度百科
	 * @param data
	 */
	public static void basket(int data[]){//data为待排序数组
		int n=data.length;
		int bask[][]=new int[10][n];
		int index[]=new int[10];
		int max=Integer.MIN_VALUE;
		for(int i=0;i<n;i++){
			max=max>(Integer.toString(data[i]).length())?max:(Integer.toString(data[i]).length());
		}
		String str;
		for(int i=max-1;i>=0;i--){
			for(int j=0;j<n;j++){
				str="";
				if(Integer.toString(data[j]).length()<max){
					for(int k=0;k<max-Integer.toString(data[j]).length();k++)
					str+="0";
				}
				str+=Integer.toString(data[j]);
				bask[str.charAt(i)-'0'][index[str.charAt(i)-'0']++]=data[j];
			}
			int pos=0;
			for(int j=0;j<10;j++){
				for(int k=0;k<index[j];k++){
					data[pos++]=bask[j][k];
				}
			}
			for(int x=0;x<10;x++)index[x]=0;
		}
	}
	
}
