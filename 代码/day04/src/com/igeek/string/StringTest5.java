package com.igeek.string;

import java.util.Scanner;

public class StringTest5 {

	public static void main(String[] args) {
		//输入内容，统计大小写以及数字出现的次数 。
		//boolean flag = true;
		while(true){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串。");
		String inputString = sc.nextLine();
		if(inputString.equals("-")){
			break;
		}
		int number = 0;
		int upper = 0;
		int lower = 0;
		
		for (int i = 0; i < inputString.length(); i++) {
			//拿到每一个字符 。
			char c = inputString.charAt(i);
			if(c<='Z'&&c>='A'){
				upper++;
			}else if(c<='z'&&c>='a'){
				lower++;
			}else if(c<='9'&&c>='0'){
				number++;
			}else{
				System.out.println("非法。");
			}
		}
		
		System.out.println("大写出现:"+upper+"次");
		System.out.println("小写出现:"+lower+"次");
		System.out.println("数字出现:"+number+"次");
		}
	}

}
