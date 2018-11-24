package com.igeek.extends1;

public class Test{

	/**
	 * 通过继承关系，子类可以继承到父类所有的属性，跟方法。 但是私有成员。不能被直接调用。
	 */
	public static void main(String[] args) {

		//java中的继承是抽取共性，提高了代码的复用性。
		Student stu = new Student();
		System.out.println(stu.name);
		System.out.println(stu.sex);
		System.out.println(stu.age);
		stu.eat();
		stu.dream();
		stu.play();
		stu.setMoney(200000.0);
		System.out.println(stu.getMoney());
		//stu.piao();
		//stu.notify();//Object
		/**
		 * 在java类的中继承关系，只能是单一继承。
		 * 一个类有且只有一个父类 。（祖先类。）
		 * 
		 * 在java中默认Object类是所有类的父类 。
		 * 
		 *  直接父类 ，你继承谁  谁就是你的直接父类 。 你父类继承谁，谁就是你的间接父类 。
		 *  
		 *  注意，在设计继承关系的时候，最好不要超过3重。
		 */
		
		//java  解决实际问题 。
		
		// 继承关系必须符合is a的关系,即我是你的一种  
		// 意思就是 ： 比如  蛇类   去  继承 人类   这个不允许。
	}

}
