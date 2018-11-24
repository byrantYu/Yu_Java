package com.igeek.thread;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//第一种。
		//Thread t = new Ticket();
		/*
		 * 
		 * 第二种 
		Runnable run = new Ticket();
		Thread t = new Thread(run,"线程1");
		t.start();*/
		
		//匿名内部类 。
		Runnable run = new Runnable(){
			int ticket = 100;
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					if(ticket>0){
						System.out.println(Thread.currentThread().getName()+"售出了:"+(ticket--));
					}
				}
			}
			
		};
		Thread t = new Thread(run,"线程1");
		t.start();
	}

}
