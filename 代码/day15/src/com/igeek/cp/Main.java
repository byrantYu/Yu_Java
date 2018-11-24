package com.igeek.cp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//共同的去操作 Ticket 对象。  //0x5566
		Ticket t = new Ticket();
		//生产者 ，生产票  。0x5566
		Producer p = new Producer(t);
		//消费者，消费票 。使用票。0x5566
		Consumer c = new Consumer(t);
		//多个线程操作共享数据 。
		
		//启动线程 看效果 。 
		Thread t1 = new Thread(p,"生产者");
		
		Thread t2 = new Thread(c,"消费者1");
		Thread t3 = new Thread(c,"消费者5");
		Thread t4 = new Thread(c,"消费者3");
		// 
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
