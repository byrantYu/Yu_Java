package com.igeek.level02;

import java.util.Random;
import java.util.Scanner;

/*
 * ��һ�⣺�����������󣬲��ô���ʵ��
	1.����¼��༶����
	2.����¼��İ༶������������
	3.�������������0-100�ĳɼ�(����0��100)
	4.Ҫ��:
		(1)��ӡ�ð༶�Ĳ���������
		(2)��ӡ�ð༶��ƽ����
		(3)��ʾ��ʽ����:
			������༶����:
			����¼��:100
			����̨���:
				����������:19
				�༶ƽ����:87
	
	˼·
	1.�����������ͳ�Ʋ����������������������¼�ܷ���
	2.����¼��������
	3.�������飬�������ĳ��Ȱ༶����
	4.�������飬���Ҳ��������(�ɼ�)�����������ֵ�������ÿһ��Ԫ��
	5.�жϳɼ��Ƿ�С��60�����С�ڣ��Ͳ���������+1
	6.�ѵ�ǰ�ɼ��ۼӵ��ܳɼ�
	7.����ӡ������������ƽ����
 */
public class Task04 {
	public static void main(String[] args) {
		//��¼����������
		int notPassCount = 0;
		//��¼�ܷ���
		int totalScore = 0;
		//����¼��
		Scanner sc = new Scanner(System.in);
		System.out.println("������༶����");
		int stuNum = sc.nextInt();
		//��������
		int[] arr = new int[stuNum];
		Random r = new Random();
		//��������
		for(int i = 0; i < arr.length; i++) {
			//��������ĳɼ�
			int score = r.nextInt(101);
			//���������ֵ�������ÿһ��Ԫ��
			arr[i] = score;
//			�жϳɼ��Ƿ�С��60�����С�ڣ��Ͳ���������+1
			if(score < 60) {
				notPassCount++;
			}
//			�ѵ�ǰ�ɼ��ۼӵ��ܳɼ�
			totalScore += score;
		}
		//��ƽ����
		double avgScore = totalScore / (stuNum + 0.0);
		System.out.println("������������"+notPassCount);
		System.out.println("�༶ƽ����:" + avgScore);
	}
}
