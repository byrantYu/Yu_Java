package com.igeek.single;

//Runtime �� ���õ��˵������ģʽ��
public class Person {

	private static Person p = new Person();
	private Person(){
		
	}
	public static Person getInstance(){
		
		return p;
	}
	
}
