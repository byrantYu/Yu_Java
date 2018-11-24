package com.igeek.thread;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建多个窗口线程 ，用来售票 。
		Runnable run = new Ticket();
		Thread window1 = new Thread(run,"窗口1");
		Thread window2 = new Thread(run,"窗口2");
		Thread window3 = new Thread(run,"窗口3");
		
		window1.start();
		window2.start();
		window3.start();
		
		
		//  1000         创建线程  5000
		
	}

}
