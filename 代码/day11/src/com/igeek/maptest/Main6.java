package com.igeek.maptest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main6 {

	public static void main(String[] args) {
		//
		List<Integer> list = new ArrayList<Integer>();

		list.add(2);
		list.add(7);
		list.add(6);
		list.add(10);
		list.add(9);

		// ���÷���,������תΪObject��������
		Object[] objArr = list.toArray();
		// Arrays.toString() ��������ת���ַ��� ��
		System.out.println(Arrays.toString(objArr));
		//
		Integer i = (Integer) objArr[0];
		// intValue ��ʾ�Ѱ�װ����� ת���ɻ����������� ��
		System.out.println(i.intValue());

		// ���÷���,������תΪ�����͵�����
		Integer[] intArr = new Integer[10];// null  null  null null  null
		//����㴫������鳤�� С�ڼ��ϳ��� �� ��������һ���µ����� ������ĳ��ȸ����ϵĳ���һ�� ��
		Integer[] returnArr = list.toArray(intArr);

		System.out.println(Arrays.toString(intArr));
		System.out.println(Arrays.toString(returnArr));
		
		Integer it1 = intArr[0];
		System.out.println(it1);
	}

}
