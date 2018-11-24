package com.igeek.oop3;

public class Student {
	
	private String name;
	
	/*
	 * public Student(){
	 * 
	 * }
	 */
	public Student(String name){
		this.name=name;
	}
	


	//正常方法 成员方法。
	public void learn(){
		System.out.println(name+"学习。");
	}
	
	//操作属性。
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
