package com.igeek.day06.level1;

import java.util.Random;

public class Task1 {

	public static void main(String[] args) {
		/**
		 * �������5����Χ��[1,100]������,����Щ���������и�λ��ʮλΪ3�����ִ�ӡ����
		 */
		Random r = new Random();
		for (int i = 0; i < 5; i++) {
			int result = r.nextInt(100)+1;//0-99 + 1  
			/**
			 * g   s%10
			 * s   s/10%10
			 * b   s/100%10
			 * q   s/1000%10
			 * w   s/10000%10
			 * ...
			 */
			int g = result%10;
			int s = result/10%10;
			if(g==3||s==3){
				System.out.println(result);
			}
		}
	}

}
