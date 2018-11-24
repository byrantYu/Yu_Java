package com.igeek.security2;

public class Main {

	public static void main(String[] args) {

		Runnable run = new Ticket();  //0x1234
		Thread window1 = new Thread(run,"´°¿Ú1");
		Thread window2 = new Thread(run,"´°¿Ú2");
		Thread window3 = new Thread(run,"´°¿Ú3");
		
		window1.start();
		window2.start();
		window3.start();
	}

}
