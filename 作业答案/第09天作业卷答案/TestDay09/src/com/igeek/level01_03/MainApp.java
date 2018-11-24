package com.igeek.level01_03;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 	学号		姓名		性别		年龄		身高	
	it001	黄渤		男		20		1.72		
	it002	孙红雷	男		22		1.78		
	it003	章子怡	女		18		1.64		

 */
public class MainApp {
	public static void main(String[] args) {
		//存学生对象的集合
		ArrayList<Student> list = new ArrayList<Student>();
		
		//1.键盘输入3位学员的信息（学号、姓名、性别、年龄、身高）
		Scanner sc = new Scanner(System.in);
		for (int i = 1; i <= 3; i++) {
			System.out.print("请输入第"+i+"位学员的学号：");
			String id = sc.next();//学号
			System.out.print("请输入第"+i+"位学员的姓名：");
			String name = sc.next();//姓名
			System.out.print("请输入第"+i+"位学员的性别：");
			String sex = sc.next();//性别
			System.out.print("请输入第"+i+"位学员的年龄：");
			int age  = sc.nextInt();//年龄
			System.out.print("请输入第"+i+"位学员的身高：");
			double height  = sc.nextDouble();//身高
			
			//创建Student对象，存到集合中
			Student s = new Student(id, name, sex, age, height);
			list.add(s);
		}
		//2.打印所有学员的信息
		printAll(list);
		//3.找出身高最高的学员，并打印他的详细信息
		findMaxHeight(list);
	}
	
	/*
	 * 打印所有学员的信息
	 */
	public static void printAll(ArrayList<Student> list){
		for (int i = 0; i < list.size(); i++) {
			//获取集合中每个学生对象
			Student s = list.get(i);
			System.out.println(s.getId()+", "+ s.getName() + ", " + s.getSex() +", "+ + s.getAge() +", "+ + s.getHeight());
		}
	}
	
	/*
	 * 找出身高最高的学员，并打印他的详细信息
	 */
	public static void findMaxHeight(ArrayList<Student> list){
		//记录身高最高的学生
		Student maxStu = list.get(0);
		for (int i = 0; i < list.size(); i++) {
			//获取集合中的每个Student对象
			Student thisStu = list.get(i);
			//与已记录的身高最高的学生进行比较
			if (thisStu.getHeight() > maxStu.getHeight()) {
				//更新最高学生的记录信息
				maxStu = thisStu;
			}
		}
		//得到了身高最高的学生  maxStu
		System.out.println("身高最高的学生为：");
		System.out.println(maxStu.getId()+", "+ maxStu.getName() + ", " + maxStu.getSex() +", "+ + maxStu.getAge() +", "+ + maxStu.getHeight());
	}
}
