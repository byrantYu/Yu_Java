package com.yuan.test2;

import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("����������A--");
		int numA = sc.nextInt();
		System.out.println("����������B");
		int numB = sc.nextInt();
		System.out.println("������+ - * /");
		String operate = sc.next();
		/**
		 * ����һ�������ǿ���̨��������ݣ�����web�������ֻ����Ƕ�����ͨ�����Ϸ�������ɼ���(����˸�����)��
		 * ��������Ҫ�޸�+����ʱ����Ҫ���ֻ��Ҫ�޸�Jia������д֮��ķ�������(����˿�ά����)��
		 * ��������Ҫ���Ӹ��ָ������㣬��ƽ�������������������ҵ��������
		 * ֻ��Ҫ������Ӧ���������༴�ɣ���Ҫ�޸Ĺ����࣬��switch��������Ӧ��case����顣(������չ������Ժ�)
		 */
		Operation1 op1=null;
		op1=OperationFactory.getOperation1(operate);
		double d1=op1.getResult(numA, numB);
		System.out.println("���յĽ����:"+d1);
	}

}
