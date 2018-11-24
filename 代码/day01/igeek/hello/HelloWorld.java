package com.igeek.hello;
//包的命名规范  。   com cn .你的公司或者组织的名称 。  
//com.yang.hello  
//  标示符  ：  在java中凡是可以自己取名字的地方 我们都叫标示符 。
/**
 * 	文档注释 。  
 * 主要用来对类的嘴用做一个简单的描述 ，写上去作者是谁 ，日期 。等信息。
 * 
 * @author 极客营
 * @Version 1.0 2018年8月13日
 * @date 2018-08-13 10:33
 * Company wh.igeekhome.com
 * 
 */
public class HelloWorld {
	/*
	 * 多行注释 。
	 * 
	 * 解释说明代码 。
	 * 
	 * 当你保存的时候 eclipse 帮你自动的把当前类 执行了 javac 命令 。
	 * 
	 */
	// 主方法  固定写法   public static void main(String [] args){  ...主方法要实现的功能。  }
	public static void main(String [] args) {
		//单行注释 。
		
		//向控制台输出打印内容  。  System 系统的一个类   out  是系统类中的对象 。  println()是out对象中的一个方法 ，作用就是用来向控制台输出打印内容。
		System.out.println("HelloWorld!");
	}

}
