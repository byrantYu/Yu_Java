package com.igeek.level02;

import java.util.Scanner;

/*
 * �����������󣬲��ô���ʵ�֣�
	1.���ݹ���(����)��Ա���ǹ���(����),����ͻ�������ͨ������¼��
	2.�ǹ��ʵ��������£�
		[10-15)     +5000
		[5-10)      +2500
		[3~5)       +1000
		[1~3)       +500
		[0~1)       +200
	3.����û�����Ĺ���Ϊ10����������Ϊ3000���������к��ӡ��ʽ"��Ŀǰ������10�꣬��������Ϊ 3000Ԫ, Ӧ�ǹ��� 5000Ԫ,�Ǻ��� 8000Ԫ"

 */
public class Task04 {
	public static void main(String[] args) {
		//����ͻ�������ͨ������¼��
		Scanner sc = new Scanner(System.in);
		System.out.print("�����빤��:");
		int age = sc.nextInt();
		System.out.print("������������ʣ�");
		double money = sc.nextDouble();
		
		double afterMoney = 0.0;
		if (age<0 || age>15) {
			System.out.println("�����������");
		} else if(age >= 10){
			afterMoney = money + 5000;
			System.out.println("��Ŀǰ������"+ age +"�꣬��������Ϊ "+ money +"Ԫ, Ӧ�ǹ��� 5000Ԫ,�Ǻ��� "+ afterMoney +"Ԫ");
		} else if(age >= 5){
			afterMoney = money + 2500;
			System.out.println("��Ŀǰ������"+ age +"�꣬��������Ϊ "+ money +"Ԫ, Ӧ�ǹ��� 2500Ԫ,�Ǻ��� "+ afterMoney +"Ԫ");
		} else if(age >= 3){
			afterMoney = money + 500;
			System.out.println("��Ŀǰ������"+ age +"�꣬��������Ϊ "+ money +"Ԫ, Ӧ�ǹ��� 500Ԫ,�Ǻ��� "+ afterMoney +"Ԫ");
		} else {
			afterMoney = money + 200;
			System.out.println("��Ŀǰ������"+ age +"�꣬��������Ϊ "+ money +"Ԫ, Ӧ�ǹ��� 200Ԫ,�Ǻ��� "+ afterMoney +"Ԫ");
		}
	}
}
