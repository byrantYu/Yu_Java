package com.igeek.day10.level1_2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) throws Exception {
		ArrayList<Student> stuList = new ArrayList();
		for (int i = 0; i < 3; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("������ѧ��:");
			String id = sc.nextLine();
			System.out.println("����������:");
			String name =sc.nextLine();
			System.out.println("�������Ա�:");
			String sex = sc.nextLine();
			System.out.println("����������:");
			String age = sc.nextLine();
			Student student = new Student(id, name, sex, age);
			stuList.add(student);
		}
		
		BufferedWriter bf = new BufferedWriter(new FileWriter("haha.txt"));
		for (int i = 0; i < stuList.size(); i++) {
			Student stu = stuList.get(i);
			String stuString = stu.toString();
			bf.write(stuString);
			bf.newLine();
			bf.flush();
		}
		bf.close();
	}

}
