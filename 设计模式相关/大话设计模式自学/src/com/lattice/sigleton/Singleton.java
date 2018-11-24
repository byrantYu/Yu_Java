package com.lattice.sigleton;

/**
 * @use 单例设计模式
 * @author lattice
 * @date 2016-12-27
 */
public class Singleton {

	public static void main(String[] args) {
		SingletonClass.getInstance().say();
		SingletonClassLan.getInstance().say();

	}
}

/**
 * @use 单例类，单例设计模式测试类
 * @author lattice
 * 
 */
class SingletonClass {//饿汉式
	// 声明静态对象
	private static SingletonClass instance = new SingletonClass();

	// 私有化构造函数
	private SingletonClass() {

	}

	// 设置当前类对象的静态访问方法
	public static SingletonClass getInstance() {
		return instance;
	}

	public void say() {
		System.out.println("hello this is 饿汉式  a singleton!");
	}
}

class SingletonClassLan {//懒汉式暂时存在线程安全问题
	// 声明静态对象
	private static SingletonClassLan instance;// = new SingletonClassLan();

	// 私有化构造函数
	private SingletonClassLan() {

	}

	// 设置当前类对象的静态访问方法//通过synchronized（同步）处理懒汉式单例设计模式存在的线程安全问题。
	//synchronized保证了线程安全，但是降低了效率。
	public static synchronized SingletonClassLan getInstance() {
		//instance = new SingletonClassLan();
		if(instance == null){//通过if处理第一次调用instance对象未被初始化
			instance = new SingletonClassLan();
		}
		return instance;
	}

	public void say() {
		System.out.println("hello this is a 懒汉式 singleton!");
	}
}
