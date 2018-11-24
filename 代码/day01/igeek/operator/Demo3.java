package com.igeek.operator;

public class Demo3 {

	public static void main(String[] args) {
		/**
		 * 逻辑运算符 。逻辑运算符，短路运算符。
		 * (逻辑上的东西比较严谨，无论什么情况都会参与运算。)
		 * (短路 在特殊情况下，右边不参与运算。)
		 * 	& 表示与     逻辑&   只有两边都为真的时候结果才为真。
		 * 	| 表示或    逻辑|  两边只要有一个是真的，整个表达式的结果就是真的。
		 * 
		 * 	! 表示! 取反的意思 !true 就是false !false就是true  
		 * 
		 * 	^ 表示逻辑异或   两边结果一直，false  两边结果不一致就是true
		 * 
		 *  && 短路与 表示如果左边的结果为false,右边不会参与运算。
		 *  || 短路或 表示如果左边的结果为true,右边不会参与运算。
		 */
		
		boolean flag = !false;
		System.out.println(flag);
		/*
		int x = 1,y = 1;

		if(x++==1 | ++y==1){
			x =7;
		}
		System.out.println("x="+x+",y="+y);  
*/
		int x = 1,y = 1;

		if(x++==1 || ++y==1){
			x =7;
		}
		System.out.println("x="+x+",y="+y); 
		
		
		System.out.println(2<<1);
	}

}
