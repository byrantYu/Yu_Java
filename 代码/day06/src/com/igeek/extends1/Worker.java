package com.igeek.extends1;

public class Worker extends Person{

	/**
	 * Overload 重载 。  在一个类中，允许出现同名方法，只要他们的参数列表不同，即是重载 (跟返回值类型无关)。
	 * 
	 * Override 重写 。
	 * 		首先存在继承关系 ，然后子类中出现跟父类中同名的方法。
	 * 		1.(访问权限修饰符 ，子类方法的访问权限修饰符必须大于等于父类方法的访问权限修饰符。)
	 * 		2.(子类的返回值类型，必须跟父类一致。)
	 * 		3.(参数列表必须一致。)
	 * 			4.(子类所抛异常的范围小于等于父类。)
	 * 		5.要么都是static，要么都是非static。
	 * 			//  Exception 所有异常类的父类  。
	 * 			//  Error 错误类 。
	 * 			//Throwable 
	 * 		public > protected > default > private
	 * 
	 *  final 最终的 ：
	 *  	被 final 修饰的属性，常量。
	 *  	被 final 修饰的类 ，不能被继承。String.
	 *  	被 final 修饰的方法，不能被重写。
	 */
	//使用注解来帮助验证。@Override作用是判断下面的方法是否满足重写条件。
	@Override 
	public void dream(){
		
		//return "123";
	}
}
