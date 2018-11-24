package com.igeek.abstract1;

//抽象类 ，不能实例化自身  。不能创建自身类对象。

//抽象类中可以有非抽象方法。
//抽象类中可以有构造器，但是不能实例化自身 。构造器是给子类来使用的。
// 如果一个类中，存在抽象方法，那么这个方法所在的类一定是抽象类 。
public abstract  class Quan {

	// 事物所具有的共同特征跟行为 。

	public String name;
	public String type;
	public int age;

	public Quan() {
		//super();
	}

	public Quan(String name , String type,int age) {
		this.name=name;
		this.type=type;
		this.age=age;
	}
	//犬科东西 这一类事物 。 狗 ， 狼  ，藏獒   
	//狗   汪汪汪     狗粮  
	//狼    嗷呜呜    肉  
	//藏獒   吼吼吼。。。    肉+狗粮
	public abstract void speak();  //
	public abstract void eat();

	// 方法也可以被abstract关键字来修饰 。 抽象方法 没有方法体 。{ }
	public abstract void dream();// { }//

}
