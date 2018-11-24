package com.igeek.day12.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentTest {

	public static void main(String[] args) {
		Student jl = new Student("戢浪","java",59.9);
		Student js = new Student("俊生","java",55.5);
		Student bang = new Student("推推棒","java",88.9);
		Student uzi = new Student("简子豪","java",100.5);
		
		
		Student xhs = new Student("小花生","h5",59.9);
		Student nn = new Student("奶牛","h5",55.5);
		Student rh = new Student("如花","h5",88.9);
		
		//创建一个学生集合 装所有的所有 。
		ArrayList<Student> studentList = new ArrayList<Student>();
		Collections.addAll(studentList, jl,js,bang,uzi,xhs,nn,rh);
		
		//分班操作 。
		ArrayList<Student> java = new ArrayList<Student>();
		ArrayList<Student> h5 = new ArrayList<Student>();
		
		for (Student student : studentList) {
			if(student.getClassId().equals("java")){
				java.add(student);
			}else{
				h5.add(student);
			}
		}
		
		//创建Map集合,存储该班所有的学生。
		Map<String,ClassRoom> map = new HashMap<String,ClassRoom>();
		//创建java班的对象。、
		ClassRoom javaClassRoom = new ClassRoom("java",java);
		map.put("java", javaClassRoom);
		
		ClassRoom h5ClassRoom = new ClassRoom("h5",h5);
		map.put("h5", h5ClassRoom);
		
		
		
		print(map);
		
	/*	ArrayList<Student> javaList = new ArrayList<Student>();
		javaList.add(jl);
		javaList.add(js);
		
		ArrayList<Student> h5List= new ArrayList<Student>();
		h5List.add(rh);
		ClassRoom java = new ClassRoom("java",javaList);
		
		ClassRoom h5 = new ClassRoom("h5",h5List);*/
	}

	
	public static void print(Map<String,ClassRoom> map){
		
		//如何遍历Map集合？？？
		Set set = map.keySet();
		Iterator<ClassRoom> it = set.iterator(); 
		while(it.hasNext()){
			double sum = 0.0;
			double avg = 0.0;
			//拿到所有的班级 。
			ClassRoom room = map.get(it.next());//it.next() 拿到的是字符串key  ... 想获得value ...
			//拿到该班级所有学生的集合 。
			ArrayList<Student> stuList = room.getStudentList();
			for (Student sb : stuList) {
				sum += sb.getScore();
			}
			avg = sum/stuList.size();
			System.out.println(room.getClassId()+"的学生...总分:"+sum+"\t"+"平均分:"+avg);
		}
	}
}
