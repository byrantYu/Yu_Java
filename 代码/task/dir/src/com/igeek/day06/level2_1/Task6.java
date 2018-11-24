package com.igeek.day06.level2_1;

import java.util.Random;

public class Task6 {

	public static void main(String[] args) {
		/**
		 * 分析以下需求，并用代码实现
1.创建两个长度为10的数组，数组内元素为随机生成的、不重复的 1-100之间的整数， [1,2][1,2]
2.定义一个方法，传入两个数组，方法中将两个数组不同的元素拼接成一个字符串，并且将该字符串以及字符串的长度输出到控制台上；
		如果没有则输出"对不起两个数组的所有元素均相同"

		 */
		int [] arr1 = getArray();
		int [] arr2 = getArray();
		/*for (int i : arr1) {
			System.out.print(i+"\t");
		}
		System.out.println();
		for (int i : arr2) {
			System.out.print(i+"\t");
		}*/
		
		print(arr1,arr2);
	}
	
	//先遍历其中一个数组，拿其中的每一个元素去判断在另一个数组中是否存在，如果存在不拼接，如果不存在就拼接   
	//再遍历另外一个数组，拿其中的每一个元素去判断在另一个数组中是否存在，如果存在不拼接，如果不存在就拼接
	public static void print(int [] arr1,int [] arr2){
		String result = "";
		for (int i = 0; i < arr1.length; i++) {
			//判断是否存在，这个数在数组中。
			boolean flag = exist(arr2, arr1[i]);
			if(flag==false){
				result = result + arr1[i] + " ";
			}
		}
		
		for (int i = 0; i < arr2.length; i++) {
			boolean flag = exist(arr1, arr2[i]);
			if(flag==false){
				result = result + arr2[i] + " ";
			}
		}
		//最后输出拼接完成后的字符串。
		System.out.println(result);
		if(result.length() == 0) {
			System.out.println("不存在");
		} else {
			System.out.println("长度是" + result.replace(" ", "").length());
		}
	}
	
	public static int [] getArray(){
		int [] arr = new int [10];
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			//arr[i]=r.nextInt(100)+1;
			//拿到随机数。
			int number = r.nextInt(100)+1;
			//flag 判断是否存在 。
			boolean flag = exist(arr, number);
			//表示新数组中不存在这个随机数。
			if(flag==false){
				//不存在  再去放这个随机数 。
				arr[i]=number;
			}else{
				i--;
			}
		}
		return arr;
	}
	
	//判断数组中是否存在该元素。
	public static boolean exist(int [] arr,int number){
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == number) {
				return true;
			}
		}
		return false;
	}
	
	
	

}
