package com.igeek.level02_02;
/*
 * 		1.定义Student类
			属性:
				姓名：String name
				年龄：int age
				成绩：int score
			行为:
				空参构造方法
				有参构造方法
				set和get方法
 */
public class Student {
	private String name;
	private int age;
	private int score;
	public Student() {
		super();
	}
	public Student(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
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
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
}
