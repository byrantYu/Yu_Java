package com.igeek.reflection2;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Test1 {

	public static void main(String[] args) throws Exception {
		//ͨ������  ���Ի�ú�ʹ��һ���������е����Ը�����������˽�е� ��
		
		//��÷������ ��
		//��һ�ַ�ʽ  �� ����.class���� 
		//Class classType = Person.class;
		//Class classType2 = new Person().getClass();
		//�Ƽ�ʹ�õķ�ʽ ��  �����õ� Person��� ��ķ������ ��  Class ���� ��
		Class classType = Class.forName("com.igeek.reflection2.Person");
		Annotation[] annotations = classType.getAnnotations();//�õ���ǰ�������е�ע�� ��
		Method[] methods = classType.getMethods();//�õ�����������еķ��� ��ֻ�������е��Լ��̳е��ķ�����
		//Method ��   ���з�������Ӧ���� ����Method�� ��
		/*for (Method method : methods) {
			System.out.println(method);
		}*/
		/*Field[] fields = classType.getFields();//Field �����ֶε���˼ �������õ���ǰ�������еĹ������ԣ������̳еõ��ġ�
		for (Field field : fields) {
			System.out.println(field);
		}*/
		
		/*Constructor[] constructors = classType.getConstructors();
		for (Constructor constructor : constructors) {
			System.out.println(constructor);
		}*/
		Class[] interfaces = classType.getInterfaces();
		for (Class class1 : interfaces) {
			//System.out.println(class1.getName());
			System.out.println(class1.getSimpleName());
		}
		//  ͨ��java����   ���Ի��һ������ ���е����Ը����� ������������ ��
	}
}
