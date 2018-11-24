package com.lattice.observer;

/**
 * ���Թ۲���ģʽ������-����ģʽ��
 * @author lattice
 *
 */
public class Action {

	public static void main(String[] args) {
		ConcreteSubject subject=new ConcreteSubject();
		subject.attach(new ConcreteObserver(subject, "lattice"));
		subject.attach(new ConcreteObserver(subject, "Peter"));
		subject.attach(new ConcreteObserver(subject, "Marry"));
		subject.setSubjectState("д����");
		subject.notifyObserver();
	}
	/**
	 * ��������
	  	���۲���lattice��״̬�ǣ�д����
		���۲���Peter��״̬�ǣ�д����
		���۲���Marry��״̬�ǣ�д����
	 */
}
