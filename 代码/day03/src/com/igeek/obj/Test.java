package com.igeek.obj;

import java.util.UUID;

public class Test {

	public static void main(String[] args) {
		// 注意：创建对象  格式    对象的数据类型   对象名称 = new 构造器();
		
		Person tom = new Person();
		//直接调用 。
		//int result = tom.getSum();
		//System.out.println(result);
		
		//如何调用一个类中方法 ，通过对象.的方式进行调用。
		Person jack = new Person();
		
		tom.name="汤姆汉克斯";
		//tom.age=25;
		
		jack.name="杰克";
		//jack.age=100;
		
		tom.country="西班牙";
		System.out.println(tom.name);
		//System.out.println(tom.age);
		System.out.println(jack.name);
		//System.out.println(jack.age);
		System.out.println(jack.country);
		
		
		
		String country = Person.country;
		System.out.println(country);
		
		int result = Person.getSum();
		System.out.println(result);
		
		UUID uuid = UUID.randomUUID();
		uuid.toString();
		
		UUID.randomUUID().toString();
		
		//面向过程  。
		int i = Math.abs(-20);
		System.out.println(i);
		
		
		//new 就是在堆中新开辟空间。
		new Person();
		new Person();
		System.out.println(new Person()==new Person());
		
		//一般什么情况下使用匿名对象。
		
		//调用下面的非静态方法。      匿名对象的用法  主要用来当做参数传递 。
		Test test = new Test();
		//将匿名对象  作为实际参数  传递给方法 。
		test.displayPerson(new Person());
		
		//要多次使用一个对象的时候，不推荐使用匿名对象。   因为会在堆空间中创建多个不同的对象。
		new Person().name="托马斯";
		new Person().age=20;
	}

	public void displayPerson(Person person){
		person.display();
	}
	
	public void a(){
		
	}
}
