package com.igeek.day12.oop;

import java.io.Serializable;

public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -5616655629544920840L;
	
	private String name;
	private String classId;
	private double score;//分数
	private Teacher teacher;//java : 大哥  。     H5 : 社会我光哥。
	
	
	public Student(){
		
	}
	
	public Student(String name, String classId, double score) {
		super();
		this.name = name;
		this.classId = classId;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassId() {
		return classId;
	}
	public void setClassId(String classId) {
		this.classId = classId;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", classId=" + classId + ", score=" + score + "]";
	}
	
	
}
