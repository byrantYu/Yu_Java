package com.igeek.single;

//Runtime 类 ，用到了单例设计模式。
public class Person {

	private static Person p = new Person();
	private Person(){
		
	}
	public static Person getInstance(){
		
		return p;
	}
	
}
