package com.igeek.thread;
/**
 * 
 * ������̲߳����������Ե�ʱ��,��ʱ�п��ܲ����̰߳�ȫ����  ��
 * 
 * ������� ��   ͬ������� ���﷨��ʽ ��
 * 		synchronized(�����һ�����󣬶����Գ䵱����){
 * 			�����ſ��ܻ�����̰߳�ȫ����Ĵ��롣
 * 		}
 * 
 * ͬ�������  �ֽ� ������  ��
 *
 */
public class Ticket implements Runnable{

	int ticket = 100;

	public void run() {
		// TODO Auto-generated method stub
		while(true){
				
				
					if (ticket > 0) {
						//һ��������ִ�е�Ԫ������ֳɶ������֮���̰߳�ȫ���ⱻ�Ŵ��ˡ�
						String name = Thread.currentThread().getName();
						System.out.println(name + "�۳���:" + ticket);
						ticket--;
					}
				
			
		}
	}
	
	
}
