package com.igeek.thread;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//������������߳� ��������Ʊ ��
		Runnable run = new Ticket();
		Thread window1 = new Thread(run,"����1");
		Thread window2 = new Thread(run,"����2");
		Thread window3 = new Thread(run,"����3");
		
		window1.start();
		window2.start();
		window3.start();
		
		
		//  1000         �����߳�  5000
		
	}

}
