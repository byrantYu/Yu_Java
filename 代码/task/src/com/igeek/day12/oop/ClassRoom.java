package com.igeek.day12.oop;

import java.util.ArrayList;

public class ClassRoom {

	//�༶��
	private String classId;
	
	//private Student stu;  new Student("���","java",59.9);
	
	//�Ժ�ܳ��õ� ������
	//��ClassRoom���� ��ѧ���ļ��� ��
	private ArrayList<Student> studentList;
	
	public ClassRoom(){
		
	}
	
	public ClassRoom(String classId, ArrayList<Student> studentList) {
		super();
		this.classId = classId;
		this.studentList = studentList;
	}
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public ArrayList<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}

	@Override
	public String toString() {
		return "ClassRoom [classId=" + classId + ", studentList=" + studentList + "]";
	}
	
	
	
}
