package com.igeek.level02;

/*
 * 看程序说结果，请不要提前运行？
 */
public class Task05 {
	public static void main(String[] args) {
		short s = 30;
		int i = 50;
		s += i;
		System.out.println("s="+s);
		int x = 0;
		int y = 0;
		int z = 0;
		boolean a,b;
		a = x>0 & y++>1;
		System.out.println("a="+a);
		System.out.println("y="+y);
		b = x>0 && z++>1;
		System.out.println("b="+b);
		System.out.println("z="+z);
		a = x>0 | y++>1;
		System.out.println("a="+a);
		System.out.println("y="+y);
		b = x>0 || z++>1;
		System.out.println("b="+b);
		System.out.println("z="+z);			
	}
}

