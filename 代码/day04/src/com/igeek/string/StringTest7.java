package com.igeek.string;

import java.util.Scanner;

public class StringTest7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ÇëÊäÈëÄÚÈİ£º");
		String input = sc.nextLine();
		
		String s = input.substring(0, 1).toUpperCase();
		String e = input.substring(1,input.length()).toLowerCase();
		System.out.println(s+e);
	}

}
