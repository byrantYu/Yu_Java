package com.igeek.property2;

public class Student {

	private int id;
	private String name;
	
	//没有无参 。
	
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}
