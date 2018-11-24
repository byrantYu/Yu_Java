package com.igeek.generic;

import java.util.ArrayList;

import com.igeek.test1.Person;

public class Main {

	public static void main(String[] args) {
		GenericTest<String,String> gt = new GenericTest<String,String>();
		gt.add("你好.");
		GenericTest<Integer,String> gt2 = new GenericTest<Integer,String>();
		gt2.add(123);
		GenericTest gt3 = new GenericTest();
		//当不指定泛型的时候，类中定义的泛型标示    就会是Object类型 。
		gt3.add(123);
		gt3.add("哈哈");
		gt3.add(true);
		
		
		
	}
	/**
	 * ArrayList list = new ArrayList();
		list.add("123");
		list.add(23);
		list.add(new Person());
		list.add(10.2);
		
		for (int i = 0; i < list.size(); i++) {
			String str = (String)list.get(i);
			System.out.println(str);
		}
	 */
}
