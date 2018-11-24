package com.igeek.level01;

import java.util.Scanner;

/*
 * 键盘录入自己的姓名(String),年龄(int),身高(int)保存到对应的变量中,
 * 输出结果如:我的姓名是张三,年龄25岁,身高180CM(提示姓名是String类型,需要使用Scanner的next()方法.)
 * 
 */

public class Task03 {
	public static void main(String[] args) {
		//1.键盘输入姓名、年龄、身高
		//其中姓名为String类型，要使用Scanner的next()方法
		//其中年龄、身高为int类型，用使用Scanner的nextInt()方法
		Scanner sc = new Scanner(System.in);
		String name = sc.next();//姓名
		int age = sc.nextInt();//年龄
		int height = sc.nextInt();//身高
		
		//2.打印结果
		//我的姓名是张三,年龄25岁,身高180CM
		System.out.println("我的姓名是"+ name +",年龄"+ age +"岁,身高"+ height +"CM");
	}
}
