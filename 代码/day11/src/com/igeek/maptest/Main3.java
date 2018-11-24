package com.igeek.maptest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main3 {

	public static void main(String[] args) {
		
		//�������� ��������  Arrays 
		int [] a = {1,2,45,7653,32,123,0};
		Arrays.sort(a);
		Arrays.binarySearch(a, 2);
		//Arrays.toString() ��Ҫ���������� ת�����ַ������ ��
		System.out.println(Arrays.toString(a));
		
		
		//�������� �� ������  Collections
		ArrayList<String> list = new ArrayList<String>();
		
		Collections.addAll(list,"��С��","����","��ȫ��");
		
		System.out.println(list);
		
		//����һ�����ĺ� ��
		
		int sum = test(10,20);
		System.out.println(sum);
		
		int [] arrs = {10,20};
		int sum2 = test1(arrs);
		System.out.println(sum2);
	}

	//�����Ŀɱ���� ��JDK 1.5֮��ű�֧�ֵġ�
	//ע�� �ɱ���� ����д��ǰ�� ������ֻ��Ҫ��һ���ɱ���� ��
	// ע�� ���ɱ���� �ᱻ�������� ������ �� ���˿ɱ����֮�����Ƕ��ڲ�����ȷ��������� ������ȥ�������������صķ��� ��
	public static int test(int ... haha){
		int sum = 0;
		for (int i = 0; i < haha.length; i++) {
			sum+=haha[i];
		}
		return sum;
	}
	//int ... haha  �ȼ���   int [] haha  һ���ġ�
	public static int test1(int [] haha){
		int sum = 0;
		for (int i = 0; i < haha.length; i++) {
			sum+=haha[i];
		}
		return sum;
	}
	/*
	 * ���ڲ���������ȷ��������£��������ص�д�� �Ƚϸ��� �� jdk 1.5֮�� �Ƽ�ʹ�ÿɱ���� ��
	 * public static int sum(int a){
		int sum = 0;
		sum+=a;
		return sum;
	}
	public static int sum(int a,int b){
		int sum =0 ;
		sum+=a;
		sum+=b;
		return sum;
	}*/
}
