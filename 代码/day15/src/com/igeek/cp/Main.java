package com.igeek.cp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ͬ��ȥ���� Ticket ����  //0x5566
		Ticket t = new Ticket();
		//������ ������Ʊ  ��0x5566
		Producer p = new Producer(t);
		//�����ߣ�����Ʊ ��ʹ��Ʊ��0x5566
		Consumer c = new Consumer(t);
		//����̲߳����������� ��
		
		//�����߳� ��Ч�� �� 
		Thread t1 = new Thread(p,"������");
		
		Thread t2 = new Thread(c,"������1");
		Thread t3 = new Thread(c,"������5");
		Thread t4 = new Thread(c,"������3");
		// 
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
