package com.igeek.day06.level1;

public class Task5 {

	public static void main(String[] args) {
		/**
		 * 定义一个方法,实现同时求出两个整数的加、减、乘、除的结果,
		 * 并同时把这个四个结果返回(把四个数放入到一个数组中并返回)
		 */
		int [] result = getResult(10,2);
		for (int i : result) {
			System.out.println(i);
		}
	}
	
	public static int [] getResult(int a,int b){
		int [] arr = new int [4];
		arr[0]=a+b;
		arr[1]=a-b;
		arr[2]=a*b;
		arr[3]=a/b;
		return arr;
	}

}
