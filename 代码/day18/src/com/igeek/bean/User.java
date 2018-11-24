package com.igeek.bean;

import java.util.Arrays;

//javaBean  ...  entity   ...  POJO   ...domain...
//ʵ���� ��    ����һ��java�� ���е��������˷�װ ���������� ���Լ����Զ��幹��������toString..��
public class User {

	private String uid;
	
	private String userName;
	
	private String password;
	
	private String [] hobbies;
	
	private int age;

	//�ֶ�Field������Property
	private String description;//description  field �ֶ� ��
	
	
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

	//uid  ����  �ʹ�����  ȥ��set/get  ����ĸСд ��
	//����:
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
