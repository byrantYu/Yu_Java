package com.igeek.level02;

import java.util.Scanner;
/*
 * ����¼������int���͵�����,����������������ֵ,������������ֵ
 */
public class Task01 {
	public static void main(String[] args) {
		// ����Scanner����
		Scanner sc = new Scanner(System.in);
		// ¼���һ������
		System.out.println("�������һ����");
		int a = sc.nextInt();
		// ¼��ڶ�������
		System.out.println("������ڶ�����");
		int b = sc.nextInt();

		// ����һ����ʱ����temp,����a��ֵ
		int temp = a;
		// ��b��ֵ��ֵ��a
		a = b;
		// ����ʱ����temp��ֵ��ֵ��b
		b = temp;
		// ��ӡ�������ֵ
		System.out.println("a = " + a + ", b = " + b);
	}
}
