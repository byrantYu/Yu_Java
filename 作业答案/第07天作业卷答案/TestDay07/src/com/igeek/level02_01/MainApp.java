package com.igeek.level02_01;
/*
 * �����������󣬲��ô���ʵ��
	1.��Ŀ������Manager 
		���ԣ�
			����name
			����id
			����salary
			����bonus
		��Ϊ��
			����work()
	2.����Ա��Coder
		���ԣ�
			����name
			����id
			����salary
		��Ϊ��
			����work()
	Ҫ��:
		1.��������Ҫ����Manager���Coder��,����Ҫ˽��,���ɿղΡ��вι��죬setter��getter����
		2.���������,��main�����д�������Ķ��󲢸����Ը�ֵ(��ʾ���ַ���:setter�����͹��췽��)
		3.���ó�Ա����,��ӡ��ʽ����:
			����Ϊ123��������Ϊ15000����Ϊ6000����Ŀ��������Ŭ�������Ź�����,��������,���Ա���ύ�����Ĵ���.....
			����Ϊ135��������Ϊ10000�ĳ���Ա����Ŭ����д�Ŵ���......
			
 */
public class MainApp {
	public static void main(String[] args) {
		Manager m = new Manager("�仨", "9527", 15000, 3000);
		m.work();
		
		Coder c = new Coder();
		c.setName("���");
		c.setId("0025");
		c.setSalary(10000);
		c.work();
	}
}














