package com.igeek.day06.level2_1;

import java.util.ArrayList;

public class Task4 {

	public static void main(String[] args) {
		/**
		 *  �����������󣬲��ô���ʵ��
			1.��1-500֮����ͬʱ��2��5��7��������������������5��һ�д�ӡ
			2.��100�����ܱ�3�������������ܱ�5���������ĺ�
		 */
		
		getOne();
	}
	
	public static void getOne(){
		int count = 0;//��¼�ܴ�����
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
		System.out.println("����Ϊ:"+count);
		
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
