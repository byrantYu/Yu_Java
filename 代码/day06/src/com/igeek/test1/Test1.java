package com.igeek.test1;

public class Test1 {

	public static void main(String[] args) {
		/*Person p = new Person();
		//多次调用当前类中的方法 。
		p.eat();
		p.getInfo();*/
		
		new Person().eat();//匿名对象的使用方式 ，当你只需要调用一个类中的某一个方法一次的时候可以使用匿名对象。
		new Person().getInfo();
		System.out.println(new Person()==new Person());
	}

}
