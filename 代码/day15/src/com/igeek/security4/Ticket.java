package com.igeek.security4;



public class Ticket implements Runnable{
	static int ticket = 100;//����� ��
	int x = 0;//ʵ��������
	//Object obj = new Object();
	public void run() {
		while (true) {
			if (x % 2 == 0) {
				//�߳� 1  ��   �߳� 2   
				//�߳�1 �õ�������������ִ�� ��ֱ��ִ�е�x++   x=1;
				//�߳�3.
				//��xΪż����ʱ�� ��
				synchronized (Ticket.class) {//new Object();
					if (ticket > 0) {
						String name = Thread.currentThread().getName();
						System.out.println(name + "�۳���:" + ticket);
						ticket--;
					}
				}
			} else {//�� ֻ��1�ѡ�
				get();
			}
			//ѭ��������������
			if (ticket <= 0) {
				break;
			}
			//x���ۼӡ�
			x++;
		}
	}

	//this �Ǿ�̬����ʹ�õ��� �� 
	//��̬���� ʹ�õ���  ����this , ���ǵ�ǰ����ֽ��� ��  ����.class
	//Ticket.class ���� ��̬����ʹ�õ�����
	public static synchronized void get(){
		//���������this...
		//synchronized(this){
		if (ticket > 0) {
			String name = Thread.currentThread().getName();
			System.out.println(name + "�۳���:" + ticket);
			ticket--;
		}
		//}
	}
}
