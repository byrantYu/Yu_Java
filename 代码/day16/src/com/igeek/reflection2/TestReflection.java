package com.igeek.reflection2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TestReflection {
	/**
	 * 动态加载：程序在运行时调用相应方法，即使其他方法是错误的，
	 * 程序依旧会执行。通过动态加载可以让程序的可延长性大大提升，
	 * 对以后的维护和扩展有重要意义。
		
	 *静态加载：程序在编译时执行。在执行过程中加载所有可能执行到的程序。
	 *在这种加载方式下，只要加载中一个方法出错，程序就不能运行。
	 *我们一般写程序默认的是静态加载。
	 *
	 *
	 *Java反射机制容许程序在运行时加载、探知、使用编译期间完全未知的classes。
	 *通过JAVA的反射机制，可以获得程序内部或第三方JAR包的CLASS，METHOD,属性，
	 *参数等信息
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		//java反射 。 
		//反射能干什么 ，动态的获得一个类中所有的信息 。
		//需要使用 Class类的对象  。  Class 类 。    A   Person  String
		//使用 Class 来表示所有的类 。 Class类中定义了  所有类的行为跟特征 。
		
		//Class 对象是使用反射的一个源头 。
		
		//获得Class对象的三种方式 。
		
		//类类型 
		Class classType = Person.class;//Person.class 就是Person类所对应的.class文件 。
		
		Person tom = new Person();
		Class classType2 = tom.getClass(); //第二种  获得类类型对象的方式 。
		
		Class classType3 = Class.forName("com.igeek.reflection2.Person");
		
		Annotation[] ans = classType.getAnnotations();
		for (Annotation annotation : ans) {
			System.out.println(annotation);
		}
		
		//类类型对象 . getMethods(); 可以拿到当前类中所有的方法 。 返回值类型是一个数组 。
		Method[] methods = classType.getMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}
	}

}
