package com.lattice.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * ����֪ͨ��
 * 
 * @author lattice
 * 
 */
public abstract class Subject {
	List<Observer> observerList = new ArrayList<Observer>();

	/**
	 * ���ӹ۲���
	 * 
	 * @param observer
	 */
	public void attach(Observer observer) {
		observerList.add(observer);
	}

	/**
	 * �Ƴ��۲���
	 * 
	 * @param observer
	 */
	public void detach(Observer observer) {
		observerList.remove(observer);
	}
	/**
	 * ���±��۲��ߵ�״̬
	 */
	public void notifyObserver() {
		for (Observer observer : observerList) {
			observer.update();
		}
	}
}

/**
 * ����֪ͨ����
 * 
 * @author lattice
 * 
 */
class ConcreteSubject extends Subject {
	private String subjectState;// ���۲���״̬

	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
	}

	public String getSubjectState() {
		return this.subjectState;
	}
}

/**
 * �۲��߳�����
 * 
 * @author lattice
 * 
 */
abstract class Observer {
	public abstract void update();
}

/*
 * ����Ĺ۲�����
 */
class ConcreteObserver extends Observer {

	private String name;
	private String subjectState;
	private ConcreteSubject subject;

	public ConcreteObserver(ConcreteSubject subject, String name) {
		this.name = name;
		this.subject = subject;
	}

	public void setSubject(ConcreteSubject subject) {
		this.subject = subject;
	}

	public ConcreteSubject getSubject() {
		return this.subject;
	}

	@Override
	public void update() {
		this.subjectState = this.subject.getSubjectState();
		System.out.println("���۲���"+this.name+"��״̬�ǣ�" + this.subjectState);
	}

}