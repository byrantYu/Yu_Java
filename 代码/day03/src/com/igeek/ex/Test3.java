package com.igeek.ex;

import java.util.Stack;

public class Test3 {

	public static void main(String[] args) {
			int a = 10;
			int b = 20;
			a = b-a;
			b = b-a;
			a = b+a;
			System.out.println(a);
			System.out.println(b);
			
			
			//栈 。  CVS 
			Stack stack = new Stack();
			int x = 10;
			int y = 20;
			stack.push(x);
			stack.push(y);
			x = (int) stack.pop();
			y = (int) stack.pop();
			System.out.println(x);
			System.out.println(y);
			
			
			int  a1 = 10;
			int  a2 = 20;
			
			int temp = a1;
				a1   = a2;
				a2   =temp;
			//交换变量。
	}
	
	
}
