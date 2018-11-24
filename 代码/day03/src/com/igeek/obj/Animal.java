package com.igeek.obj;

//定义一个账户类 。
// 模拟ATM 存钱取钱。

// 面向对象  1。封装 。
public class Animal {

	private int legs;
	
	private String legs2;
	
	
	
	
	public String getLegs2() {
		
		return legs2;
	}

	public void setLegs2(String legs2) {
		
		this.legs2 = legs2;
	}

	//需要对外提供两个方法 。一个是set设置   get获取。
	public void setLegs(int legs){
		//this关键字  表示当前类对象本身 。  this.legs  表示 当前类中的成员边legs
		if(legs>0&&legs<10)
			this.legs=legs;
		else
			System.out.println("SB ，认真点。");
	}
	
	public int getLegs(){
		
		if(legs==0){
			System.out.println("请先设置legs。");
			
			return -1;
		}else{
			return legs;
		}
		
	}
	
	
}
