package com.lattice.sigleton;

/**
 * @use �������ģʽ
 * @author lattice
 * @date 2016-12-27
 */
public class Singleton {

	public static void main(String[] args) {
		SingletonClass.getInstance().say();
		SingletonClassLan.getInstance().say();

	}
}

/**
 * @use �����࣬�������ģʽ������
 * @author lattice
 * 
 */
class SingletonClass {//����ʽ
	// ������̬����
	private static SingletonClass instance = new SingletonClass();

	// ˽�л����캯��
	private SingletonClass() {

	}

	// ���õ�ǰ�����ľ�̬���ʷ���
	public static SingletonClass getInstance() {
		return instance;
	}

	public void say() {
		System.out.println("hello this is ����ʽ  a singleton!");
	}
}

class SingletonClassLan {//����ʽ��ʱ�����̰߳�ȫ����
	// ������̬����
	private static SingletonClassLan instance;// = new SingletonClassLan();

	// ˽�л����캯��
	private SingletonClassLan() {

	}

	// ���õ�ǰ�����ľ�̬���ʷ���//ͨ��synchronized��ͬ������������ʽ�������ģʽ���ڵ��̰߳�ȫ���⡣
	//synchronized��֤���̰߳�ȫ�����ǽ�����Ч�ʡ�
	public static synchronized SingletonClassLan getInstance() {
		//instance = new SingletonClassLan();
		if(instance == null){//ͨ��if�����һ�ε���instance����δ����ʼ��
			instance = new SingletonClassLan();
		}
		return instance;
	}

	public void say() {
		System.out.println("hello this is a ����ʽ singleton!");
	}
}
