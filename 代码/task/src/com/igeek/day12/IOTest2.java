package com.igeek.day12;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.junit.Test;

public class IOTest2 {

	@Test
	public void test1() {
		String str = FilenameUtils.getExtension("a.txt");//����ļ���׺��
		System.out.println(str);
		String str2 = FilenameUtils.getName("a.txt");//����ļ����ơ�
		System.out.println(str2);
		boolean flag = FilenameUtils.isExtension("a.ppt", new String[]{"doc","docx","ppt"});//�ж���ߵĺ�׺�Ƿ����ұߵ������д���
		System.out.println(flag);
	}
	
	
	@Test
	public void test2() throws Exception{
		//File file = new File("a.txt");
		//�����ݶ�ȡ��һ���ַ��������С�
		//String str = FileUtils.readFileToString(file);
		//System.out.println(str);
		
		//��ָ������д�뵽�ļ��С�
		//FileUtils.writeStringToFile(file, "������������������");
		//FileUtils.writeStringToFile(file, "\r\n�ںǺǺ�", true);
		
		
		//�ļ��еĸ���
		File file = new File("src");
		File file2 = new File("dir");
		FileUtils.copyDirectoryToDirectory(file, file2);
		
		//�ļ��ĸ�ֵ��
		//FileUtils.copyFile(new File("a.txt"), new File("sb.txt"));
	}
	
	@Test
	public void test3(){
		//MyUtils.wan(10, 20);
		double d = MyUtils.testMath(-9.2424);
		System.out.println(d);
		
		long l = MyUtils.round(4.5);
		System.out.println(l);
	}
}
