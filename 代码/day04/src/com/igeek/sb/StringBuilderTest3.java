package com.igeek.sb;

public class StringBuilderTest3 {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder("");
		for(int i = 0;i<50000;i++){
			sb.append(i);
		}
		long resultTime = System.currentTimeMillis()-startTime;
		System.out.println(resultTime);
		//5 5200
		
		StringBuffer sb2 =new StringBuffer("");
		
		//StringBuilder �̲߳���ȫ�� ��  ���̵߳�����¡� ִ��Ч��Ҫ��StringBuffer��һЩ��
		//StringBuffer �̰߳�ȫ�ġ�  ���̵߳������ʹ�� ��
		
		//����    
		//����
		//�߳� ����ͬʱ ����������ͬʱɱ����ͬʱӲ�̼�顣
	}

}
