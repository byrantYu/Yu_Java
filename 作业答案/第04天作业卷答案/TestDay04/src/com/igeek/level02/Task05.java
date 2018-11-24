package com.igeek.level02;

import java.util.Random;
import java.util.Scanner;

/*
 * 第二题：分析以下需求，并用代码实现
	1.基础班考试要进行分组,键盘录入该班级总共多少组?以及每组的学生数量?
	2.根据录入的组数及每组学员的数量创建二维数组
	3.利用随机数产生0-100的成绩(包含0和100)
	4.要求:
		(1)打印该班级中每组的不及格人数
		(2)打印该班级中每组的平均分
		(3)打印组的最高平均分
		(4)打印班级中的不及格人数
		(5)打印班级平均分
		(6)演示格式如下:
			请输入班级总组数:3
			请输入班级中每组的人数:10
			控制台输出:
				第1组不及格人数为: 6 人
				第1组平均分为: 52
				第2组不及格人数为: 7 人
				第2组平均分为: 46
				第3组不及格人数为: 3 人
				第3组平均分为: 69
				班级中单组最高平均分为:69
				班级中不及格人数为: 16 人
				班级总平均分为: 56
	思路：
		1.定义二维数组。 new int[组数][学生数量]
		2.定义变量用来记录班级的总不及格人数和班级的总分数
		3.遍历二维数组，生成随机的成绩，赋值给数组的每一个元素
		4.对这个成绩进行一个判断，如果这个成绩小于60，就把不及格人数+1
		5.把成绩累加到总成绩上
		6.打印不及格人数和平均分
		
		
		每组：
		定义变量，用来统计每组的不及格人数和每组的总分数
		每统计完一个组，就可以计算输出以下结果
		
		班级中单组最高平均分为:?
		 定义变量，可以把0.0当做最大的平均分
		 依次拿这个变量和其他组的平均分做一个对比，如果其他组的平均分比他大，就把当前最大的平均分赋值给这个变量
 */
public class Task05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//键盘录入组数
		System.out.println("请输入组数");
		int groupNum = sc.nextInt();
		//录入每组学生人数
		System.out.println("请输入每组学生人数");
		int stuNum = sc.nextInt();
		//定义二维数组
		int[][] arr = new int[groupNum][stuNum];
		//总不及格人数
		int totalNotPass = 0;
		//班级的总分数
		int totalScore = 0;
		Random r = new Random();
		//定义变量，用来作为最大的平均分
		double maxAvgScore = 0.0;
		for(int i = 0; i < arr.length; i++) {//arr[1]
			//定义每组不及格人数
			int groupNotPass = 0;
			//定义每组的总分数
			int groupScore = 0;
			//二维数组中的每个一维数组怎么表示  arr[i]
			for(int j = 0; j < arr[i].length; j++) {
				//生成随机的成绩，赋值给数组的每一个元素
				int score = r.nextInt(101);
				arr[i][j] = score;
//				对这个成绩进行一个判断，如果这个成绩小于60，就把不及格人数+1
				if(score < 60) {
					totalNotPass++;
					//把每组的不及格人数+1
					groupNotPass++;
				}
				totalScore += score;
				groupScore += score;
			}
			System.out.println("第"+ (i + 1) +"组不及格人数为: "+groupNotPass+" 人");
			//计算平均分
			double avgGroupScore = groupScore / (arr[i].length + 0.0);
			//如果其他组的平均分比他大，就把当前最大的平均分赋值给这个maxAvgScore
			if(avgGroupScore > maxAvgScore) {
				maxAvgScore = avgGroupScore;
			}
			System.out.println("第"+ (i + 1) +"组平均分为: " + avgGroupScore);
		}
		System.out.println("不及格人数是"+totalNotPass);
		//平均分
		double avgScore = totalScore / (groupNum * stuNum + 0.0);
		System.out.println("平均分是："+avgScore);
		System.out.println("单组最高的平均分是"+maxAvgScore);
	}
}



