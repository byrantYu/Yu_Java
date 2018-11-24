package com.igeek.abstract1;
//一旦子类继承抽象类 ，子类必须  重写(复写，覆盖)Override 父类中所有的抽象方法。
public class Dog extends Quan {

	@Override
	public void speak() {
		System.out.println("旺旺旺旺...");
	}

	@Override
	public void eat() {
		System.out.println("狗粮。。。");
	}

	@Override
	public void dream() {
		System.out.println("脱离单身，不再是single-dog...");
	}

	public void mimi(){
		System.out.println("我喜欢女主人。。。");
	}
}
