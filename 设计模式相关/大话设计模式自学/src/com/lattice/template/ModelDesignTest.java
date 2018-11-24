package com.lattice.template;

/**
 * @use ģ�����ģʽ ��һ�������࣬������һЩͨ�õ�(����)����������������ʵ�֡�
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
		System.out.println("�����˶���Է�");
	}
}

class Peter extends Person {
	@Override
	public void say() {
		System.out.println("Peter ϲ����ţ��");
	}
}

class Mary extends Person {
	@Override
	public void say() {
		System.out.println("Mary ϲ����ɳ��");
	}
}