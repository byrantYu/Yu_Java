package com.igeek.oop3;

import java.util.Scanner;


public class Test {
	@Deprecated
	public static void main(String[] args) {
		Teacher yuan = new Teacher();
		Student jiLang = new Student("戢浪");
		//new Student("妹子");  匿名对象。
		//如果只使用一次 推荐使用匿名对象。
		yuan.test(jiLang);
		int abs = Math.abs(-20);
		System.out.println(abs);
		
		Scanner sc = new Scanner(System.in);
		/**
		 * 创建对象的目的 ，为了调用对象中的成员(属性，方法。)。
		 */
		//String
	}

}
