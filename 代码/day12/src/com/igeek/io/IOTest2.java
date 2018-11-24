package com.igeek.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import org.junit.Test;

public class IOTest2 {
	
	
	@Test
	public void test2() throws Exception{
		//ʹ���������������ļ��ĸ��ơ�
		//�ַ��� �� Reader ... Writer .
		FileReader fr =new FileReader("e:/b.txt");
		FileWriter fw =new FileWriter("e:/b(2).txt");
		//��һ��д�ķ�ʽ ��ֱ��ͨ��int ���� ���洢unicodeֵ��ɶ�д������
		char [] c = new char[1024];
		int i = 0;
		//  c={'B','C'}  i = 2    2!=-1 
		//      0   1   2
		//{BCDvi. }
		while((i=fr.read(c))!=-1){
			fw.write(c, 0, i);
		}
		fw.close();
		fr.close();
	}
	@Test
	public void test1() throws Exception{
		//ʹ���������������ļ��ĸ��ơ�
		//�ַ��� �� Reader ... Writer .
		FileReader fr =new FileReader("e:/b.txt");
		FileWriter fw =new FileWriter("e:/b(1).txt");
		//��һ��д�ķ�ʽ ��ֱ��ͨ��int ���� ���洢unicodeֵ��ɶ�д������
		int i = 0;
		while((i=fr.read())!=-1){
			fw.write(i);
		}
		fw.close();
		fr.close();
	}
}
