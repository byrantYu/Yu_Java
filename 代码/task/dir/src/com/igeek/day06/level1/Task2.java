package com.igeek.day06.level1;

public class Task2 {

	public static void main(String[] args) {
		/**
		 * �����5λ���Ļ�������7λ���Ļ���������˶��ٸ�
		 */

		int h5 = getHui5();
		int h7 = getHui7();
		System.out.println(h7 - h5);
	}

	public static int getHui5() {
		int count = 0;
		for (int i = 10000; i <= 99999; i++) {
			int g = i % 10;
			int s = i / 10 %10;
			int b = i / 100 % 10;
			int q = i / 1000 % 10;
			int w = i / 10000 % 10;
			if (g==w && s==q) {
				//5λ���Ļ����� + 1
				count++;
			} 
		}
		return count;
	}

	public static int getHui7() {
		int count = 0;
		for (int i = 1000000; i <= 9999999; i++) {
			int g = i % 10;
			int s = i / 10 %10;
			int b = i / 100 % 10;
			int q = i / 1000 % 10;
			int w = i / 10000 % 10;
			int sw = i / 100000 % 10;
			int bw = i / 1000000 %10;
			if (g==bw && s==sw && b==w) {
				//5λ���Ļ����� + 1
				count++;
			} 
		}
		return count;
	}
}
