package com.igeek.security2;

// ��ͬ��ͬ�������  ʹ����ͬ���� ��  Ҳ�������ͬ������ ��
public class Ticket implements Runnable {
	int ticket = 100;
	int x = 0;
	Object obj = new Object();

	public void run() {
		while (true) {
			if (x % 2 == 0) {
				//�߳� 1  ��   �߳� 2   
				//�߳�1 �õ�������������ִ�� ��ֱ��ִ�е�x++   x=1;
				//�߳�3.
				//��xΪż����ʱ�� ��
				synchronized (obj) {//new Object();
					if (ticket > 0) {
						String name = Thread.currentThread().getName();
						System.out.println(name + "�۳���:" + ticket);
						ticket--;
					}
				}
			} else {//�� ֻ��1�ѡ�
				//�߳�3...
				//��xΪ������ʱ��ִ������Ĵ��� ��
				synchronized (obj) {//new Ticket();
					if (ticket > 0) {
						String name = Thread.currentThread().getName();
						System.out.println(name + "�۳���:" + ticket);
						ticket--;
					}
				}
			}
			//ѭ��������������
			if (ticket <= 0) {
				break;
			}
			//x���ۼӡ�
			x++;
		}
	}
}
