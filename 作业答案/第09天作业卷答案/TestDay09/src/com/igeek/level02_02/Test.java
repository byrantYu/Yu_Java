package com.igeek.level02_02;

import java.util.ArrayList;


/*
 * 分析以下需求，并用代码实现
		1.定义Student类
			属性:
				姓名：String name
				年龄：int age
				成绩：int score
			行为:
				空参构造方法
				有参构造方法
				set和get方法
		2.定义测试类,进行测试
			(1)创建5个学生对象存入ArrayList集合中
			(2)打印最高分的学员姓名、年龄、成绩  [要求封装一个方法完成]
			(3)打印5个学生的总成绩和平均分	 [要求封装两个方法完成]
			(4)打印不及格的学员信息及数量		 [要求封装一个方法完成]
 */
public class Test {
	public static void main(String[] args) {
		//(1)创建5个学生对象存入ArrayList集合中
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student("小红", 34, 78));
		list.add(new Student("小明", 32, 59));
		list.add(new Student("小兰", 20, 45));
		list.add(new Student("小波", 25, 98));
		list.add(new Student("张晓", 28, 100));
		
		//(2)打印最高分的学员姓名、年龄、成绩  [要求封装一个方法完成]
		printMaxScore(list);
		//(3)打印5个学生的总成绩和平均分	 [要求封装两个方法完成]
		int sum = getSumScore(list);
		double avg = getAvgScore(list);
		System.out.println("所有学生的总成绩:"+ sum +",平均分:" + avg);
		//(4)打印不及格的学员信息及数量	[要求封装一个方法完成]
		printInfo(list);
	}

	//打印不及格的学员信息及数量
	public static void printInfo(ArrayList<Student> list) {
		int count = 0;
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			if (s.getScore() < 60) {
				System.out.println("不及格的学员信息: "+s.getName() +"," + s.getAge() +","+ s.getScore());
				count++;
			}
		}
		System.out.println("不及格的学员数量：" + count);
	}

	//返回所有学生的平均分
	public static double getAvgScore(ArrayList<Student> list) {
		int sum = getSumScore(list);
		return sum * 1.0 / list.size();
	}
	
	//返回所有学生的总成绩
	public static int getSumScore(ArrayList<Student> list) {
		int sum = 0;
		for (int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			sum += s.getScore();
		}
		return sum;
	}

	//打印最高分的学员姓名、年龄、成绩
	public static void printMaxScore(ArrayList<Student> list) {
		Student max = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i).getScore() > max.getScore()) {
				max = list.get(i);
			}
		}
		System.out.println("最高分的学员:" + max.getName() +"," + max.getAge() +","+ max.getScore());
	}
}
