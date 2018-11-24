package com.igeek.level01_03;
/*
 * 		it001,ÎäËÉ,ÄĞ,22
		it002,ÁÖ³å,ÄĞ,20
		it003,Â¬¿¡Òå,ÄĞ,18
		it004,Ê¯±¦,ÄĞ,23
 */
public class Student {
	private String id;
	private String name;
	private String sex;
	private String age;
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
}
