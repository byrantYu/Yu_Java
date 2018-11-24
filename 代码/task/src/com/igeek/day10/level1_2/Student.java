package com.igeek.day10.level1_2;

public class Student {
	private String id;//学号
	private String name;//名字
	private String sex;// 性别
	private String age;//年龄
	
	
	public Student() {
		super();
	}
	public Student(String id, String name, String sex, String age) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age ;
	}
	
}
