package com.igeek.oop;

/**
 *  *****
 *   值传递，引用传递 。
 *   注意：在java中参数传递的方式  只有一种，我们叫做值传递 。即传递对象的副本。
 * 
 * @author 极客营
 * @Version 1.0 2018年8月15日
 * Company wh.igeekhome.com
 */
public class TestMethod2 {
	//当形式参数是基本数据类型的时候，形式参数的改变不影响实际参数。
	
	public static void setAge(int age){
		age = 20;
	}
	//这个位置需要我们传入一个对象 。Student
	public static void setStudentId(Student stu){
		stu.id=20;
	}
	
	public static void main(String[] args) {
		//int age = 18;//我的年龄
		//setAge(age);//实参 。
		//System.out.println(age);
		
		//创建一个student对象 。
		
		//Student jack = new Student();
		//System.out.println(tom.id);
		//System.out.println(jack.id);
		//System.out.println(tom==jack);
		Student tom = new Student();
		setStudentId(tom);
		
		System.out.println(tom.id);
	}

}
