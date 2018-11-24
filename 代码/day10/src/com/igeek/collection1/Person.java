package com.igeek.collection1;

public class Person {

	private String name;
	private int age;
	
	public Person(){
		
	}
	//父类 Object 
	@Override  
	public int hashCode() {
		//生成一个返回 int 类型的hash 值 。
		//hash值跟 对象自身的属性相关 。
		//常数。
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	//不重写equals 之前  判断是   ==  内存地址 。
	// Person tom = new Person("汤姆",10);
	// Person jack = new Person("汤姆",10);
	//tom.equals(jack);
	@Override
	public boolean equals(Object obj) {
		// this = 0x7788      obj = 0x1234;
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
			//!true    ==> false
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//native 表示本地方法。是用其他编程语言实现的 。native
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//Object 
	
}
