package com.igeek.day06.level2_1;

public class Task2 {

	public static void main(String[] args) {
		/**
		 *  ����һ����������һ��int�������飬������������ÿһ�����ּ�����ֵĸ���
			���� ��������[1,2,2,2,3,3,4,4,4,4]  ��ӡ�����
			����1������1��
			����2������3�Ρ�
		 */
		int [] arrays  = {1,2,2,3,3,4,4,4,5};
		getResult(arrays);
	}
	
	public static void getResult(int [] arrays){
		
		//�洢Ԫ�صĳ���   
		int [] eleArr = new int [arrays.length];
		//Ĭ�ϴӵ�һ����ʼ���ҡ�
		eleArr[0]=arrays[0];
		//�Ѿ�����һ��Ԫ�ص�λ�á�
		int size = 1;
		//��¼Ԫ�س��ֵĸ�����
		int [] count = new int [arrays.length];
		//��һ��Ԫ���Ѿ�����һ�Ρ�
		count[0]=1;
		
		
		for (int i = 1; i < arrays.length; i++) {
			//�ж�    ͳ��Ԫ�س��ֵ����飬Ĭ��û�г��֡�
			boolean flag = false;
			//��ͳ��Ԫ�س��ֵ������жԱȣ��Ƿ���ֹ���
			for (int j = 0; j < size; j++) {
				//Ԫ�س�����
				if(arrays[i]==eleArr[j]){
					flag = true;//ͳ��Ԫ�س��ֵ��������Ѿ��и�Ԫ�ء�
					count[j]++;//ֻ��Ҫ������+1
				}
			}
			//Ԫ��û�г��֡�
			if(flag==false){
				//�����Ԫ��   ��¼��  Ԫ��ͳ�Ƶ������� ��
				eleArr[size] = arrays[i];
				//ͬ�� ��Ԫ�ض�Ӧλ�õ����ֱ�� 1 ��֤���Ѿ�������1�Ρ�
				count[size] = 1;
				//�±�Ҫ����������
				size++;
			}
			
		}
		
		
		for (int i = 0; i < size; i++) {
			System.out.println(eleArr[i]+"������"+count[i]+"��");
		}
	}

}
