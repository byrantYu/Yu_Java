package com.igeek.operator;

import java.util.Scanner;

public class Demo5 {

	public static void main(String[] args) {
		
		//String binary = Integer.toBinaryString(-3);
		//System.out.println(binary);
		
		//三元运算 ，三目运算。
		//语法规则    (布尔类型的表达式)?结果1:结果2;   结果1跟结果2的数据类型必须一致。
		//从键盘输入一个数字 ，判断一下 这个数字是奇数还是偶数 。
		
		//如何从键盘获取输入 。
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字。");
		int input = sc.nextInt();//sc.nextInt(); 表示读取输入内容并将内容转换成int类型。
		
		int result = (input%2==0)?1:0;
		
		System.out.println(result);
		
		
		//从控制台输入三个数 ，然后求出这个三个数的最大值 。 用一个三元表达式搞定。
	}

}
