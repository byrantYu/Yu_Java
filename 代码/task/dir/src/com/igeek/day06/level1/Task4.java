package com.igeek.day06.level1;

public class Task4 {

	public static void main(String[] args) {
		/**
		 * ����һ������������ָ�������������г��ֵ�λ��(�����ֶ�Σ���δ�ӡ)
			��: ����[1232]Ҫ���ҵ�����2 �򷽷��ڲ����ӡ����ֵ 1 ,3 
			����[1232] Ҫ���ҵ�����5 �򷽷�ÿ�����ӡ ��������û���������
		 */
		int [] arr = {1,2,3,4,5,4,3,2,1,0};
		getIndex(arr, 1);
		
	}
	
	public static void getIndex(int [] arr , int x ){
		//��Ĭ��������û������� ��
		boolean flag = false;
		//
		for (int i = 0; i < arr.length; i++) {
			if(x==arr[i]){
				System.out.println(i);
				flag = true;//�ҵ�������� ���������д��ڡ�
			}
		}
		if(flag==false){
			System.out.println("û�������!");
		}
	}

}
