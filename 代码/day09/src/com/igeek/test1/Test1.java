package com.igeek.test1;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {

	public static void main(String[] args) {
		//ArrayList  �ײ�ʹ��Object [] ���洢 ��
		
		//����ӷ��͵�ʱ��һ��Ҫָ�������������͵İ�װ�� ��
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		//�������ϵķ�ʽ ��
		/*for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for (Integer sb : list) {
			System.out.println(sb);
		}*/
		//ʹ�õ��������� ���������ϡ�   
		//ʹ�õ���������������   �������������� ��  ��Ҫ�����ļ��� .iterator �����Ϳ����õ�һ������������
		/*Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
		
		//forѭ��+���������������ϡ�
		for (Iterator it = list.iterator(); it.hasNext();) {
			System.out.println(it.next());
		}
		
		//key - value   ��ֵ�Զ�    name - С��
	}

}
