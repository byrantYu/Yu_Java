package com.igeek.level02;

import java.util.Random;
import java.util.Scanner;

/*
 * 第一题：分析以下需求，并用代码实现
	1.键盘录入班级人数
	2.根据录入的班级人数创建数组
	3.利用随机数产生0-100的成绩(包含0和100)
	4.要求:
		(1)打印该班级的不及格人数
		(2)打印该班级的平均分
		(3)演示格式如下:
			请输入班级人数:
			键盘录入:100
			控制台输出:
				不及格人数:19
				班级平均分:87
	
	思路
	1.定义变量用来统计不及格人数，定义变量，记录总分数
	2.键盘录入总人数
	3.创建数组，这个数组的长度班级人数
	4.遍历数组，并且产生随机数(成绩)，把随机数赋值给数组的每一个元素
	5.判断成绩是否小于60，如果小于，就不及格人数+1
	6.把当前成绩累加到总成绩
	7.最后打印不及格人数和平均分
 */
public class Task04 {
	public static void main(String[] args) {
		//记录不及格人数
		int notPassCount = 0;
		//记录总分数
		int totalScore = 0;
		//键盘录入
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入班级人数");
		int stuNum = sc.nextInt();
		//创建数组
		int[] arr = new int[stuNum];
		Random r = new Random();
		//遍历数组
		for(int i = 0; i < arr.length; i++) {
			//生成随机的成绩
			int score = r.nextInt(101);
			//把随机数赋值给数组的每一个元素
			arr[i] = score;
//			判断成绩是否小于60，如果小于，就不及格人数+1
			if(score < 60) {
				notPassCount++;
			}
//			把当前成绩累加到总成绩
			totalScore += score;
		}
		//求平均分
		double avgScore = totalScore / (stuNum + 0.0);
		System.out.println("不及格人数是"+notPassCount);
		System.out.println("班级平均分:" + avgScore);
	}
}
