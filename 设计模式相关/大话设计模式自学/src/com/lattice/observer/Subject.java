package com.lattice.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象通知者
 * 
 * @author lattice
 * 
 */
public abstract class Subject {
	List<Observer> observerList = new ArrayList<Observer>();

	/**
	 * 增加观察者
	 * 
	 * @param observer
	 */
	public void attach(Observer observer) {
		observerList.add(observer);
	}

	/**
	 * 移除观察者
	 * 
	 * @param observer
	 */
	public void detach(Observer observer) {
		observerList.remove(observer);
	}
	/**
	 * 更新被观察者的状态
	 */
	public void notifyObserver() {
		for (Observer observer : observerList) {
			observer.update();
		}
	}
}

/**
 * 具体通知者类
 * 
 * @author lattice
 * 
 */
class ConcreteSubject extends Subject {
	private String subjectState;// 被观察者状态

	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
	}

	public String getSubjectState() {
		return this.subjectState;
	}
}

/**
 * 观察者抽象类
 * 
 * @author lattice
 * 
 */
abstract class Observer {
	public abstract void update();
}

/*
 * 具体的观察者类
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
		System.out.println("被观察者"+this.name+"的状态是：" + this.subjectState);
	}

}