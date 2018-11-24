package com.igeek.string;

import java.util.Scanner;

public class StringTest10 {
	//反转字符串。
	public static void main(String[] args) {
		System.out.println("从控制台输入内容：");
		Scanner sc =new Scanner(System.in);
		String str  = sc.nextLine();
		String result = reverse(str);
		System.out.println(result);
	}

	//反转的功能封装到方法中。
	public static String reverse(String str){
		char [] arrays = str.toCharArray(); 
		
		for (int i = 0; i < arrays.length/2; i++) {
			  char temp = arrays[i];
			  arrays[i] = arrays[arrays.length-i-1];
			  arrays[arrays.length-i-1]=temp;
		}
		String result = new String(arrays);
		return result;
	}
}
