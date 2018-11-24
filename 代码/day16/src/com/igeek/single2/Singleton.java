package com.igeek.single2;

public class Singleton {

	//懒汉式    只声明 不赋值 。
	private static Singleton single;//null   0x1234
	private Singleton(){
		
	}
	//懒汉式。。。  存在线程安全问题。      Singleton.class
	public static synchronized Singleton getInstance(){
		if(single==null){
			//线程1 0x5566  ，线程2 0x7788
			single=new Singleton();
		}
		return single;//0x1234
	}
	
	public void chi(){
		System.out.println("人爱吃。");
	}
}
