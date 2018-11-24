package com.igeek.array;

public class ExchangeVariable {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		//1.可以通过算数运算进行交换。   
		//2.声明一个第三方变量。
		int c = 0;
		c=a;
		a=b;
		b=c;
		
		System.out.println(a);
		System.out.println(b);
		
		
		
	}

}
