package com.igeek.day06.level2_1;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		/**
		 *  1.����¼��10����������������
			2.����һ������������������������,ż������������Ҳ�
			3.����һ��������ӡԭ����ʹ���������
		 */
		int [] arrays = new int [10];
		for (int i = 0; i < 10; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("�������"+(i+1)+"����:");
			int input = sc.nextInt();
			arrays[i] = input;
		}
		// ���������������� �� ������ڴ� ��
		int [] result = change(arrays);
		for (int i : arrays) {
			System.out.println(i);
		}
	}
	
	public static int [] change(int [] arrays){
		int [] newarr = new int [arrays.length];
		int j = 0;//���������±� ��   0  
		int o = newarr.length-1;//����ż���±� ��
		for (int i = 0; i < arrays.length; i++) {
				// arrays[i]%2!=0  ��ʾ������ 
				if(arrays[i]%2!=0){
					newarr[j]=arrays[i];
					j++;//ÿ��һ���±��+1;
				}else{
					newarr[o]=arrays[i];
					o--;//�ұ�ÿ��һ��Ԫ�� -1
				}
		}
		return newarr;
	}

}
