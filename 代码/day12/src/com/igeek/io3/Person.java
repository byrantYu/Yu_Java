package com.igeek.io3;

import java.io.Serializable;

//一个类 要想被序列化 必须实现Serializable 接口 。
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
	//transient 和 static 修饰的属性，不能被序列 化 
	//transient 短暂的   static 表示静态的。
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
