package com.igeek.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import org.junit.Test;

public class IOTest3 {

	@Test
	public void test2() throws Exception{
		//����������Ҫ����ԭʼ�������� ��
		//�ַ�������
		FileReader fr =new FileReader("e:/buffer(1).txt");
		//FileWriter fw =new FileWriter("e:/buffer(1).txt");
		//���뻺����
		BufferedReader br = new BufferedReader(fr);
		//���������
		//BufferedWriter bw = new BufferedWriter(fw);
		
		String hh = br.readLine();
		String hehe = br.readLine();
		System.out.println(hh);
		System.out.println(hehe);
		//
		br.close();
		fr.close();
	}
	@Test
	public void test1() throws Exception{
		//����������Ҫ����ԭʼ�������� ��
		//�ַ�������
		//FileReader fr =new FileReader("e:/b.txt");
		FileWriter fw =new FileWriter("e:/buffer(1).txt");
		//���뻺����
		//BufferedReader br = new BufferedReader(fr);
		//���������
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("����");
		bw.newLine();
		bw.write("�ٺ�");
		//bw.flush();
		
		//�ӿ��д�ٶ� �����������˻��з���������
		
		
		bw.close();
		fw.close();
	}
}
