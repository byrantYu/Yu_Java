package com.igeek.reflection2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test1 {

	public static void main(String[] args) throws Exception {
		//通过反射  可以获得和使用一个类中所有的属性跟方法，包括私有的 。
		
		//获得反射对象 。
		//第一种方式  ， 类名.class属性 
		//Class classType = Person.class;
		//Class classType2 = new Person().getClass();
		//推荐使用的方式 。  可以拿到 Person这个 类的反射对象 。  Class 类型 。
		Class classType = Class.forName("com.igeek.reflection2.Person");
		Annotation[] annotations = classType.getAnnotations();//拿到当前类中所有的注解 。
		Method[] methods = classType.getMethods();//拿到这个类中所有的方法 。只包含共有的以及继承到的方法。
		//Method 类   所有方法所对应的类 就是Method类 。
		/*for (Method method : methods) {
			System.out.println(method);
		}*/
		/*Field[] fields = classType.getFields();//Field 属性字段的意思 。可以拿到当前类中所有的共有属性，包括继承得到的。
		for (Field field : fields) {
			System.out.println(field);
		}*/
		
		/*Constructor[] constructors = classType.getConstructors();
		for (Constructor constructor : constructors) {
			System.out.println(constructor);
		}*/
		Class[] interfaces = classType.getInterfaces();
		for (Class class1 : interfaces) {
			//System.out.println(class1.getName());
			System.out.println(class1.getSimpleName());
		}
		//  通过java反射   可以获得一个类中 所有的属性跟方法 ，包括构造器 。
	}
}
