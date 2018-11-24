package com.igeek.abstract1;

public class Test1 {

	public static void main(String[] args) {
		//Quan lang = new Quan();
		
		//向上转型  。  声明父类对象，由子类完成实例化操作 。
		// 对于这种写法而言  。 dog1 对象  只能调用当前类，所有的方法 。
		Quan dog1 = new Dog();
		dog1.speak();
		dog1.eat();
		dog1.dream();
		
		//单独创建dog2的对象 。
		//Dog dog2 = new Dog();
		//dog2.mimi();
		
		
		//多态 : 事物存在的多种形态。
		//允许不同的对象，对同一消息做出相应操作。
		//在java的代码中 。 首先要有继承关系，然后发生重写 ，然后还要完成向上转型 。
		
		
		//你们早上吃什么  。  1.狼   2.妹    3.无 
		
	}

}
