package com.igeek.level02;

/*
 * ������˵������벻Ҫ��ǰ���У�
 */
public class Task01 {
	public static void main(String[] args) {
		int x = 1,y = 1;
		if(x++==2 & ++y==2)	{
			x =7;
		}
		System.out.println("x="+x+",y="+y); 
		
		int a = 1,b = 1;
		if(a++==2 && ++b==2) {
			a =7;
		}
		System.out.println("a="+a+",b="+b);
	}

}
