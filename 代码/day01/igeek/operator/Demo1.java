package com.igeek.operator;

public class Demo1 {

	public static void main(String[] args) {
		//算数运算符。
		// % 取模  取余数    *  /   +  -   
		// ++  --  表示自身+1 或者自身-1 
		// ++  -- 写在变量之前，表示变量先自身加减，后参与运算。
		// ++  -- 写在变量后面，表示先参与运算，后自身加减。
		int a = 5;
		int b = 3;
		int result = ++a;
		System.out.println(a);
		System.out.println(result);
		
		System.out.println("abc \n efg");//Tab的距离  \t 来表示制表符。 \n 
		
		//*	*
		System.out.println('*'+'\t'+'*');
		System.out.println("*"+'\t'+'*');
	}

}
