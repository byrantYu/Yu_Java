package com.igeek.test1;

public class Person {
	
	private String name;// 
	private int age;
	
	public void eat(){
		System.out.println("³Ô¡£");
	}
	public void getInfo(){
		System.out.println(name+age);
	}
	
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
