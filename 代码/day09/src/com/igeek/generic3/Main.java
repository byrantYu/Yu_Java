package com.igeek.generic3;

import com.igeek.test1.Person;

public class Main {
	
	public static void main(String[] args) {
		GenericTest gt = new GenericTest();
		String str =  gt.set("123");  //子类    子类对象 = (子类)父类;
		System.out.println(str);
		
		Boolean flag = gt.set(true);
		System.out.println(flag);
		
		Person p = gt.set(new Person());
		System.out.println(p);
		
		 Integer i = gt.set(123);
		 System.out.println(i);
	}

}
