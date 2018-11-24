package com.igeek.thread;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//概念 。 程序 ，进程，线程 。
		//线程：就是一个进程中的多条执行路径。
		
		//在java中如何开启一个多线程。 
		//1. 创建一个线程类 ，需要继承Thread类 ，实现run 方法。
		
		//线程 在跟CPU 争抢执行权 ，  谁抢到谁执行 。
		Ticket ticket = new Ticket();
		Ticket ticket2 = new Ticket();
		Ticket ticket3 = new Ticket();
		//注意：这种写法 叫做调用方法 ，而不是 开启线程 。
		//ticket.run(); 方法的调用，而不是开启线程。
		ticket3.start();
		ticket2.start();
		ticket.start();//证明  开启一个线程 。
		
		for (int i = 0; i < 100; i++) {
			//获取当前线程对象。
			Thread thread = Thread.currentThread();
			thread.setName("主线程:");
			System.out.println(thread.getName()+"执行了"+i);
		}
		//高并发     一起，同时 
		
	}

}
