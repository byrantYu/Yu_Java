package com.igeek.thread;

public class Ticket extends Thread {

	private int ticket=100;
	@Override
	public void run() {
		while(true){
			if(ticket>0){
				//Thread.currentThread()
				//Thread.currentThread().getName() ��õ�ǰ�߳����ơ�
				System.out.println(Thread.currentThread().getName()+"��Ʊ�ˡ�"+(ticket--));
			}else{
				break;
			}
		}
	}

	
}
