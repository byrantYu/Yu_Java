package com.igeek.bean;

import java.util.Arrays;

//javaBean  ...  entity   ...  POJO   ...domain...
//实体类 。    就是一个java类 类中的属性做了封装 ，根据需求 可以加入自定义构造器或者toString..等
public class User {

	private String uid;
	
	private String userName;
	
	private String password;
	
	private String [] hobbies;
	
	private int age;

	//字段Field、属性Property
	private String description;//description  field 字段 。
	
	
	public User() {
		super();
	}

	public User(String uid, String userName, String password,
			String[] hobbies, int age) {
		super();
		this.uid = uid;
		this.userName = userName;
		this.password = password;
		this.hobbies = hobbies;
		this.age = age;
	}
	
	//desc property ...
	public String getDesc() {
		return description;
	}

	public void setDesc(String description) {
		this.description = description;
	}

	//uid  属性  就代表了  去掉set/get  首字母小写 。
	//例子:
	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [uid=" + uid + ", userName=" + userName + ", password="
				+ password + ", hobbies=" + Arrays.toString(hobbies) + ", age="
				+ age + "]";
	}
	
	
	
	
	
}
