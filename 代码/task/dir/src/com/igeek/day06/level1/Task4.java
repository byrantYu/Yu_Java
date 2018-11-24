package com.igeek.day06.level1;

public class Task4 {

	public static void main(String[] args) {
		/**
		 * 定义一个方法，查找指定数字在数组中出现的位置(若出现多次，多次打印)
			如: 数组[1232]要查找的数是2 则方法内部会打印索引值 1 ,3 
			数组[1232] 要查找的数是5 则方法每部会打印 “数组中没有这个数字
		 */
		int [] arr = {1,2,3,4,5,4,3,2,1,0};
		getIndex(arr, 1);
		
	}
	
	public static void getIndex(int [] arr , int x ){
		//先默认数组中没有这个数 。
		boolean flag = false;
		//
		for (int i = 0; i < arr.length; i++) {
			if(x==arr[i]){
				System.out.println(i);
				flag = true;//找到这个数了 ，在数组中存在。
			}
		}
		if(flag==false){
			System.out.println("没有这个数!");
		}
	}

}
