package com.igeek.thread;

public class Ticket extends Thread {

	private int ticket=100;
	@Override
	public void run() {
		while(true){
			if(ticket>0){
				//Thread.currentThread()
				//Thread.currentThread().getName() 获得当前线程名称。
				System.out.println(Thread.currentThread().getName()+"卖票了。"+(ticket--));
			}else{
				break;
			}
		}
	}

	
}
