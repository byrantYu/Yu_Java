package com.igeek.thread;

public class TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� �� ���� �����̣��߳� ��
		//�̣߳�����һ�������еĶ���ִ��·����
		
		//��java����ο���һ�����̡߳� 
		//1. ����һ���߳��� ����Ҫ�̳�Thread�� ��ʵ��run ������
		
		//�߳� �ڸ�CPU ����ִ��Ȩ ��  ˭����˭ִ�� ��
		Ticket ticket = new Ticket();
		Ticket ticket2 = new Ticket();
		Ticket ticket3 = new Ticket();
		//ע�⣺����д�� �������÷��� �������� �����߳� ��
		//ticket.run(); �����ĵ��ã������ǿ����̡߳�
		ticket3.start();
		ticket2.start();
		ticket.start();//֤��  ����һ���߳� ��
		
		for (int i = 0; i < 100; i++) {
			//��ȡ��ǰ�̶߳���
			Thread thread = Thread.currentThread();
			thread.setName("���߳�:");
			System.out.println(thread.getName()+"ִ����"+i);
		}
		//�߲���     һ��ͬʱ 
		
	}

}
