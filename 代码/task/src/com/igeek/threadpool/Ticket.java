package com.igeek.threadpool;

public class Ticket implements Runnable {
	
	private int ticket = 100;
	@Override
	public void run() {
		while(true){
			if(ticket>0){
				System.out.println(Thread.currentThread().getName()+"�������۵�"+(ticket--)+"��Ʊ");
			}else{
				//û��Ʊ��������ѭ����������Ʊ
				break;
			}

		}
	}

}
