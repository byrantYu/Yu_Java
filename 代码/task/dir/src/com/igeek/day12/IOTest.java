package com.igeek.day12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class IOTest {

	@Test
	public void test1() throws Exception {
		// �ַ������������ж�ȡ��
		FileReader fr = new FileReader("e:/a.txt");
		BufferedReader br = new BufferedReader(fr);
		String str = null;
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}

		br.close();// �رջ��������ɡ�
	}

	@Test
	public void test2() throws Exception {
		// ���ļ�test.txt���������ݶ�ȡ,�������������test.txt��
		FileReader fr = new FileReader("e:/a.txt");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("e:/b.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		// �������� �����洢��ȡ�������� ��
		ArrayList<String> list = new ArrayList<String>();

		String str = null;

		while ((str = br.readLine()) != null) {
			list.add(str);
		}

		Collections.reverse(list);

		for (String string : list) {
			bw.write(string);
			bw.newLine();
		}

		bw.close();
		br.close();
	}

	@Test
	public void test3() throws Exception {
		FileOutputStream fos = new FileOutputStream("a.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		osw.write("hello,�й���");
		// �뻺�������ơ�ת���������ֽ���,����ֱ�ӹر�ת����,�ֽ���Ҳ�ر���
		osw.close();
	}

	@Test
	public void test4() throws Exception {
		FileInputStream fis = new FileInputStream("a.txt");

		int b = -1;
		while ((b = fis.read()) != -1) {
			System.out.println((char) b);
		}

		fis.close();
		System.out.println("=====================");

		// �ַ���(����ʹ��ת����ת��һ���ַ���)
		FileInputStream fis2 = new FileInputStream("a.txt");
		InputStreamReader isr = new InputStreamReader(fis2);

		int c = -1;
		while ((c = isr.read()) != -1) {
			System.out.println((char) c);
		}

		isr.close();

	}

	@Test
	public void test5() throws Exception {
		// ʹ��UTF-8�ķ�ʽ���ַ�������ļ���,�ļ�ʹ��GBK�ۿ�������,ʹ��UTF-8�ۿ�ʱ������
		FileOutputStream fos = new FileOutputStream("test.txt");
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
		osw.write("���");
		osw.close();

		// �����UTF-8�ķ�ʽд����������(6���ֽ�),���Ǹ�д�����ļ��йۿ�ʱ������.��ʱ��ʹ��UTF-8�ķ�ʽ���Ǹ��ļ��ж���,��������ô?
		FileInputStream fis = new FileInputStream("test.txt");
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		System.out.println((char) isr.read());
		System.out.println((char) isr.read());
		//�������룬��ʲô��ʽ���룬����ʲô��ʽ����  �Ͳ���������롣
		isr.close();

	}
	
	@Test
	public void test6() throws UnsupportedEncodingException{
		String str = new String("你好".getBytes(),"UTF-8");
		System.out.println(str);
	}
	
}
