package com.igeek.property;

import java.io.Serializable;


//构造器 ，构造方法，构造函数 。。。
//JavaBean  ...  Entity    ... POJO    ...domain
public class Student implements Serializable{
	
	//封装 。。。
	private String name;
	private int age;
	
	//构造器 跟toString 根据实际需要再去添加 。
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
