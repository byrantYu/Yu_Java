package com.igeek.exception2;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("���������rank��:");
		int  rank = sc.nextInt();
		CaiException cai= null;
		if(rank<2000){
			 cai = new CaiException("����...");
		}
		
		try{
			throw cai; //throw �ؼ���  ��ʾ�Զ�һ���쳣 ��
		}catch(Exception e){
			e.printStackTrace();
		}*/
		test();
		//throw   ,  throws  ,try catch ��ɶ����
		//throw ����һ���Զ����쳣���쳣��������Լ�����ġ�NullPointerException
		//throws ��ʾ�׳��쳣��һ��д�ڷ�����С���Ÿ�������֮�䡣˭����˭����
		//try catch ��ʾ���񲢴����쳣��
	}

	public static void test(){
		throw new NullPointerException("��ָ���� ������");
	}
}
