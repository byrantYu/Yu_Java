package com.igeek.oop;
/**
 * 
 * 值传递，传递的是值本身 。
 * 引用传递，传递的是对象的内存地址 。
 * 
 * 只有值传递 ，传递的都是对象的副本 。
 */
public class ArgumentsDemo1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;//局部变量在栈中。
		change(a,b);
		//
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void change(int a , int b){
		a = 100;
		b = 200;
		System.out.println(a);
		System.out.println(b);
	}

}
