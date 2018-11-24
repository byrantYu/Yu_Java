package com.igeek.reflection2;

import java.lang.reflect.Field;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ͨ��java���������õ�ǰ���е����� ����������
		try {
			Class classType = Class.forName("com.igeek.reflection2.Person");
			//ͨ��������� ����õ�ǰ���е� ���� ��  ֻ�ܻ�ù��е� ��
			Field field = classType.getField("name");
			//�����Խ��и�ֵ �� ��Ҫ������������ ��obj ��ʾ���Ǹ������name���Խ��и�ֵ ��value ������Ҫ�����ֵ ��
			Person tom = new Person();
			field.set(tom, "��ķ˹��");//����.����  ��    ����.���� ��
			String name = (String) field.get(tom);
			System.out.println(name);
			
			//��򵥵ķ�ʽ ��
			//Person jack = new Person("�ܿ�",20);
			
			//ͨ��java���� ���˽������ ��//getDeclaredField ��ʾ��õ�ǰ�������������� �����ӷ���Ȩ�����η� ��
			Field dream = classType.getDeclaredField("dream");
			//���õ�ǰ���Եķ���Ȩ��Ϊtrue ...
			dream.setAccessible(true);
			dream.set(tom, "׬Ǯ����椡�");
			String d = (String) dream.get(tom);
			System.out.println(d);  //ͨ��java������������ǰ���е�˽������ ��
			
			//һ�㲻�Ƽ�ʹ��java��������������˽�����ԡ� �����Ƽ�ʹ��  set/get ������˽������ ��
			
			//System.out.println(field);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
