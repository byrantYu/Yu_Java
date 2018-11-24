package com.igeek.level02_03;

public class MainApp {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.setBreed("波斯猫");
		c.setColor("花色");
		c.eat();
		c.catchMouse();
		
		Dog d = new Dog();
		d.setBreed("藏獒");
		d.setColor("黑色");
		d.eat();
		d.lookHome();
	}
}
