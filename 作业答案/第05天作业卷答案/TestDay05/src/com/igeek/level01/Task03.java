package com.igeek.level01;

/*
 * 有如下数组int[] arr={10,20};
 * 定义一个方法求两个数字的和,使用这个方法求出数组这两个元素相加的结果并打印
 */
public class Task03 {
	public static void main(String[] args) {
		//1. 定义数组
		int[] arr={10,20};
		//3. 调用方法，使用这个方法求出数组这两个元素相加的结果,打印累计和
		int sum = add( arr[0], arr[1] );
		System.out.println("sum=" + sum);
	}
	
	//2. 定义一个方法求两个数字的和
	/*
	 * 指定方法名称：add
	 * 指定方法参数：int a, int b
	 * 指定返回值：int
	 */
	public static int add(int a, int b){
		//求两个数字的和
		return a+b;
	}
}
