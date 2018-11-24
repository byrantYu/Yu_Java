package com.igeek.day12.oop2;

import java.util.ArrayList;

public class Pet {

	//名称
	private String name;
	
	//描述一类事物，具有很多个另一类事物的时候 ，可以考虑使用集合，也可以考虑使用数组 。
	private ArrayList<Pet> pets;

	public Pet(){
		
	}
	public Pet(String name, ArrayList<Pet> pets) {
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
