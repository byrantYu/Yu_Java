package com.igeek.security4;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable run = new Ticket();  //0x1234
		Thread window1 = new Thread(run,"����1");
		Thread window2 = new Thread(run,"����2");
		Thread window3 = new Thread(run,"����3");
		
		window1.start();
		window2.start();
		window3.start();
	}

}
