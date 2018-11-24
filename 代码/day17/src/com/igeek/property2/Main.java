package com.igeek.property2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Constructor;
import java.util.Properties;

import org.junit.Test;

public class Main {

	@Test
	public void test1(){
		Student stu = new Student(1,"������");
		System.out.println(stu);
		
		//...
	}
	
	//java����+�����ļ� ����̬�Ĵ������� ���ﵽһ������̵�Ŀ�ġ�
	@Test  
	public void test2() throws Exception{
		//String str = "007";
		//int i = Integer.parseInt(str);
		//System.out.println(i);
		FileInputStream in = new FileInputStream("classname.properties");
		Reader reader = new InputStreamReader(in, "UTF-8");
		//��ȡ�����ļ� ��
		Properties classProperties = new Properties();
		classProperties.load(reader);
		//�õ�Ҫ���ص��� ��
		String className = classProperties.getProperty("ClassName");
		//����java���� �� 
		Class classType = Class.forName(className);
		//Object obj = classType.newInstance();
		//System.out.println(obj);   �ᱨ��  ����ǰ����û�пղι����� ��java���䴴�������ǻ���ÿղι������ġ�
		Constructor c = classType.getConstructor(int.class,String.class);
		//ID,NAME Ҳ��ȡ�����ġ�
		FileInputStream in1 = new FileInputStream("data.properties");
		Reader reader1 = new InputStreamReader(in1, "UTF-8");
		Properties content = new Properties();
		content.load(reader1);
		String strId = content.getProperty("id");
		int id = Integer.parseInt(strId);
		String name = content.getProperty("name");
		//Student ����� ������
		Object obj = c.newInstance(id,name);
		System.out.println(obj);
		reader1.close();
		reader.close();
	}
}
