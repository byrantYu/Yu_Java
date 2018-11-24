package com.igeek.single2;

public class Singleton {

	//����ʽ    ֻ���� ����ֵ ��
	private static Singleton single;//null   0x1234
	private Singleton(){
		
	}
	//����ʽ������  �����̰߳�ȫ���⡣      Singleton.class
	public static synchronized Singleton getInstance(){
		if(single==null){
			//�߳�1 0x5566  ���߳�2 0x7788
			single=new Singleton();
		}
		return single;//0x1234
	}
	
	public void chi(){
		System.out.println("�˰��ԡ�");
	}
}
