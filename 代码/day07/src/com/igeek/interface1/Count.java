package com.igeek.interface1;

//interface 关键字 表示接口  。 
//接口中全是抽象方法 。
//接口中是对抽象方法的一种描述.默认接口中所有的方法都被public abstract 关键字修饰
//接口中的属性  默认都被 public static final 修饰  。
public interface Count {

	//静态常量  命名规范。
	//String NAME_HAHA="哈哈";   
	// 一般接口中全是抽象方法的集合 ，很少去定义属性，一旦定义属性 也都是被  public static final 修饰.
	
	 double FEI_LV = 0.1;
	
	void count();
	
	void count2();
	
}
