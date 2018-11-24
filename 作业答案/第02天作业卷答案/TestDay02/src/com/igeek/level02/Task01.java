package com.igeek.level02;

import java.util.Scanner;
/*
 * 键盘录入两个int类型的数据,交换这两个变量的值,并输出交换后的值
 */
public class Task01 {
	public static void main(String[] args) {
		// 创建Scanner对象
		Scanner sc = new Scanner(System.in);
		// 录入第一个数据
		System.out.println("请输入第一个数");
		int a = sc.nextInt();
		// 录入第二个数据
		System.out.println("请输入第二个数");
		int b = sc.nextInt();

		// 定义一个临时变量temp,保存a的值
		int temp = a;
		// 将b的值赋值给a
		a = b;
		// 将临时变量temp的值赋值给b
		b = temp;
		// 打印交换后的值
		System.out.println("a = " + a + ", b = " + b);
	}
}
