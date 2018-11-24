package com.igeek.this_super;

public class Dog {
	// 4个构造器 。this()   n-1
	public Dog() {
		this(10);
	}

	public Dog(int x) {
		this(10.0);
	}

	public Dog(double d) {
		this('A');
		//this('A');
	}

	public Dog(char c) {
		//不管this() 如何调  最终都会去执行super()...
	}

	//
	public void setDog() {
		System.out.println(this);
	}
}
