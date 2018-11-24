package com.igeek.string;

public class StringTest {

	public static void main(String[] args) {
		
		//字符串中的常用方法介绍 。
		
		//创建字符串的几种方式。
		String str1 = new String("hello");
		
		byte [] b1 = new byte[]{65,66,67};
		String str2 =new String(b1);
		System.out.println(str2);
		
		char [] c1 = new char[]{'h','e','l','l','o'};
		String str3 = new String(c1);
		System.out.println(str3);
		
		String str4 = "hello...";
	}

}
