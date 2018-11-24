package com.igeek.sb;

public class StringBuilderTest2 {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("123");
		/*System.out.println(sb);//
		System.out.println(sb.capacity());
		System.out.println(sb.length());*/
		sb.append("ABC").append("DEF");//表示做字符串拼接操作。
		//sb.append("DEF");
		//System.out.println(sb instanceof String);
		//如何转化 ？
		String result = sb.toString();
		
		//掉玩方法就自动反转了。
		sb.reverse();
		String reverseResult = sb.toString();
		System.out.println(result);
		System.out.println(reverseResult);
		
		
	}

}
