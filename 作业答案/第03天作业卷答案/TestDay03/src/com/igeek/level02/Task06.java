package com.igeek.level02;
/*
 * �����������󣬲��ô���ʵ�֣�
	1.���������߶�Ϊ8848�ף���һ���㹻���ֽ�����Ϊ0.0001�ס�
	2.���ʣ����۵����ٴΣ������۳����������ĸ߶ȡ�
 */
public class Task06 {
	public static void main(String[] args) {
		double zhi = 0.0001;
		int count = 0;
		while(zhi < 8848) {
//			zhi = zhi * 2;
			zhi *= 2;//��ֽ�����*2
			count++;//�Ѽ�����+1
		}
		System.out.println(count);
	}
}
