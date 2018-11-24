package com.igeek.reflection2;

import java.io.Serializable;

@Deprecated
@SuppressWarnings("unused")
public class Person extends Persons implements Serializable{

	public String name;
	public int age;
	private String dream;
	public Person(){
		
	}
	public Person(String name,int age){
		
	}
	
	private void dream(){
		System.out.println("³ÔºÈæÎ¶Ä¡£¡£¡£");
	}
	private String dream(String str){
		return str;
	}
	private String dream(String str,int i,char c){
		return str+i+c;
	}
	public static void haha(){
		System.out.println("¹þ¹þ¹þ¹þ");
	}
	static void haha2(){
		
	}
	protected static void haha3(){
		
	}
}
