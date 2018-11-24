package com.igeek;

import java.util.Scanner;

public class Main {
	/**
	 * 键盘录入一个字符串，要求删除该字符串中的所有java字符串（最终的字符串中不能包含java），要求打印删除后的结果以及删除了几个java字符串
	比如键盘录入："java woaijava,i like jajavava,i enjoy java"
	程序输出结果：
	原字符串："java woaijava,i like jajavava,i enjoy java"中
	总共包含：5个java删除java后的字符串为：" woai,i like ,i enjoy "

	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//初始化数据
		String input =  scanner.nextLine();
		
		int i = 0;
		//判断是否存在java  
		while(input.indexOf("java")!=-1){
			//
			i++;
			input=input.replaceFirst("java", "");
		}
		
		System.out.println(input+"==="+i);
	}

}
