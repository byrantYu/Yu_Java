package com.igeek.property2;

public class Teacher {

	private int id;
	private String name;
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + "]";
	}
	public Teacher(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
}
