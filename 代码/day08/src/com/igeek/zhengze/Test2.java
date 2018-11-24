package com.igeek.zhengze;

public class Test2 {

	public static void main(String[] args) {
		//要求 。 前8位 为0-9  a-zA-Z 之间的任意字符 。@   固定格式 qq.com
		//regex = a  
		String str = "e";
		String regex = "[a-zA-Z]";
		boolean flag = str.matches(regex);
		System.out.println(flag);
	}

}
