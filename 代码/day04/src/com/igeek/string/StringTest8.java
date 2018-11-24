package com.igeek.string;

import java.util.UUID;

public class StringTest8 {

	public static void main(String[] args) {
		String str = "haha-.-abcdef-.-eee-.-ddd-.-zeze-123";
		String newStr = str.trim();
		System.out.println(newStr);
		
		//
		String[] newStr2 = str.split("-.-");
		//ForEach 增强for循环 JDK 1.5之后才能用的。
		for(String sb:newStr2){
			System.out.println(sb);
		}
		
		UUID id = UUID.randomUUID();
		String uuid = id.toString().replace("-", "");
		
		System.out.println(uuid);
	}

}
