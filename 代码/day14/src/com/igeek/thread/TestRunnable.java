package com.igeek.thread;

public class TestRunnable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//接口 Runnable 
		Runnable r1 = new Ticket2();
		Runnable r2 = new Ticket2();
		Runnable r3 = new Ticket2();
		
		//实现runnable 接口的，开启线程的方式比较特殊 。
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		Thread t3 = new Thread(r3);
		
		t1.start();
		t2.start();
		t3.start();
	}

}
