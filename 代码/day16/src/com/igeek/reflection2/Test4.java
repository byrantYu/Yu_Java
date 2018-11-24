package com.igeek.reflection2;

import java.lang.reflect.Method;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ͨ��java����  ������һ�����е�˽�з�����
		
		//����ģʽ  ��  ��̬���� ����̬����  ��  Spring AOP���������̵�ʵ��ԭ��  ��
		try {
			Class classType = Class.forName("com.igeek.reflection2.Person");
			
			//���˽�з��� ��    method ����  ��ʾ�õ�����һ������ķ��� ��
			Method method = classType.getDeclaredMethod("dream", null);
			method.setAccessible(true);//IllegalAccessException �Ƿ����� ��
			//method.invoke ��ʾ���÷���  ����һ������ ��ʾ��Ҫ����Ķ��󡣷����������Ǹ�������ִ�С� 
			//�ڶ��������ǿɱ���� �����ǵ��÷���ʱ����Ҫ����ľ��������
			Person tom = new Person();
			method.invoke(tom, null);  //  ����.����           ����.ִ��(����,����);
			
			
			Method dream = classType.getDeclaredMethod("dream", String.class,int.class,char.class);
			dream.setAccessible(true);
			Person p = new Person();
			String result = (String) dream.invoke(p, "�Ǵ��Ｙ",20,'Ԫ');
			System.out.println(result);
			
			Method dream2 = classType.getDeclaredMethod("dream", String.class);
			dream2.setAccessible(true);
			String result2 = (String) dream2.invoke(p, "������ʥ���ڿ���");
			System.out.println(result2);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
