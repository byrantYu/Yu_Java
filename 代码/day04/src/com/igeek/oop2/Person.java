package com.igeek.oop2;
/**
 * 
 * 
 * @author 极客营
 * @Version 1.0 2018年8月16日
 * Company wh.igeekhome.com
 * 
 * 
 * 构造函数  ，构造器 ，构造方法。
 * 	语法  ：  访问修饰符跟类的访问修饰符一致，没有返回值类型注意：连void都没有。
 * 			还要求构造方法的名称必须跟类名称一致。
 * 			注意：构造器的参数列表可有可无。
 * 构造器的作用，创建对象，并给对象进行初始化。(初始化的意思  就是给对象中的属性进行赋值。)
 * 
 * 在java中，当你写一个类的时候，构造器不用手动指定 。
 * 系统会默认给你添加一个空的无参数的构造器 。
 * public class Student{
 * 		public Student(){
 * 			super();
 * 		}
 * }
 * 
 * 构造器 是可以被重载的 。
 * 
 * 注意：以后在写代码的过程，自己指定构造器了，最好再去添加一个空的无参的构造器。
 * Spring...
 * 
 *  类中  
 *  	成员变量 
 *  	成员方法
 *  	构造器（1.创建对象2.给对象初始化）
 */
public class Person {
	private String name;
	private int age;
	private String sex;
	/*public Person(){
		
	}*/
	public Person(){
		
	}
	public Person(String name,int age,String sex){
		this.name=name;
		this.age=age;
		this.sex=sex;
	}
	//Overload 重载  。  Override 重写 。  注解  注释解释的作用 。JDK提供这样三个源生的注解 。@Override 表示判断下面的方法时候满足重写条件。
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	
	
}
