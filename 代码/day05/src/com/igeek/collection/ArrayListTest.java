package com.igeek.collection;

import java.util.ArrayList;

import com.igeek.objarr.Phone;

//collection 集合框架 。
public class ArrayListTest {

	public static void main(String[] args) {

		//集合 。
		ArrayList list = new ArrayList();
		
		list.add("hello");
		list.add(123);
		list.add(new Phone());
		list.add(null);
		list.add("sadfs");
		System.out.println(list.size());
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//size() 表示集合的大小 。
		//add() 向容器中添加元素。
		//get(int index) 获取指定下标所对应的元素。
		
	}

}
