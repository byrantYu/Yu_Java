package com.igeek.level02;
/*
 * A��Bǰ��5km��A�ٶ�Ϊ1km/h��B�ٶ�Ϊ2km/h����b����ܸ���a��
 * 
 * 	1.	����A��B���ٶȲ�
	2.	ʱ�� = ·�� / �ٶ�
	3.	������
 */
public class Task02 {
	public static void main(String[] args) {
		// ����A��B���ٶȲ�
		double speed = 2 - 1;
		// ʱ�� = ·�� / �ٶ�
		double time = 5 / speed;
		// ������
		System.out.println("b " + time + " Сʱ�ܸ���a");
	}
}
