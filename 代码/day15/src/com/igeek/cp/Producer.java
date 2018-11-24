package com.igeek.cp;

//������ ��
public class Producer implements Runnable {
	
	//Ticket ��Ϊһ���������  �����������������߸������߲���ͬһ������
	private Ticket ticket;//null=0x5566
	
	public Producer(){
		
	}
	//ticket 
	public Producer(Ticket ticket){
		this.ticket=ticket;//0x5566
	}
	
	int x = 1;
	public void run() {
		//������Ticket���� ��    //  number ++  
		while(true){
			//10   1  
			//11   1
			//ticket ������  �ڸղ��߳�1���߳�2 ִ�еĹ����У��޷��õ�����
			synchronized (ticket) {
				//������ ������������ˣ��Ͳ����������� ���ȴ�������
				while(ticket.flag){
					//���flag��ֵΪtrue ��ʾ�Ѿ��������ˣ������������� ��
					try {
						//������ǰ�̵߳�ִ��Ȩ�����ͷ��� �� ���뵽�ȴ������С�
						ticket.wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				try {
					//�̵߳����ߡ�
					Thread.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				ticket.setNumber(x);
				String name = Thread.currentThread().getName();
				System.out.println(name + "������" + x + "��Ʊ ������");
				x++;
				//
				ticket.flag=true;//����������� ��
				//����еȴ��������ߣ�Ҫ���������ߡ����˵û�еȴ��������� ���������Ҳ����ִ�С�
				ticket.notifyAll();//һ�λ���һ����
			}
		}
	}

}
