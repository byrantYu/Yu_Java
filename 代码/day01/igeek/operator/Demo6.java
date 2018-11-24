package com.igeek.operator;

import java.util.Scanner;

public class Demo6 {

	public static void main(String[] args) {
		int i = 10 ;//变量类型  变量名称 = 值；
		//从控制台输入三个数 ，然后求出这个三个数的最大值 。 用一个三元表达式搞定。
		Scanner sc = new Scanner(System.in);  //对象类型    对象名称 = 值；  new 出来的。
		System.out.println("请输入第一个内容:");
		int input1 = sc.nextInt();
		System.out.println("请输入第二个内容:");
		int input2 = sc.nextInt();
		System.out.println("请输入第三个内容:");
		int input3 = sc.nextInt();
		
		
		//int maxValue = ((input1>input2)?input1:input2)>input3?((input1>input2)?input1:input2):input3;
		
		int step1 = (input1>input2)?input1:input2;
		int maxValue = (step1>input3)?step1:input3;
		
		System.out.println(maxValue);
	}

}
