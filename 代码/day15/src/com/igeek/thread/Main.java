package com.igeek.thread;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//��һ�֡�
		//Thread t = new Ticket();
		/*
		 * 
		 * �ڶ��� 
		Runnable run = new Ticket();
		Thread t = new Thread(run,"�߳�1");
		t.start();*/
		
		//�����ڲ��� ��
		Runnable run = new Runnable(){
			int ticket = 100;
			public void run() {
				// TODO Auto-generated method stub
				while(true){
					if(ticket>0){
						System.out.println(Thread.currentThread().getName()+"�۳���:"+(ticket--));
					}
				}
			}
			
		};
		Thread t = new Thread(run,"�߳�1");
		t.start();
	}

}
