package com.igeek.oop;

public class Test2 {

	public static void main(String[] args) {
		/**
		 * 封装，继承，多态 
		 * 
		 * 封装:私有属性,set/get
		 * 封装:把实现某段功能的代码，写入到一个类中的过程。
		 * 
		 * 继承:extends关键字来表示继承关系，子类继承到父类所有属性跟方法 。私有属性跟方法不能被直接调用。
		 * 
		 * 多态:事物存在的多种状态。//张三    学生，人
		 * 	       允许不同的对象，对同一消息做出响应操作。
		 * 	   首先存在继承关系 ，发生重写，完成向上转型。多态实现的前提 。
		 * (接口跟实现类的关系，也可以看成一种特殊的继承关系。)
		 * 		Quan dog = new Dog();
		 * 		此时的dog 对象只能调用Quan类中的成员。
		 * 		当调用被子类覆盖的方法的时候，实际执行的是子类中的方法 。
		 * 	  
		 * 		父类 变量名 = new 子类();
		 * 		抽象类 变量名 = new 抽象类子类();
		 * 		接口  变量名  = new  接口的实现类();
		 * 		其实方法的重载，也是多态的一种体现。
		 */
		//son对象声明的引用 。
		//Son son = new Son();
		//Fu  s = new Son();
	}

	public void eat(){
		System.out.println("做什么吃什么");
	}
	public void eat(String name){
		System.out.println("吃"+name);
	}
}
