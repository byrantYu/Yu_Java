package com.igeek.student;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class StudentMain {

	public static void main(String[] args) {

		// 每一个student对象 ，其实就代表了具体的一个学生。
		ArrayList<Student> list = new ArrayList<Student>();
		//持久化存储 。数据库 。
		while (true) {
			System.out.println("=====欢迎来到学生管理系统=====");
			System.out.println("1	查看学生");
			System.out.println("2       添加学生");
			System.out.println("3	删除学生");
			System.out.println("4       修改学生");
			System.out.println("5       查看指定学生");
			System.out.println("6	退出");
			System.out.println("请输入你的选择。");
			Scanner sc = new Scanner(System.in);
			int xz = sc.nextInt();
			switch (xz) {
			case 1:
				// 查看学生。
				selectAll(list);
				break;
			case 2:
				// 添加
				//先进入到输入数据的页面。
				addSudent(list);
				break;
			case 3:
				// 删除
				deleteStudent(list);
				break;
			case 4:
				// 修改
				updateStudent(list);
				break;
			case 5:
				// 查询单一 根据学生id
				break;
			case 6:
				// 退出
				System.exit(0);// JVM退出 。
				break;
			default:
				System.out.println("输入错误，请重新输入。");
				break;
			}

		}

	}

	
	//封装一个查看所有学生的方法。
	public static void selectAll(ArrayList list){
		if(list.size()==0){
			System.out.println("不好意思！没有学生。");
		}else{
			for (int i = 0; i < list.size(); i++) {
				//拿到每一个学生对象，打印学生信息 。
				Student stu = (Student) list.get(i);
				System.out.println(stu);
			}
		}
		
	}
	
	//添加学生
	public static void addSudent(ArrayList<Student> list){
		System.out.println("请输入学生的id,name,age,address");
		System.out.println("友情提示：   照以下格式输入...");
		System.out.println("张三丰,20,北京市三元桥");
		Scanner sc2 = new Scanner(System.in);
		String input = sc2.nextLine();//接受输入内容。
		String [] stus = input.split(",");
		String uuid = getUUID();
		int age = Integer.parseInt(stus[1]);//如何把一个字符串转化成基本数据类型  Integer.parseInt("123");
		//创建student 对象，把数据先封装到对象中。
		Student student = new Student(uuid,stus[0],age,stus[2]);
		list.add(student);
	}
	
	//删除学生
	public static void deleteStudent(ArrayList<Student> list){
		System.out.println("请输入要删除的学生姓名:");
		Scanner sc3 = new Scanner(System.in);
		String name = sc3.nextLine();
		//list.remove(name);
		//先从容器中取出所有的学生 。  判断这个学生的名字跟输入的名字是否一致，如果一致，删除该学生对象。
		for (int i = 0; i < list.size(); i++) {
			Student stu = list.get(i);//取出每一个学生对象。
			String stuName = stu.getName();
			if(name.equals(stuName)){
				list.remove(i);
			}
		}
	}
	
	
	public static void updateStudent(ArrayList<Student> list){
		//根据姓名去修改。
		System.out.println("请输入要修改的学生姓名：");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		Student stu = null;
		int j = 0;
		for (int i = 0; i < list.size(); i++) {
			Student student = list.get(i);
			if(student.getName().equals(input)){
				System.out.println(student);
				stu = student;
				j = i;
				break;//直接跳出来已经找到学生了。
			}
		}
		System.out.println("请输入修改的地址:");
		String address = sc.nextLine();
		
		stu.setAddress(address);
		
		list.set(j, stu);//直接替换 。
		
		
	}
	
	//根据姓名查询单一学生。
	public static void getStudentById(ArrayList<Student> list){
		System.out.println("请输入学生的姓名：");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		for (int i = 0; i < list.size(); i++) {
			Student student = list.get(i);
			if(student.getName().equals(input)){
				System.out.println(student);
				break;//直接跳出来已经找到学生了。
			}
		}
	}
	
	//工具方法 。 返回一个UUID，并且是字符串类型。
	public static String getUUID(){
		String uuid = UUID.randomUUID().toString().replace("-", "");
		return uuid;
	}
}
