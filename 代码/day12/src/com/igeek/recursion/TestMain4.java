package com.igeek.recursion;

import java.io.File;

public class TestMain4 {

	public static void main(String[] args) {
		//�ݹ��ӡÿ���ļ��� ��
		//����һ��File ���� ��
		File file =new File("./");
		printFile(file);
	}
	
	//��װ ��
	public static void printFile(File file){
		File[] listFiles = file.listFiles();
		//�õ���ǰ·�������е��ļ����� ������ѭ������ ��
		for (File file2 : listFiles) {
			if(file2.isFile()){
				System.out.println(file2.getAbsolutePath());
			}else{
				System.out.println(file2.getAbsolutePath());
				printFile(file2);
			}
		}
	}

}
