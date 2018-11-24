package com.igeek.property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Properties;
import java.util.Set;

import org.junit.Test;

public class MainTest2 {

	//���� ��  ������صĲ���
	@Test
	public void test1() throws Exception{
		  
		//���Ը�����صĲ��� ��
		
		//��properties�����е����� ���뵽ָ���ļ���
		Properties p = new Properties();
		//p ���� 
		p.setProperty("username", "jlsb123");
		p.setProperty("password", "sbsbsb");
		p.setProperty("color", "����");
		
		//Writer writer = new OutputStreamWriter(new FileOutputStream("1.properties"),"UTF-8");
		
		//����һ���ļ������ ����
		FileOutputStream out = new FileOutputStream("test.properties");
		
		//��Ҫ����һ��  �ֽ������� ��Ȼ��ָ����Ҫ���õı��뼯 ��
		Writer writer = new OutputStreamWriter(out, "UTF-8");
		
		//store ���� ��Ҫ����һ�� �ַ���������� ������
		p.store(writer, "��������ݡ�");
		
		writer.close();
	}
	
	@Test
	public void test2() throws Exception{
		FileInputStream in = new FileInputStream("src/data.properties");
		//����һ���ַ������� ��
		Reader reader = new InputStreamReader(in,"UTF-8");
		
		//�������϶��� ���������ܶ�ȡ�������� ��
		Properties p = new Properties();
		p.load(reader);
		
		Set<String> keys = p.stringPropertyNames();
		
		for (String string : keys) {
			String value = p.getProperty(string);
			System.out.println(value);
		}
		
		//Bean ���� ��   JavaBeanָ�ľ���   һ���� Ȼ��˽������set/get...
	}
}
