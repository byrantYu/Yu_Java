package com.igeek.zhengze;

public class Test2 {

	public static void main(String[] args) {
		//Ҫ�� �� ǰ8λ Ϊ0-9  a-zA-Z ֮��������ַ� ��@   �̶���ʽ qq.com
		//regex = a  
		String str = "e";
		String regex = "[a-zA-Z]";
		boolean flag = str.matches(regex);
		System.out.println(flag);
	}

}
