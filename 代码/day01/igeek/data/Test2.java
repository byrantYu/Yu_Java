package com.igeek.data;

public class Test2 {
	/**
	 * 变量  ：	
	 * 		成员变量 
	 * 			1.实例变量 。没有被static修饰的变量。
	 * 			2.类变量。被static修饰的变量 。
	 * 		局部变量
	 * 			1.形参 ()小括号中的参数 。
	 */
	
	//成员变量  。  (全局变量 )。 static 表示静态的 。 静态方法能够访问非静态成员吗？不行。
	static int i = 100;
	int age = 20;
	public static void main(String[] args) {
		
		//show();
		//int ii3 = 100;
		//show2(ii3);//方法的调用 。  在java中方法可以被调用，但是方法不能嵌套。
		
		wan();
	}
	
	public static void show(){
		int i2 = 200;
		System.out.println(i);
		System.out.println(i2);
	}
	
	public static void show2(int ii){
		System.out.println(ii);
	}
	public static void wan(){
		//注意：方法只能被调用，不能嵌套，也不能互相调用，会进入死循环模式。
		play();
		System.out.println("wan方法。、");
	}
	public static void play(){
		wan();
		System.out.println("play方法、");
		{
			
		}
	}
	
	{
		//代码块  用单独的一个大括号来表示 。 { }
		int i = 10;
		System.out.println(i);
	}
}
