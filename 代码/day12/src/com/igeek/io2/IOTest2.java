package com.igeek.io2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.junit.Test;

public class IOTest2 {
	@Test
	public void test3() throws Exception{
			FileOutputStream fos = new FileOutputStream("e:/test1.txt");
			byte [] b = {97,98,99,-71,-2};
			fos.write(b,3,2);//��b�����У�д�����ݵ�test1.txt�ļ��У���������±�Ϊ3��λ�ÿ�ʼд��д2λ��
			fos.flush();
			fos.close();
	}
	

	//�ֽ������ 
	@Test
	public void test2() throws Exception{
			FileOutputStream fos = new FileOutputStream("e:/test1.txt");
			byte [] b = {97,98,99,-71,-2};
			fos.write(b);
			fos.flush();
			fos.close();
	}
	//�ֽ������ 
	@Test
	public void test1() throws Exception{
		FileOutputStream fos = new FileOutputStream("e:/test1.txt");
		fos.write(97);//д��unicode ���� �� ��д�������������Ӧ���ַ� ��
		fos.flush();
		fos.close();
	}
}
