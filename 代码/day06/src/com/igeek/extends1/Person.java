package com.igeek.extends1;

public class Person {

	public String name;
	protected int age;
	String sex;
	private double money;
	
	public double getMoney() {
		return money;
	}
	public void setMoney(double money) {
		this.money = money;
	}
	//学生类 ，老师类，工人类 。  都是人 。
	public void eat(){
		System.out.println("吃");
	}
	protected void play(){
		System.out.println("玩");
	}
	protected void dream() throws NullPointerException{
		System.out.println("梦想");
	}
	 
	private void piao(){
		 System.out.println("。。。飘");
	}
	//可以通过这种方式 让子类调用。
	public void toSun(){
		piao();
	}
}
