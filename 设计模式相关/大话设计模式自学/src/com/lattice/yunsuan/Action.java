package com.lattice.yunsuan;
/**
 * @use �򵥹�����������������ģʽ�ļӷ������������
 * @author lattice
 * @date 2016-12-20
 */
public class Action {

	public static void main(String[] args) {
		{//�򵥹�������ʵ�ּӼ��ͷ�����
			Operation op=null;
			op=OperationSimpleFactory.createOperation("/");
			op.numberA=1;
			op.numberB=2;
			System.out.println("�򵥹���������switch��:\t"+op.getResult());
		}
		{//��������ģʽ��ʵ�ּӼ��˳���������
			IYunsuanFactory fact=new AddFactory();
			Operation op=fact.createOperation();
			op.numberA=10;
			op.numberB=20;
			System.out.println("�򵥹�������ģʽ���ӿڣ�:\t"+op.getResult());
			
		}
	}

}
