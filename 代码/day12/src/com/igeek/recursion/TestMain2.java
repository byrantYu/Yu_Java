package com.igeek.recursion;

public class TestMain2 {
	static int i = 1;
	public static void main(String[] args) {
		method();
	}
	/**
	 * StackOverflowError
	 *   ջ�ڴ���� ��    ���Եݹ�������˹��� ��
	 */
	public static void method() {
		System.out.println("������ʼ:"+i);
		
		//���i�Ѿ��ӵ�4��,�ͽ�method��������
		if(i==100000) {
			return;
		}
		
		i++;
		method();
		i++;
		System.out.println("��������:"+i);
	}

}
