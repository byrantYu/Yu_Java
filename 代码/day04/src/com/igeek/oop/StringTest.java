package com.igeek.oop;

public class StringTest {

	public static void main(String[] args) {
		
		//String str1 = "hello";
		//String str2 = "hello2";
		//==号  对象的地址 。
		//System.out.println(str1 == str2);
		String str3 = new String("hello");// 创建两个字符串对象 。一个是堆中的new String ,一个是常量池中的hello...
		String str4 = new String("hello");
		System.out.println(str3==str4);
		//System.out.println(str3==str1);
		
		//对于字符串的判断  ， 我们需要使用equals() 。方法的作用就是判断字符串的值是否相等，而不是看内存地址。
		System.out.println(str3.equals(str4));
		//equals 方法的实现   起始就是  判断两个字符数组中的每一个元素是否相等 。
	}

}
