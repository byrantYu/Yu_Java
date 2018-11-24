package com.igeek.level02_03;

import java.util.Scanner;

/*
分析以下需求,并用代码实现
	1.键盘录入一个源字符串由字符串变量srcStr接收
	2.键盘录入一个要删除的字符串由字符串变量delStr接收
	3.要求
		删除该字srcStr符串中的所有delStr字符串（最终的字符串中不能包含delStr），要求打印删除后的结果以及删除了几个delStr字符串
	4.代码运行打印格式:
		请输入源字符串:java woaijava,i like jajavava i enjoy java
		请输入要删除的字符串:java
		控制台输出结果:源字符串中总共包含:4 个 java ,删除java后的字符串为: woai,i like  i enjoy

 */
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 1.键盘录入一个源字符串由字符串变量scrStr接收
		System.out.print("请输入源字符串:");
		String srcStr = sc.nextLine();
		// 2.键盘录入一个要删除的字符串由字符串变量delStr接收
		System.out.print("请输入要删除的字符串:");
		String delStr = sc.nextLine();
		// 3.删除该字scrStr符串中的所有delStr字符串（最终的字符串中不能包含delStr），要求打印删除后的结果以及删除了几个delStr字符串
		printCount(srcStr, delStr);
		
	}

	//删除该字scrStr符串中的所有delStr字符串（最终的字符串中不能包含delStr），要求打印删除后的结果以及删除了几个delStr字符串
	private static void printCount(String srcStr, String delStr) {
		//删除后的结果
		String resultStr = srcStr.replace(delStr, "");
		//删除了几个delStr字符串
		int count = (srcStr.length() - resultStr.length()) / delStr.length();
		
		System.out.println("源字符串中总共包含:"+ count +" 个 "+ delStr +" ,删除"+ delStr +"后的字符串为: "+ resultStr);
	}
}
