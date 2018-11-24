package com.igeek.level02;

import java.util.Scanner;

/*
 * 分析以下需求，并用代码实现：
	1.根据工龄(整数)给员工涨工资(整数),工龄和基本工资通过键盘录入
	2.涨工资的条件如下：
		[10-15)     +5000
		[5-10)      +2500
		[3~5)       +1000
		[1~3)       +500
		[0~1)       +200
	3.如果用户输入的工龄为10，基本工资为3000，程序运行后打印格式"您目前工作了10年，基本工资为 3000元, 应涨工资 5000元,涨后工资 8000元"

 */
public class Task04 {
	public static void main(String[] args) {
		//工龄和基本工资通过键盘录入
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入工龄:");
		int age = sc.nextInt();
		System.out.print("请输入基本工资：");
		double money = sc.nextDouble();
		
		double afterMoney = 0.0;
		if (age<0 || age>15) {
			System.out.println("工龄输入错误");
		} else if(age >= 10){
			afterMoney = money + 5000;
			System.out.println("您目前工作了"+ age +"年，基本工资为 "+ money +"元, 应涨工资 5000元,涨后工资 "+ afterMoney +"元");
		} else if(age >= 5){
			afterMoney = money + 2500;
			System.out.println("您目前工作了"+ age +"年，基本工资为 "+ money +"元, 应涨工资 2500元,涨后工资 "+ afterMoney +"元");
		} else if(age >= 3){
			afterMoney = money + 500;
			System.out.println("您目前工作了"+ age +"年，基本工资为 "+ money +"元, 应涨工资 500元,涨后工资 "+ afterMoney +"元");
		} else {
			afterMoney = money + 200;
			System.out.println("您目前工作了"+ age +"年，基本工资为 "+ money +"元, 应涨工资 200元,涨后工资 "+ afterMoney +"元");
		}
	}
}
