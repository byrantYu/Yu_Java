package com.igeek.day06.level1;

public class Task3 {

	public static void main(String[] args) {
		/**
		 * ����һ������,��������������ڸ���int�������г��ֵĴ���,���һ��û�г����򷵻�0
			��:��������3 ���3������ int[] arr = {3,4,3,5,7,9};�г��ֵĴ���
		 */
		int[] arr = {3,4,3,5,7,9,9};
		int result = getCount(arr, 3);
		System.out.println(result);
	}
	//arr ��ʾ��Ҫ�жϵ�����   x ������Ҫͳ�Ƶ��Ǹ�����
	public static int getCount(int [] arr, int x){
		int count = 0;//������ ��������־��ۼ�
		for (int i = 0; i < arr.length; i++) {
			if(x==arr[i]){
				count++;
			}
		}
		return count;
	}
}
