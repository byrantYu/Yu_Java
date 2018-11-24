package com.lattice.template;

/**
 * @use 模板设计模式 有一个抽象父类，其中有一些通用的(抽象)方法，交给子类来实现。
 * @author lattice
 *
 */
public class ModelDesignTest {

	public static void main(String[] args) {
		speak(new Peter());
		speak(new Mary());
		
	}
	public static void speak(Person person){
		person.say();
	}
}

abstract class Person {
	String name;
	int age;

	public abstract void say();

	public void eat() {
		System.out.println("所有人都会吃饭");
	}
}

class Peter extends Person {
	@Override
	public void say() {
		System.out.println("Peter 喜欢出牛排");
	}
}

class Mary extends Person {
	@Override
	public void say() {
		System.out.println("Mary 喜欢出沙拉");
	}
}