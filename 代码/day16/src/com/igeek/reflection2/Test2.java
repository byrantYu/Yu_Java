package com.igeek.reflection2;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ľ���ʹ�� ��   ��������ķ�ʽ  ��  
		//1. ֱ��new   Person p = new Person();
		//2. �������� ��  new Person();
		//3. ȫ������д�� ��    com.igeek.test1.Person p = new  com.igeek.test1.Person();
		
		//4. ��������ķ�ʽ ��ͨ��java�������������� ��
		//ͨ��java���� ��������Ķ��� ��
		
		try {
			
			/*Class classType = Class.forName("com.igeek.reflection2.Person");
			Person p = (Person) classType.newInstance();
			p.haha();*/
			Person p = (Person) Class.forName("com.igeek.reflection2.Person").newInstance();
			// ͨ��java�������������� ��
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
