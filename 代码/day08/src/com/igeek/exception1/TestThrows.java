package com.igeek.exception1;

//����Զ��� ��   
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class TestThrows {

	public static void main(String[] args)  {

		//ע�⣺�ڴ����쳣��ʱ���� ��
		//����֮��˭��˭����
			test();
	
	}
	
	public static void test() {
		//try һ��ֻ�������ܲ����쳣�Ĵ��롣
		int a = 0;
		try {
			a = 10;
			FileWriter fw = new FileWriter("d:/a.txt");
			File file = new File("d:/aaa");
		} catch (FileNotFoundException e) {
			e.printStackTrace();//����� ��
		} catch (IOException e) {
			e.printStackTrace();//����ġ�����
		}
		System.out.println(a);
	}

}
