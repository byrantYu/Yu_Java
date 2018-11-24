package com.igeek.day06.level2_1;

import java.util.Random;
import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		/**
		 * 分析以下需求，并用代码实现		
	1.提示用户输入10个整数，存入到int数组中；根据以下要求实现相关功能
	2.提示用户输入一个数字作为数组索引，查找数组中该索引对应的元素，
	（需要判断输入的数字是否在0-9之间包含临界值，如果该数字不符合要求则随机生成一个符合要求的索引）
	3.将a中得到的索引对应的元素的左右两边元素进行互换，若对应的元素是第一个或最后一个则不做任何操作
		 */
		int [] arr = {90,8,61,85,25,86,80,91,55,10};
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入索引值:");
		int index = sc.nextInt();
		if(index<0||index>9){
			Random r = new Random();
			index = r.nextInt(10);
		}
		System.out.println(index);
		
		
		//
		if(index!=0&&index!=arr.length-1){
			exchange(arr,index);//  1  2  3
		}
		for (int i : arr) {
			System.out.print(i+"\t");
		}
	}

	public static void exchange(int [] arr,int index){
		int temp = arr[index-1];
		arr[index-1]=arr[index+1];
		arr[index+1]=temp;
	}
}
