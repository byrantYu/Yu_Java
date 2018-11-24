package com.igeek.day06.level2_1;

public class Task2 {

	public static void main(String[] args) {
		/**
		 *  定义一个方法传入一个int类型数组，输出这个数组中每一个数字及其出现的个数
			例如 传入数组[1,2,2,2,3,3,4,4,4,4]  打印结果：
			数字1出现了1次
			数字2出现了3次…
		 */
		int [] arrays  = {1,2,2,3,3,4,4,4,5};
		getResult(arrays);
	}
	
	public static void getResult(int [] arrays){
		
		//存储元素的出现   
		int [] eleArr = new int [arrays.length];
		//默认从第一个开始查找。
		eleArr[0]=arrays[0];
		//已经到第一个元素的位置。
		int size = 1;
		//记录元素出现的个数。
		int [] count = new int [arrays.length];
		//第一个元素已经出现一次。
		count[0]=1;
		
		
		for (int i = 1; i < arrays.length; i++) {
			//判断    统计元素出现的数组，默认没有出现。
			boolean flag = false;
			//到统计元素出现的数组中对比，是否出现过。
			for (int j = 0; j < size; j++) {
				//元素出现了
				if(arrays[i]==eleArr[j]){
					flag = true;//统计元素出现的数组中已经有该元素。
					count[j]++;//只需要将次数+1
				}
			}
			//元素没有出现。
			if(flag==false){
				//把这个元素   记录在  元素统计的数组中 。
				eleArr[size] = arrays[i];
				//同样 该元素对应位置的数字变成 1 ，证明已经出现了1次。
				count[size] = 1;
				//下标要继续增长。
				size++;
			}
			
		}
		
		
		for (int i = 0; i < size; i++) {
			System.out.println(eleArr[i]+"出现了"+count[i]+"次");
		}
	}

}
