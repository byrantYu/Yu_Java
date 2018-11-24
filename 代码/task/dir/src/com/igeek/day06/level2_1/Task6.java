package com.igeek.day06.level2_1;

import java.util.Random;

public class Task6 {

	public static void main(String[] args) {
		/**
		 * �����������󣬲��ô���ʵ��
1.������������Ϊ10�����飬������Ԫ��Ϊ������ɵġ����ظ��� 1-100֮��������� [1,2][1,2]
2.����һ�������������������飬�����н��������鲻ͬ��Ԫ��ƴ�ӳ�һ���ַ��������ҽ����ַ����Լ��ַ����ĳ������������̨�ϣ�
		���û�������"�Բ����������������Ԫ�ؾ���ͬ"

		 */
		int [] arr1 = getArray();
		int [] arr2 = getArray();
		/*for (int i : arr1) {
			System.out.print(i+"\t");
		}
		System.out.println();
		for (int i : arr2) {
			System.out.print(i+"\t");
		}*/
		
		print(arr1,arr2);
	}
	
	//�ȱ�������һ�����飬�����е�ÿһ��Ԫ��ȥ�ж�����һ���������Ƿ���ڣ�������ڲ�ƴ�ӣ���������ھ�ƴ��   
	//�ٱ�������һ�����飬�����е�ÿһ��Ԫ��ȥ�ж�����һ���������Ƿ���ڣ�������ڲ�ƴ�ӣ���������ھ�ƴ��
	public static void print(int [] arr1,int [] arr2){
		String result = "";
		for (int i = 0; i < arr1.length; i++) {
			//�ж��Ƿ���ڣ�������������С�
			boolean flag = exist(arr2, arr1[i]);
			if(flag==false){
				result = result + arr1[i] + " ";
			}
		}
		
		for (int i = 0; i < arr2.length; i++) {
			boolean flag = exist(arr1, arr2[i]);
			if(flag==false){
				result = result + arr2[i] + " ";
			}
		}
		//������ƴ����ɺ���ַ�����
		System.out.println(result);
		if(result.length() == 0) {
			System.out.println("������");
		} else {
			System.out.println("������" + result.replace(" ", "").length());
		}
	}
	
	public static int [] getArray(){
		int [] arr = new int [10];
		Random r = new Random();
		for (int i = 0; i < arr.length; i++) {
			//arr[i]=r.nextInt(100)+1;
			//�õ��������
			int number = r.nextInt(100)+1;
			//flag �ж��Ƿ���� ��
			boolean flag = exist(arr, number);
			//��ʾ�������в���������������
			if(flag==false){
				//������  ��ȥ���������� ��
				arr[i]=number;
			}else{
				i--;
			}
		}
		return arr;
	}
	
	//�ж��������Ƿ���ڸ�Ԫ�ء�
	public static boolean exist(int [] arr,int number){
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == number) {
				return true;
			}
		}
		return false;
	}
	
	
	

}
