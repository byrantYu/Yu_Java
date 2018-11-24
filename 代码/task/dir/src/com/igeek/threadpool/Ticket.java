package com.igeek.threadpool;

public class Ticket implements Runnable {
	
	private int ticket = 100;
	@Override
	public void run() {
		while(true){
			if(ticket>0){
				System.out.println(Thread.currentThread().getName()+"正在销售第"+(ticket--)+"张票");
			}else{
				//没有票，就跳出循环，不再卖票
				break;
			}

		}
	}

}
