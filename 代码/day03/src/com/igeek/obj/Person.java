package com.igeek.obj;

public class Person {
	//人类 
	
	//属性  成员变量 。  描述事物所具有的共同的特征。
	//类变量   被static修饰的变量 。随着类的加载而加载，可以通过类名.的方式直接调用。当其中任意一个对象，改变其属性值，其他对象也会受影响。
	// 
	//实例(对象)变量 。 必须通过创建对象的方式 来调用 。每个对象拥有一套各自不同的副本 ，互不影响 。
	public String name;//null
	public int age;//0  注意  私有属性，只能在类的内部被访问 。
	public static String country="中国";//null
	
	
	/*public static void main(String[] args) {
	 *   
	 *   注意：局部变量  不能有访问修饰符 。
		int a = 10;
	}*/
	//静态方法不能访问非静态成员 。
	//非静态方法，是可以访问静态成员 。
	public void display(){
		int a = 0;
		System.out.println(name+age+country+a);
	}
	//人会计算  1到100的和。
	public static int getSum(){
		//1-100
		int sum = 0;
		for (int i = 1; i <=100; i++) {
			sum+=i;
		}
		
		return sum;
	}
}
