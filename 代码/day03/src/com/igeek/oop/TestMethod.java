package com.igeek.oop;

public class TestMethod {
	/**
		方法的重载  (Overload)
		
		首先，在同一个类中。允许出现同名方法 ，只要他们的参数列表（参数的个数跟类型。）不同，就是重载。跟返回值类型无关。
	 */
	
	public static void play(int x){
		System.out.println("玩!");
	}
	public static void play(char y,int x){
		System.out.println("玩！！！！！");
	}
	public static int play(){
		
		return 123;
	}
	
	public static void main(String[] args) {
		// 注意： 在方法调用的时候，方法声明的是什么类型，你就要实际传递什么类型，不然多个方法重载之后，可能造成调用冲突。
		play('A',0);	
		play(123);  //重载的方法  ，在调用的时候，通过参数列表进行区分。
	}

}
