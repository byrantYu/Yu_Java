package com.igeek.level02;

import java.util.Random;
import java.util.Scanner;

/*
 * �ڶ��⣺�����������󣬲��ô���ʵ��
	1.�����࿼��Ҫ���з���,����¼��ð༶�ܹ�������?�Լ�ÿ���ѧ������?
	2.����¼���������ÿ��ѧԱ������������ά����
	3.�������������0-100�ĳɼ�(����0��100)
	4.Ҫ��:
		(1)��ӡ�ð༶��ÿ��Ĳ���������
		(2)��ӡ�ð༶��ÿ���ƽ����
		(3)��ӡ������ƽ����
		(4)��ӡ�༶�еĲ���������
		(5)��ӡ�༶ƽ����
		(6)��ʾ��ʽ����:
			������༶������:3
			������༶��ÿ�������:10
			����̨���:
				��1�鲻��������Ϊ: 6 ��
				��1��ƽ����Ϊ: 52
				��2�鲻��������Ϊ: 7 ��
				��2��ƽ����Ϊ: 46
				��3�鲻��������Ϊ: 3 ��
				��3��ƽ����Ϊ: 69
				�༶�е������ƽ����Ϊ:69
				�༶�в���������Ϊ: 16 ��
				�༶��ƽ����Ϊ: 56
	˼·��
		1.�����ά���顣 new int[����][ѧ������]
		2.�������������¼�༶���ܲ����������Ͱ༶���ܷ���
		3.������ά���飬��������ĳɼ�����ֵ�������ÿһ��Ԫ��
		4.������ɼ�����һ���жϣ��������ɼ�С��60���ͰѲ���������+1
		5.�ѳɼ��ۼӵ��ܳɼ���
		6.��ӡ������������ƽ����
		
		
		ÿ�飺
		�������������ͳ��ÿ��Ĳ�����������ÿ����ܷ���
		ÿͳ����һ���飬�Ϳ��Լ���������½��
		
		�༶�е������ƽ����Ϊ:?
		 ������������԰�0.0��������ƽ����
		 ����������������������ƽ������һ���Աȣ�����������ƽ���ֱ����󣬾Ͱѵ�ǰ����ƽ���ָ�ֵ���������
 */
public class Task05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//����¼������
		System.out.println("����������");
		int groupNum = sc.nextInt();
		//¼��ÿ��ѧ������
		System.out.println("������ÿ��ѧ������");
		int stuNum = sc.nextInt();
		//�����ά����
		int[][] arr = new int[groupNum][stuNum];
		//�ܲ���������
		int totalNotPass = 0;
		//�༶���ܷ���
		int totalScore = 0;
		Random r = new Random();
		//���������������Ϊ����ƽ����
		double maxAvgScore = 0.0;
		for(int i = 0; i < arr.length; i++) {//arr[1]
			//����ÿ�鲻��������
			int groupNotPass = 0;
			//����ÿ����ܷ���
			int groupScore = 0;
			//��ά�����е�ÿ��һά������ô��ʾ  arr[i]
			for(int j = 0; j < arr[i].length; j++) {
				//��������ĳɼ�����ֵ�������ÿһ��Ԫ��
				int score = r.nextInt(101);
				arr[i][j] = score;
//				������ɼ�����һ���жϣ��������ɼ�С��60���ͰѲ���������+1
				if(score < 60) {
					totalNotPass++;
					//��ÿ��Ĳ���������+1
					groupNotPass++;
				}
				totalScore += score;
				groupScore += score;
			}
			System.out.println("��"+ (i + 1) +"�鲻��������Ϊ: "+groupNotPass+" ��");
			//����ƽ����
			double avgGroupScore = groupScore / (arr[i].length + 0.0);
			//����������ƽ���ֱ����󣬾Ͱѵ�ǰ����ƽ���ָ�ֵ�����maxAvgScore
			if(avgGroupScore > maxAvgScore) {
				maxAvgScore = avgGroupScore;
			}
			System.out.println("��"+ (i + 1) +"��ƽ����Ϊ: " + avgGroupScore);
		}
		System.out.println("������������"+totalNotPass);
		//ƽ����
		double avgScore = totalScore / (groupNum * stuNum + 0.0);
		System.out.println("ƽ�����ǣ�"+avgScore);
		System.out.println("������ߵ�ƽ������"+maxAvgScore);
	}
}



