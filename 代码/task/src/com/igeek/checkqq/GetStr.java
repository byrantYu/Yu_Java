/**
 * 
 */
package com.igeek.checkqq;

import java.util.Random;

public class GetStr {

	public static void main(String[] args) {
		char [] chs ={'A','B','C','D','E','F','G',
				'H','I','J','K','L','M','N','O','P',
				'Q','R','S','T','U','V','W','X','Y','Z'};
		System.out.println(getStr(chs));

	}
	public static String getStr(char [] chs){
		Random rd = new Random();
		char [] chas = new char[4];
		String temp = "";
		for (int i = 0; i < chas.length; i++) {
			chas[i] = chs[rd.nextInt(26)];
			temp+=chas[i];
		}
		String str = temp;
		str = str+rd.nextInt(10);
		return str;
		
	}

}
