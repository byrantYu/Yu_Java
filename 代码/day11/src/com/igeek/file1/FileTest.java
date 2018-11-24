package com.igeek.file1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class FileTest {

	public static void main(String[] args) {

		//File �� ��Ҫ����������� ������� �ļ����ļ��� ��һ�����������е����ԣ���Ϊ��
		//֧�� windows linux    \\֧�� windows
		File file1 =new File("d:/a.txt"); //��Ϊ����·�� ��
		
		File file2 = new File("a/b/taolu.txt");//���·����д����  ���·�� �ѵ�ǰ��Ŀ�ĸ�·��Ϊ׼��
		
		String path1 = file2.getAbsolutePath();
		System.out.println(path1);
		
		//getPath()��д��·����ʲô ���صľ���ʲô��
		String path2 = file2.getPath();
		System.out.println(path2);
		
		//��ø�·����
		String path3 = file2.getParent();
		System.out.println(path3);
		//��þ�����ļ����ơ�
		String name = file2.getName();
		System.out.println(name);
	}
	
	@Test
	public void test1() throws Exception{
		//File(String parent, String child) 
		//�Ӹ�·�����ַ�������·�����ַ��������µ� Fileʵ���� 
		File file = new File("a/b","taolu.txt");
		//��ʱ file ���󣬾ʹ����� ʵ�ʵ����taolu.txt   ���ǿ���ͨ��������������taolu.txt����ļ���һЩ������Ϣ��
		/*long l = file.lastModified();
		System.out.println(l);
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = sd.format(new Date(l));
		System.out.println(date);*/
		/*boolean flag = file.isDirectory();//�ж��Ƿ���һ��Ŀ¼��
		System.out.println(flag);
		
		boolean b2= file.delete();//����ֵ����˼  ��ʾ�Ƿ�ɾ���ɹ���
		System.out.println(b2);*/
		
		/*boolean b3 = file.exists();
		System.out.println(b3);*/
		
		//boolean b4= file.createNewFile();//��ʾ�Ƿ񴴽��ɹ� �� ������� �Ͳ��ڴ��� ��
//		/System.out.println(b4);
		//boolean b5 = file.canExecute(); �ļ��Ƿ��ִ�С�
		//System.out.println(b5);
		long l = file.length();
		System.out.println(l);
		
		//mkdirs()  �������Ŀ¼ ��
	}
	
	@Test
	public void test2(){
		File file = new File("x/z/a.txt");
		boolean b = file.mkdirs();
		System.out.println(b);
		boolean b2 = file.isFile();
		System.out.println(b2);
		//createNewFile ... ���������ļ���
	}

	@Test
	public void test3(){
		File file = new File("e:/Jquery");
		//��ʱ�� strs ������װ�Ķ����ַ��� ��  �����ļ��У����ļ������ơ�
		String[] strs = file.list();
		for (String string : strs) {
			System.out.println(string);
		}
		
		//�ַ�������  ֻ�ܵ����ַ���������
	}
	
	@Test
	public void test4(){
		File file = new File("e:/Jquery");
		//listFiles����  ��ʾ ���ÿһ���ļ����� ��
		File[] files = file.listFiles();
		//�����һ���ļ��� ���ʹ�ӡ��ǰ�ļ������ơ�
		for (File sb : files) {
			if(sb.isDirectory()){
				System.out.println(sb.getName());
			}
		}
		//File ����ֻ�ܵ���File���еķ�����
		File[] listFiles = file.listFiles();
	}
}
