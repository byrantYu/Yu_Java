package com.igeek.day06.level2_1;

import java.util.Random;
import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		/**
		 * �����������󣬲��ô���ʵ��		
	1.��ʾ�û�����10�����������뵽int�����У���������Ҫ��ʵ����ع���
	2.��ʾ�û�����һ��������Ϊ�������������������и�������Ӧ��Ԫ�أ�
	����Ҫ�ж�����������Ƿ���0-9֮������ٽ�ֵ����������ֲ�����Ҫ�����������һ������Ҫ���������
	3.��a�еõ���������Ӧ��Ԫ�ص���������Ԫ�ؽ��л���������Ӧ��Ԫ���ǵ�һ�������һ�������κβ���
		 */
		int [] arr = {90,8,61,85,25,86,80,91,55,10};
		Scanner sc = new Scanner(System.in);
		System.out.println("����������ֵ:");
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
