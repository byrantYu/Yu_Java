package com.igeek.io3;

import java.io.Serializable;

//һ���� Ҫ�뱻���л� ����ʵ��Serializable �ӿ� ��
public class Person implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -1614681193412303784L;
	/**
	 *  ArrayList
	 */
	

	public Person(){
		
	}
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//transient �� static ���ε����ԣ����ܱ����� �� 
	//transient ���ݵ�   static ��ʾ��̬�ġ�
	private  String name ;
	private  int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
