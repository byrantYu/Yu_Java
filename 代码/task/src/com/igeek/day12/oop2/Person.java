package com.igeek.day12.oop2;

import java.util.ArrayList;

//��    ���� ��    
public class Person {

	private String name;
	
	//һ��һ�Զ��ϵ ������
	private ArrayList<Pet> pets;
	public Person(){
		
	}
	public Person(String name, ArrayList<Pet> pets) {
		super();
		this.name = name;
		this.pets = pets;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Pet> getPets() {
		return pets;
	}

	public void setPets(ArrayList<Pet> pets) {
		this.pets = pets;
	}
	
	
}
