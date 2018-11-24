package com.igeek.level02;
/*
 * 分析以下需求，并用代码实现：
	1.珠穆朗玛峰高度为8848米，有一张足够大的纸，厚度为0.0001米。
	2.请问，我折叠多少次，可以折成珠穆朗玛峰的高度。
 */
public class Task06 {
	public static void main(String[] args) {
		double zhi = 0.0001;
		int count = 0;
		while(zhi < 8848) {
//			zhi = zhi * 2;
			zhi *= 2;//折纸，厚度*2
			count++;//把技术器+1
		}
		System.out.println(count);
	}
}
