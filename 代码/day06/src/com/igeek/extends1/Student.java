package com.igeek.extends1;

//在java中使用extends 关键字来表示继承关系。
//语法  public class A extends B   A是子类 ，B是父类。
//extends 扩展，延伸   (在java中表示继承。)
public class Student extends Person{

	//抽取共性 。
	//描述共同行为。
	
	//房子，车子(大众) 。  劳斯莱斯 。。。  子类在父类的基础上可以再扩展和延伸自己的属性跟方法。   
	
	
	
	public void learn(){
		System.out.println("学习。");
	}
}
