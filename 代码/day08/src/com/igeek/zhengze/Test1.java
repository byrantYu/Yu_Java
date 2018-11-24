package com.igeek.zhengze;

public class Test1 {

	public static void main(String[] args) {
		
		String phone = "18694071558";
		
		//然后指定一个规则 ，规则也是字符串 。
		String regex = "1[34578][0-9]{9}";
		///^([a-zA-Z0-9]+[_|\-|\.]?)*[a-zA-Z0-9]+@([a-zA-Z0-9]+[_|\-|\.]?)*[a-zA-Z0-9]+(\.[a-zA-Z]{2,3})+$/
		boolean flag = phone.matches(regex);
		System.out.println(flag);
		
		
		String strs = "hello  java hello     nihao   hehe";
		
		//可以使用正则表达式  来分切你的字符串。
		String [] newstrs = strs.split(" +");
		
		for (String string : newstrs) {
			System.out.println(string);
		}
	}

}
