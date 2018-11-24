package com.igeek.data;

public class Test {

	public static void main(String[] args) {
		
		/*
		 *  short s1 = 10;
		 *  short s2 = (short)(s1+10);
		 *  
		 *  就是强制转换，跟隐式转换的应用 。
		 */
		short s1 = 10;
		short s2=s1+=10;//等价于s1+=10 等价于s1=s1+10;+=  -= *= /= %=都会 自动帮你完成强转操作。
	}
	
	

}
