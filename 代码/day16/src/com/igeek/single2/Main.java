package com.igeek.single2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton single = Singleton.getInstance();
		//编译时 没有问题。
		//NullPointerException 空指针异常 。  对象的值为null ...
		single.chi();
	}

	//1.私有化构造器 
	//2.创建静态成员变量 。  (懒汉，饿汉式)
	//3.静态方法，返回成员变量。
}
