package com.igeek.sb;

public class StringBuilderTest {

	public static void main(String[] args) {
		//StringBuilder 做字符串拼接  。StringBuffer ...都是做字符串拼接的。
		//String  final 表示最终的 。 
		//被final修饰的变量 不能被重新赋值 。被final修饰的类 ，不能被继承。
		//被final修饰的方法，不能被重写。
		long startTime = System.currentTimeMillis();
		String str = "";
		for(int i = 0;i<50000;i++){
			str+=i;//str = str + i; 12345678910111213...
		}
		long resultTime = System.currentTimeMillis()-startTime;
		System.out.println(resultTime);
		//5s
		
		
		
		
	}

}
