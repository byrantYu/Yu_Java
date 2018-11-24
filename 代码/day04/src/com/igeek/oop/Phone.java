package com.igeek.oop;

public class Phone {
	//共同特征。
	public String brand;
	
	public int price;
	
	public String color;
	
	
	
	//行为。
	public void call(String name){
		int a =0;
		name = "张惠妹";
		System.out.println("给"+name+"打电话。"+a);
	}
	
	public void sendMessage(){
		System.out.println("群发骚扰短信。");
	}
}
