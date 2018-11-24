package com.igeek.day06.level2_1;

public class Task3 {

	public static void main(String[] args) {
		/**
		 * 分析以下需求，并用代码实现
			1.键盘录入6个int类型的数据存数数组arr中
			2.将arr数组中的内容反转
			3.将翻转后的数组角标为奇数的互相交换 1和3换, 3和5换,以此类推
			4.最后将数组最后一个角标为奇数的元素 和数组中第一个角标为奇数的元素交换
			5.打印最终的数组(实现了1-4步之后的数组)
			6.如：用户输入的6个int数字为[1,2,3,4,5,6],最后输出的结果为[6, 5, 4, 1, 2, 3]
		 */
		int [] arr = {2,5,22,1,3,8};
		
		reverse(arr);
		
		reverse2(arr);
		for (int i : arr) {
			System.out.print(i+"\t");
		}
		System.out.println();
		reverse3(arr);
		for (int i : arr) {
			System.out.print(i+"\t");
		}
	}
	public static void print(int [] arr){
		System.out.print("[");//[1,2,3,4]
		for(int i = 0; i < arr.length; i++) {
			if(i == arr.length -1) {
				System.out.println(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ", ");
			}
		}
	}

	public static void reverse(int [] arr){
		for (int i = 0; i < arr.length/2; i++) {
			int temp = arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		//return arr;
	}
	
	public static void reverse2(int [] arr){
		//不论数组有多少个，要交换的奇数下标最多到length -2       
		/**
		 *  11   12   13   14   15   16
		 *                      l-2  l-1
		 */
		for (int i = 0; i < arr.length - 2; i++) {
			if(i%2!=0){
				int temp = arr[i];
				arr[i] = arr[i + 2];
				arr[i + 2] = temp;
			}
		}
	}
	//{2,5,22,1,3,8}
	public static void reverse3(int [] arr){
		int left = 0;//左边要交换的第一个下标 
		int right = 0;//右边要交换的第一个下标
		boolean lf = false;//是否是左边第一个要交换的元素
		boolean rf = false;//是否是右边第一个要交换的元素
		for(int i = 0,j=arr.length-1;i<j;i++,j--){
			if(arr[i]%2!=0){
				left=i;// left = 1
				lf = true; // true 
			}
			if(arr[j]%2!=0){ 
				right=j;// right = 4
				rf = true;// true  找到右边的第一个奇数了。
			}
			if(lf&&rf){//条件同时  左边的奇数 ，右边的奇数  同时被找到 。
				int temp = arr[i];
				arr[i] =arr[j];
				arr[j] = temp;
				break;
			}
		}
	}
}
