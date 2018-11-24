package com.igeek.string;

public class StringTest2 {

	public static void main(String[] args) {
		
		String str1 = "hello";
		
		//charAt方法  表示传入指定的下标  返回下标对应的字符。
		char c = str1.charAt(0);
		System.out.println(c);
		
		//equals方法的作用是判断两个字符串的值是否相等 。  ==
		boolean flag = str1.equals("hello");
		System.out.println(flag);
		
		boolean flag2 = str1.equalsIgnoreCase("HeLLO");
		System.out.println(flag2);
		
		boolean flag3 = str1.startsWith("he");
		System.out.println(flag3);
		
		boolean flag4= str1.endsWith("dd");
		System.out.println(flag4);
		
	}

}
