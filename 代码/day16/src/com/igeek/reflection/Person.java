package com.igeek.reflection;

import java.io.Serializable;

@Deprecated
@SuppressWarnings("unused")
public class Person implements Serializable{

	public String name;
	public int age;
	
	public Person(){
		
	}
	public Person(String name,int age){
		
	}
	
	private String dream(String str){
		return str;
	}
	public static void haha(){
		System.out.println("込込込込");
	}
}
