package com.igeek.day06.level1;

public class Task5 {

	public static void main(String[] args) {
		/**
		 * ����һ������,ʵ��ͬʱ������������ļӡ������ˡ����Ľ��,
		 * ��ͬʱ������ĸ��������(���ĸ������뵽һ�������в�����)
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
