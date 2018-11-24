package com.igeek.day12.oop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class StudentTest {

	public static void main(String[] args) {
		Student jl = new Student("���","java",59.9);
		Student js = new Student("����","java",55.5);
		Student bang = new Student("���ư�","java",88.9);
		Student uzi = new Student("���Ӻ�","java",100.5);
		
		
		Student xhs = new Student("С����","h5",59.9);
		Student nn = new Student("��ţ","h5",55.5);
		Student rh = new Student("�绨","h5",88.9);
		
		//����һ��ѧ������ װ���е����� ��
		ArrayList<Student> studentList = new ArrayList<Student>();
		Collections.addAll(studentList, jl,js,bang,uzi,xhs,nn,rh);
		
		//�ְ���� ��
		ArrayList<Student> java = new ArrayList<Student>();
		ArrayList<Student> h5 = new ArrayList<Student>();
		
		for (Student student : studentList) {
			if(student.getClassId().equals("java")){
				java.add(student);
			}else{
				h5.add(student);
			}
		}
		
		//����Map����,�洢�ð����е�ѧ����
		Map<String,ClassRoom> map = new HashMap<String,ClassRoom>();
		//����java��Ķ��󡣡�
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
		
		//��α���Map���ϣ�����
		Set set = map.keySet();
		Iterator<ClassRoom> it = set.iterator(); 
		while(it.hasNext()){
			double sum = 0.0;
			double avg = 0.0;
			//�õ����еİ༶ ��
			ClassRoom room = map.get(it.next());//it.next() �õ������ַ���key  ... ����value ...
			//�õ��ð༶����ѧ���ļ��� ��
			ArrayList<Student> stuList = room.getStudentList();
			for (Student sb : stuList) {
				sum += sb.getScore();
			}
			avg = sum/stuList.size();
			System.out.println(room.getClassId()+"��ѧ��...�ܷ�:"+sum+"\t"+"ƽ����:"+avg);
		}
	}
}
