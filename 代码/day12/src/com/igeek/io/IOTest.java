package com.igeek.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

public class IOTest {
	@Test
	public void reader2() throws Exception{
			 
			File file = new File("e:/b.txt");//   /  \\ ������ 
			FileReader fr = new FileReader(file);
			char [] c = new char [10];  
			int i = fr.read(c, 0, 10);//��ʾ��ȡ�������� �浽c������ �� offset ��ʼ�±� ��  i ��ʾ��ȡ���ٸ��ַ��� 
			System.out.println(i);
			System.out.println(Arrays.toString(c));
			fr.close();
	}
	@Test
	public void reader1() throws Exception{
			 
			File file = new File("e:/b.txt");//   /  \\ ������ 
			FileReader fr = new FileReader(file);
			char [] c = new char [10];//" "  ����һ������ �������洢 ��ȡ�������� ��һ�����鳤�ȵĴ�СΪ1024����������
			int i  = fr.read(c);//����ֵ i ��ʾ ��ȡ���������ܳ��ȡ�
			System.out.println(i);
			System.out.println(Arrays.toString(c));
	}
	@Test
	public void test7()throws Exception{
		FileWriter fw = new FileWriter("e:/b.txt",true);
		//��߲��� ��ʾ��Ҫд����ַ���   off ��ʾ��ʵ�±� ��  leng  ����  ��
		char [] c = {'a','v','i','.'};
		fw.write(c, 1, 3);
		fw.flush();//������д�뵽�ļ���
		fw.close();//�ͷ���Դ ��java������ռ�á�ͬʱ�Ͽ�������
	}
	@Test
	public void test6()throws Exception{
		FileWriter fw = new FileWriter("e:/b.txt");
		//��߲��� ��ʾ��Ҫд����ַ���   off ��ʾ��ʵ�±� ��  leng  ����  ��
		fw.write("ABCDEF", 1, 3);
		fw.flush();//������д�뵽�ļ���
		fw.close();//�ͷ���Դ ��java������ռ�á�ͬʱ�Ͽ�������
	}
	@Test
	public void test5()throws Exception{
		FileWriter fw = new FileWriter("e:/b.txt");
		int i = 97;
		fw.write(i);//����unicode ���룬��ѱ�������Ӧ���ַ� д�뵽�ļ��С�
		fw.flush();//������д�뵽�ļ���
		fw.close();//�ͷ���Դ ��java������ռ�á�ͬʱ�Ͽ�������
	}
	
	@Test
	public void test4()throws Exception{
		FileWriter fw = new FileWriter("e:/b.txt");
		char [] c = {'��','��','��','?'};
		fw.write(c);
		fw.flush();//������д�뵽�ļ���
		fw.close();//�ͷ���Դ ��java������ռ�á�ͬʱ�Ͽ�������
	}
	
	@Test
	public void test3() throws Exception{
		//true �� ���ӵ��÷� ��  ����true ��׷������ ��  ����true  �Ḳ�ǣ��滻ԭ�����ݡ�
		FileWriter fw = new FileWriter("e:/b.txt");
		fw.write("��ȫ��������");
		fw.flush();//������д�뵽�ļ���
		fw.close();//�ͷ���Դ ��java������ռ�á�ͬʱ�Ͽ�������
	}

	@Test
	public void test2() throws Exception{
			 
			File file = new File("d:/a.txt");//   /  \\ ������ 
			FileReader fr = new FileReader(file);
			int i = 0;//��������i  �������ܶ�ȡ����unicode ...
			while((i=fr.read())!=-1){
				System.out.println((   char     )i);
			}
			
	}

	@Test
	public void test1() {
		/**
		 * ������:��ָ��λ�õ�java���� �� �����:��java����ָ��λ�á�
		 * 
		 * �ֽ���(8 bit)���ַ���(16 bit)
		 * 
		 * �ֽ��� : InputStream(�ֽ�������) OutputStream(�ֽ������)
		 * 
		 * �ַ��� : Reader(�ַ�������) Writer(�ַ������)
		 */
		FileReader fr = null;

		try {

			File file = new File("d:/a.txt");// / \\ ������
			fr = new FileReader(file);
			int i = fr.read();// read()���� ��ʾ��ȡһ���ַ��� �����ķ���ֵ �����Ǹ��ַ�����Ӧ��unicode���롣
			System.out.println((char) i);
			int i2 = fr.read();
			System.out.println((char) i2);
			int i3 = fr.read();
			System.out.println((char) i3);
			int i4 = fr.read();
			System.out.println(i4);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
