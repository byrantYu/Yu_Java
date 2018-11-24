package com.lattice.observer;

/**
 * 测试观察者模式（发布-订阅模式）
 * @author lattice
 *
 */
public class Action {

	public static void main(String[] args) {
		ConcreteSubject subject=new ConcreteSubject();
		subject.attach(new ConcreteObserver(subject, "lattice"));
		subject.attach(new ConcreteObserver(subject, "Peter"));
		subject.attach(new ConcreteObserver(subject, "Marry"));
		subject.setSubjectState("写博客");
		subject.notifyObserver();
	}
	/**
	 * 输出结果：
	  	被观察者lattice的状态是：写博客
		被观察者Peter的状态是：写博客
		被观察者Marry的状态是：写博客
	 */
}
