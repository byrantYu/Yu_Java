package com.igeek.string;

public class StringTest6 {

	public static void main(String[] args) {
		String str1 = "HelloWorld";
		char[] chars = str1.toCharArray();
		/*for (int i = 0; i < chars.length; i++) {
			System.out.println(chars[i]);
		}*/
		
		String str2 = str1.toUpperCase();
		System.out.println(str2);
		
		System.out.println(str1);
		
		String str3 = str2.toLowerCase();
		System.out.println(str3);
	}

}
