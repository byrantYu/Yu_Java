package com.igeek.objarr;

public class Phone {

	private String brand;
	
	private int price;
	
	private String color;
	
	//spring 。。。
	public Phone(){
		
	}
	
	public Phone(String brand,int price,String color){
		this.brand=brand;
		this.price=price;
		this.color=color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	public void call(String name){
		System.out.println("给"+name+"打电话... ");
	}
	
	public void sendMessage(){
		System.out.println("群发骚扰短信。");
	}
	
}
