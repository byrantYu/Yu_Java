package com.igeek.property;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainTest {
	
	//
	/*@Before
	public void abc(){
		System.out.println("����before1");
	}*/
	@Before
	public void adc(){
		System.out.println("�Ǻ�before2");
	}
	@Test
	public void test4(){
		System.out.println("D");
	}
	
	@Test
	public void test1(){
		System.out.println("B");
	}
	@After
	public void test3(){
		System.out.println("C");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Property  ����  ��  
		//Properties ���Լ���
		
		//�����ִ�������ķ�ʽ ��ʲô���� ��
		//Map m = new Properties();
		//m ����  ֻ�ܵ���   Map�ӿ����еķ��� ��
		Properties p = new Properties();
		//p ���� 
		p.setProperty("username", "jlsb123");
		p.setProperty("password", "sbsbsb");
		p.setProperty("color", "����");
		
		Properties p2 = new Properties();
		p2.setProperty("username", "jlsb123");
		p2.setProperty("password", "sbsbsb");
		p2.setProperty("color", "����");
		
		//System.out.println(p==p2);
		
		//String username = p.getProperty("username");
		//System.out.println(username);
		
		
		//����  ��
		Set<String> keys =  p.stringPropertyNames();
		for (String string : keys) {
			String value = p.getProperty(string);
			System.out.println(value);
		}
	}

}
