package com.igeek;

import java.util.Scanner;

public class Main {
	/**
	 * ����¼��һ���ַ�����Ҫ��ɾ�����ַ����е�����java�ַ��������յ��ַ����в��ܰ���java����Ҫ���ӡɾ����Ľ���Լ�ɾ���˼���java�ַ���
	�������¼�룺"java woaijava,i like jajavava,i enjoy java"
	������������
	ԭ�ַ�����"java woaijava,i like jajavava,i enjoy java"��
	�ܹ�������5��javaɾ��java����ַ���Ϊ��" woai,i like ,i enjoy "

	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//��ʼ������
		String input =  scanner.nextLine();
		
		int i = 0;
		//�ж��Ƿ����java  
		while(input.indexOf("java")!=-1){
			//
			i++;
			input=input.replaceFirst("java", "");
		}
		
		System.out.println(input+"==="+i);
	}

}
