package com.igeek.string;

public class StringTest4 {

	public static void main(String[] args) {
		String str1 = "hello-hehe";
		String [] strs = {"1","123","324","abc"};
		//System.out.println(strs.length);
		//length...
		//System.out.println(str1.length());
		
		//输入指定的字符串  返回出现的下标。
		String str2 = "0123456789A";
		//System.out.println(str2.indexOf(65));
		//System.out.println(str2.indexOf("321"));
		//System.out.println(str2.indexOf("A", 5));
		
		//字符串的截取。
		String newStr2 = str2.substring(4);
		System.out.println(newStr2);
		// 包括开始下标，但是不包括结束下标  。这是他截取的内容。
		String newStr3 = str2.substring(0,2);
		System.out.println(newStr3);
		
		//遍历字符串 。
		for (int i = 0; i < str2.length(); i++) {
			System.out.print(str2.charAt(i));
		}
	}

}
