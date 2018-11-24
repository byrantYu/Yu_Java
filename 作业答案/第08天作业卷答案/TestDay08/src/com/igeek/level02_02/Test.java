package com.igeek.level02_02;

import java.util.Scanner;

/*
 * �����������󣬲��ô���ʵ��
	1.����¼��һ�����ַ���,��¼��һ��С�ַ���
	2.ͳ��С�ַ����ڴ��ַ����г��ֵĴ���
	3.�������д�ӡ��ʽ:
		��������ַ���:abcdefg
		������С�ַ���:a
		����̨���:С�ַ���a,�ڴ��ַ���abcdefg�й�����1��
 */
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1.����¼��һ�����ַ���,��¼��һ��С�ַ���
		System.out.print("��������ַ���:");
		String big = sc.nextLine();
		System.out.print("������С�ַ���:");
		String small = sc.nextLine();
		// 2.ͳ��С�ַ����ڴ��ַ����г��ֵĴ���
		int count = getCount(big, small);
		// 3.�������д�ӡ��ʽ:
		System.out.println("С�ַ���"+ small +",�ڴ��ַ���"+ big +"�й�����"+ count +"��");
	}

	/*
	 * �������ܣ�ͳ��С�ַ����ڴ��ַ����г��ֵĴ���
	 * ������big ������ַ���
	 * ������small ����С�ַ���
	 * ����ֵ��С�ַ����ڴ��ַ����г��ֵĴ���
	 */
	public static int getCount(String big, String small) {
		int index = 0;
		int count = 0;
		/*
		 * indexOf(String str, int fromIndex) 
		 * �÷������ã���fromIndexλ�ÿ�ʼ���ң��ַ���str��һ�γ��ֵ�λ�ã���û�ҵ����Ż�-1
		 */
		while((index = big.indexOf(small, index)) != -1){
			index++;
			count++;
		}
		return count;
	}
}
