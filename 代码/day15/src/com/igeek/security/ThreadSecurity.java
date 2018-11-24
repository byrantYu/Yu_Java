package com.igeek.security;



//线程完全问题。
public class ThreadSecurity {

	public static void main(String[] args) {
		
		Runnable run = new Ticket();  //0x1234
		Thread window1 = new Thread(run,"窗口1");
		Thread window2 = new Thread(run,"窗口2");
		Thread window3 = new Thread(run,"窗口3");
		
		window1.start();
		window2.start();
		window3.start();
	}

}
