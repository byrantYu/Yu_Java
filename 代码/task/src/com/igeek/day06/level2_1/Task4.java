package com.igeek.day06.level2_1;

import java.util.ArrayList;

public class Task4 {

	public static void main(String[] args) {
		/**
		 *  分析以下需求，并用代码实现
			1.求1-500之内能同时被2，5，7整除的所有数及个数并5个一行打印
			2.求100以内能被3整除的数加上能被5整除的数的和
		 */
		
		getOne();
	}
	
	public static void getOne(){
		int count = 0;//记录总次数。
		for (int i = 1; i < 501; i++) {
			if(i%2==0&&i%5==0&&i%7==0){
				count++;//
				System.out.print(i+"\t");
				if(count%5==0){//
					System.out.println();
				}
			}
		}
		System.out.println();
		System.out.println("总数为:"+count);
		
	}
	
	public static int  getSum(){//3 5  15 
		int sum = 0;
		for (int i = 0; i < 100; i++) {
			if(i%3==0 || i%5==0){
				sum+=0;
			}
		}
		return sum;
	}
}
