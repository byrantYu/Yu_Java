package com.igeek.generic5;

import java.util.ArrayList;

public class GenericTest {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("����");
		list.add("�Ǻ�");
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(123);
		list2.add(456);
		
		ArrayList<Object> students = new ArrayList<Object>();
		
		Person<Student> p =new Student<Student>();
		//p.d
		//  ָ���˷��͵��ϱ߽�  �±߽� ��
		p.dream(students);
		//���봫��һ��ArryaList������� ��
		//p.dream(list2);
		
		
		
		
	}
	
}
