package com.igeek.maptest;

import java.util.ArrayList;
import java.util.Collections;

public class Main4 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(3);
		list.add(53);
		list.add(72);
		//Collections.shuffle(list);//���ң����Դ���ԭʼ���ϵ�˳��
		//Collections.reverse(list);//���ϵķ�ת��
		//Collections.sort(list);
		//Collections.reverse(list);
		
		//ע��:ʹ�ö��ֲ��ҷ���ʱ�� ��Ӧ�������� ��Ȼ����ܲ�����ȷ��
		
		Integer i = Collections.binarySearch(list,30);//-5 
		//System.out.println(list);
		System.out.println(i);
		//0 - 100      60  
	}

}
