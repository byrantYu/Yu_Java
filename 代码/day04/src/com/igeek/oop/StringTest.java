package com.igeek.oop;

public class StringTest {

	public static void main(String[] args) {
		
		//String str1 = "hello";
		//String str2 = "hello2";
		//==��  ����ĵ�ַ ��
		//System.out.println(str1 == str2);
		String str3 = new String("hello");// ���������ַ������� ��һ���Ƕ��е�new String ,һ���ǳ������е�hello...
		String str4 = new String("hello");
		System.out.println(str3==str4);
		//System.out.println(str3==str1);
		
		//�����ַ������ж�  �� ������Ҫʹ��equals() �����������þ����ж��ַ�����ֵ�Ƿ���ȣ������ǿ��ڴ��ַ��
		System.out.println(str3.equals(str4));
		//equals ������ʵ��   ��ʼ����  �ж������ַ������е�ÿһ��Ԫ���Ƿ���� ��
	}

}
