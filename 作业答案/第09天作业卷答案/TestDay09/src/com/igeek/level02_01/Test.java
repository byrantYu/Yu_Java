package com.igeek.level02_01;

import java.util.ArrayList;

/*
 * 分析以下需求，并用代码实现	
	1.按照以下描述完成类的定义。
		学生类
			属性：
				姓名name
				年龄age
				成绩score
			
	2.创建以下方法方法,描述如下
		public void listStudents(ArrayList<Student> stus):遍历打印学生信息
		public int getMaxScore(ArrayList<Student> stus):获取学生成绩的最高分
		public Student getMaxStudent(ArrayList<Student> stus):获取成绩最高的学员
		public int getAverageScore(ArrayList<Student> stus):获取学生成绩的平均值
		public int getCount(ArrayList<Student> stus):获取不及格的学员数量
	3.在测试类中进行测试，在main方法中首先创建长度为5的Student集合并添加数据,然后再调用以上方法进行测试	
 */
public class Test {
	public static void main(String[] args) {
		Student s1 = new Student("小红", 34, 78);
		Student s2 = new Student("小明", 32, 59);
		Student s3 = new Student("小兰", 20, 45);
		Student s4 = new Student("小波", 25, 98);
		Student s5 = new Student("张晓", 28, 100);
		ArrayList<Student> list = new ArrayList<>();
		//把学生对象放入集合
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		//遍历
//		listStudents(list);
//		int maxScore = getMaxScore(list);
//		System.out.println("最大成绩:"+maxScore);
//		Student stu = getMaxStudent(list);
//		System.out.println("姓名："+stu.getName()+"   年龄："+stu.getAge() + "   分数："+stu.getScore());
//		int avg = getAverageScore(list);
//		System.out.println(avg);
		int count = getCount(list);
		System.out.println(count);
	}
	
	/*
	 * 遍历打印学生信息
	 */
	public static void listStudents(ArrayList<Student> stus) {
		for(int i = 0; i < stus.size(); i++) {
			Student stu = stus.get(i);
			System.out.println("姓名："+stu.getName()+"   年龄："+stu.getAge() + "   分数："+stu.getScore());
		}
	}
	/*
	 * public int getMaxScore(ArrayList<Student> stus):获取学生成绩的最高分
	 */
	public static int getMaxScore(ArrayList<Student> stus) {
		//首先定义参照变量 用来存储最大的分数，把索引为0的学生的成绩当做最大的
		int max = stus.get(0).getScore();
		//遍历集合
		for(int i = 1; i < stus.size(); i++) {
			//拿到学生对象
			Student stu = stus.get(i);
			//拿集合中的每一个学生的分数去和参照物做对比
			if(stu.getScore() > max) {
				max = stu.getScore();
			}
		}
		return max;
	}
	/*
	 * public Student getMaxStudent(ArrayList<Student> stus):获取成绩最高的学员
	 */
	
	public static Student getMaxStudent(ArrayList<Student> stus) {
		//定义参照索引，当做成绩最高的学生的索引
		int maxIndex = 0;
		//遍历集合，拿当前遍历到的学生的成绩和我们参照索引位置上学生的成绩做对比
		for(int i = 1; i < stus.size(); i++) {
			//如果当前遍历到的学生的成绩大于参照索引位置上学生的成绩，就把当前索引赋值给maxIndex
			Student stu = stus.get(i);
			if(stu.getScore() > stus.get(maxIndex).getScore()) {
				maxIndex = i;
			}
		}
		return stus.get(maxIndex);
	}
	
	/*
	 * public int getAverageScore(ArrayList<Student> stus):获取学生成绩的平均值
	 */
	public static int getAverageScore(ArrayList<Student> stus) {
		//定义变量，存储总分
		int sum = 0;
		//遍历集合，把每个学生的成绩累加到sum上
		for(int i = 0; i < stus.size(); i++) {
			//拿到每一个学生对象
			Student stu = stus.get(i);
			//把每个学生的成绩累加到sum上
			sum+= stu.getScore();
		}
		//求平均分
		int avgScore = sum/stus.size();
		return avgScore;
	}
	/*
	 * public int getCount(ArrayList<Student> stus):获取不及格的学员数量
	 */
	public static int getCount(ArrayList<Student> stus) {
		//定义计数器，存储不及格人数
		int count = 0;
		//遍历集合，判断每一个学生的成绩是否及格，如果不及格，、就把计数器+1
		for(int i = 0; i < stus.size(); i++) {
			//拿到每一个学生
			Student stu = stus.get(i);
			//判断是否及格
			if(stu.getScore() < 60) {
				count++;
			}
		}
		return count;
	}
	
}













