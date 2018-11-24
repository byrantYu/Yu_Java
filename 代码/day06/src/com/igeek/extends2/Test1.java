package com.igeek.extends2;

public class Test1 {

	public static void main(String[] args) {
		//this. 来调用当前类中的属性跟方法。
		//super. 来调用父类(直接父类，间接父类)中的成员跟方法。
		
		//this跟super还可以用来调用构造器 。
		//super() 表示调用父类的无参的构造器 。super("哈哈") 表示调用父类中，只有一个参数，且类型是字符串的构造器。
		//this() 表示调用当前类中的构造器 。
		
		//注意：this(),super()在调用构造器的时候，必须写在构造器的第一行。
		Sun sun = new Sun();
		sun.show();
	}

}
