package com.igeek.generic5;

import java.util.ArrayList;

public class GenericTest {
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("哈哈");
		list.add("呵呵");
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(123);
		list2.add(456);
		
		ArrayList<Object> students = new ArrayList<Object>();
		
		Person<Student> p =new Student<Student>();
		//p.d
		//  指定了泛型的上边界  下边界 。
		p.dream(students);
		//必须传递一个ArryaList对象过来 。
		//p.dream(list2);
		
		
		
		
	}
	
}
