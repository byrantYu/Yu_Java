package com.igeek.day06.level1;

public class Task3 {

	public static void main(String[] args) {
		/**
		 * 定义一个方法,求出给定的数字在给定int型数组中出现的次数,如果一次没有出现则返回0
			如:给定数字3 求出3在数组 int[] arr = {3,4,3,5,7,9};中出现的次数
		 */
		int[] arr = {3,4,3,5,7,9,9};
		int result = getCount(arr, 3);
		System.out.println(result);
	}
	//arr 表示你要判断的数组   x 就是你要统计的那个数。
	public static int getCount(int [] arr, int x){
		int count = 0;//计数器 ，如果出现就累加
		for (int i = 0; i < arr.length; i++) {
			if(x==arr[i]){
				count++;
			}
		}
		return count;
	}
}
