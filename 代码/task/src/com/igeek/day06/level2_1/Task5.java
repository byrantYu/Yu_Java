package com.igeek.day06.level2_1;

public class Task5 {

	public static void main(String[] args) {
		/**
		 * 有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13... 
		 * 定义一个方法求出这个数列的前20 项之和。
		 */
		getSum();
	}
	
	public static void getSum(){
		//
		int [] fz = new int [20];
		int [] fm = new int [20];
		
		fz[0]=2;
		fz[1]=3;
		//fz[2]=5;
		//fz[3]=8;
		fm[0]=1;
		fm[1]=2;
		
		for(int i = 2; i < 20; i++) {
			fz[i] = fz[i - 1] + fz[i - 2];
			fm[i] = fm[i - 1] + fm[i - 2];
		}
		
		//
		double sum = 0;
		
		for (int i = 0; i < 20; i++) {
			sum += (fz[i]+0.0)/fm[i];
		}
		
		System.out.println("合是:"+sum);
	}

}
