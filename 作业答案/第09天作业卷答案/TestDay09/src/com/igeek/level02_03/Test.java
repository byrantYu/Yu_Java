package com.igeek.level02_03;

import java.util.ArrayList;

/*
		�����������󣬲��ô���ʵ��
		1.����ArrayList���ϣ��������ַ���
		   ��:"ab1" "123ad"  "bca" "dadfadf"  "dddaaa"  "��ð�"  "������"  "���ܰ�"
		2.��������,ɾ�����ȴ���5���ַ���,��ӡɾ����ļ��϶���
		
	˼·��
		1.�������ϣ��õ�ÿһ���ַ���
		2.�ж��ַ��������Ƿ����5���������5����ɾ��
		ab1" "123ad"  "bca" "dadfadf"  "dddaaa"  "��ð�"  "������"  "���ܰ�"
		                       4
		ab1" "123ad"  "bca"   "dddaaa"  "��ð�"  "������"  "���ܰ�"
 */
public class Test {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("ab1");
		list.add("123ad");
		list.add("bca");
		list.add("dadfadf");
		list.add("dddaaa");
		list.add("��ð�");
		list.add("������");
		list.add("���ܰ�");
		//�������ϣ��õ�ÿһ���ַ���
		for(int i = 0; i < list.size(); i++) {
			//�õ�ÿһ���ַ���
			String str = list.get(i);
			//�ж��ַ��������Ƿ����5
			if(str.length() > 5) {
				//�������5����ɾ��
				list.remove(i);
				i--;
			}
		}
		
		//����
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}