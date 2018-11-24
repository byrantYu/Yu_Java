package com.yuan.test1;

import java.util.Scanner;

public class 简单工厂模式 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 从控制台输入数字A,以及数字B,还有+ - * / 实现一个简单的计算器功能。
		Scanner sc = new Scanner(System.in);
		int result = 0;
		System.out.println("请输入数字A--");
		int numA = sc.nextInt();
		System.out.println("请输入数字B");
		int numB = sc.nextInt();
		System.out.println("请输入+ - * /");
		String str = sc.next();
		switch (str) {
		case "+":
			result = numA + numB;
			System.out.println(result);
			break;
		case "-":
			result = numA - numB;
			System.out.println(result);
			break;
		case "*":
			result = numA * numB;
			System.out.println(result);
			break;
		case "/":
			if (numB != 0) {
				result = numA / numB;
				System.out.println(result);
			} else {
				System.out.println("0不能作为除数！");
			}
			break;
		}
		/*
		 * 首先注意命名规范。变量名称，要见名知意，并符合java标识符命名规则。
		 * 
		 * 这样写出来的代码，只是单纯实现了功能，然而程序并不容易维护，不容易扩展，更不容易复用，这达不到高质量代码的要求，更不是面向对象编程。
		 * 
		 * 面向对象编程之活字印刷术。
		 * 话说三国时期，曹操带领百万大军攻打东吴，大军在赤壁驻扎，舰船连成一片。眼看东吴势在必得，曹操大悦，大宴文武百官。
		 * 会上曹操诗兴大发于是作诗"喝酒唱歌，人生真爽!"，文武百官无不拍手叫好。
		 * 于是一臣子速叫来工匠制作印刷模板，以便流传天下。于是工匠连夜做好模板。
		 * 第二天，工匠将做好的模板交给曹操过目，曹操一看过于粗俗，于是改次诗为。“对酒当歌，人生真爽”,工匠叫苦不迭，无奈只得继续赶工修改，原来的
		 * 模板只能扔掉。
		 * 第三天，工匠又将做好的模板交给曹操过目，曹操又觉不妥，于是改为"对酒当个，人生几何"。此时工匠已经晕倒，心中一万只草泥马奔腾而过。
		 * 无奈只得照改。。。
		 * 三国时期还没有发明活字印刷术，一次返工意味着整个模板的废弃。费事费力也！
		 * (又了活字印刷术事情就变得简单许多"
		 * 	1.要改只需要改一些特定的字即可。___此为可维护性。
		 *  2.如果此诗需要加字，只需要加字即可。___此为容易扩展。
		 *  3.这些字用完，以后的印刷中还会用到。___此为复用性。
		 *  4.不管你的排版是横向的还是纵向的只需要移动字的位置即可。___此为灵活性好。
		 * )
		 * 
		 * 我们学习了面向对象编程之后就可以考虑使用封装，继承，多态的特性把程序的耦合度降低。
		 * 传统的印刷术的弊端就在与所有的字都刻在一个版上造成耦合度太高。
		 * 
		 * 开始使用设计模式，使得程序更加的灵活，容易修改，且容易复用。
		 * 
		 * 程序的复用性，我现在改变需求让你再写一个计算器用于web，或者移动端呢？
		 * 你可能会想到赋值粘贴。当你的重复代码多到一定程度的时候，维护起来就是一个噩梦。
		 * 有没有一种方式是避免重复的呢？想想你写的程序，那些是跟控制台有关，那些是跟计算有关的呢？能不能让其分离开呢？
		 * 
		 * 
		 * 
		 */
	}

}
