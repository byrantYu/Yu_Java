package com.igeek.level02_03;

public class MainApp {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.setBreed("��˹è");
		c.setColor("��ɫ");
		c.eat();
		c.catchMouse();
		
		Dog d = new Dog();
		d.setBreed("����");
		d.setColor("��ɫ");
		d.eat();
		d.lookHome();
	}
}
