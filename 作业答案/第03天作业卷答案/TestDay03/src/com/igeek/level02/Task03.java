package com.igeek.level02;

/*
 * 看程序说结果，请不要提前运行？
 */
public class Task03 {
	public static void main(String[] args) {
		int x = 2,y=3;
		switch(x)
		{
			default:
				y++;
			case 3:
				y++;
				break;
			case 4:
				y++;
		}
		System.out.println("y="+y);
	}
}
