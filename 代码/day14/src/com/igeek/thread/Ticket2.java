package com.igeek.thread;

//java���� �಻�ܶ�̳С�

//Runnable  ʵ�ֽӿ� �� ��дrun .
public class Ticket2 implements Runnable {

	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 50; i++) {
			
			System.out.println(Thread.currentThread().getName()+"=="+i);
		}
	}

}
