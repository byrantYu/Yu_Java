package com.igeek.day06.level2_1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/**
		 *  1.键盘录入10个整数存入数组中
			2.定义一个方法将奇数放在数组的左侧,偶数放在数组的右侧
			3.定义一个方法打印原数组和处理后的数组
		 */
		int [] arrays = new int [10];
		for (int i = 0; i < 10; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("请输入第"+(i+1)+"个数:");
			int input = sc.nextInt();
			arrays[i] = input;
		}
		// 对于引用数据类型 。 对象的内存 。
		int [] result = change(arrays);
		for (int i : arrays) {
			System.out.println(i);
		}
	}
	
	public static int [] change(int [] arrays){
		int [] newarr = new int [arrays.length];
		int j = 0;//定义奇数下标 。   0  
		int o = newarr.length-1;//定义偶数下标 。
		for (int i = 0; i < arrays.length; i++) {
				// arrays[i]%2!=0  表示是奇数 
				if(arrays[i]%2!=0){
					newarr[j]=arrays[i];
					j++;//每存一个下标就+1;
				}else{
					newarr[o]=arrays[i];
					o--;//右边每存一个元素 -1
				}
		}
		return newarr;
	}

}
