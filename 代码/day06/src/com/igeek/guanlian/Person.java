package com.igeek.guanlian;

public class Person {

	private String name;
	private int age;
	private Pet pet;//½âñî £¬ñîºÏ ¡£ Pet pet = =new Pet("ÑÛ¾µÉß","»ÆÉ«","Éß");
	
	public Person(){
		
	}
	
	public Person(String name, int age, Pet pet) {
		super();
		this.name = name;
		this.age = age;
		this.pet = pet;
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
	public Pet getPet() {
		return pet;
	}
	public void setPet(Pet pet) {
		this.pet = pet;
	}
	
	
}
