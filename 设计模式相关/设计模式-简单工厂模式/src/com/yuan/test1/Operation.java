package com.yuan.test1;

import java.util.Scanner;

import org.junit.Test;

//Operation ������
public class Operation {
	
	//дһ����ý���ķ�����
	//numberA ����A  numberB ����B  operate ��ʾҪ�����������
	public static double getResult(int numA,int numB,String operate){
		double result=0.0;
		switch (operate) {
		case "+":
			result = numA + numB;
			System.out.println(result);
			break;
		case "-":
			result = numA - numB;
			System.out.println(result);
			break;
		case "*":
			result = numA * numB;
			System.out.println(result);
			break;
		case "/":
			if (numB != 0) {
				result = numA / numB;
				System.out.println(result);
			} else {
				System.out.println("0������Ϊ������");
			}
			break;
		}
		return result;
	}
	
	@Test
	public  void test(){
		getResult(10,20,"+");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("����������A--");
		int numA = sc.nextInt();
		System.out.println("����������B");
		int numB = sc.nextInt();
		System.out.println("������+ - * /");
		String str = sc.next();
		double b1=getResult(numA,numB,str);
		System.out.println("�����:"+b1);
	}
	/**
	 * �β���Ϊҵ��ķ�װ��
	 * ��ҵ���߼�(�㷨)������߼�(����̨)����,�������ǵ���϶ȡ�ֻ�з��뿪���ܴﵽ������չ��Ŀ�ġ�
	 * ��ʱ��̸������ȫ���������Ϊֻ���˷�װ����û��ʹ�ü̳��Լ���̬��
	 * 
	 *�������������������%ȡģ֮��Ľ���أ�
	 *���ܻ�˵��һ��Operation�༴�ɣ���switch �����һ��case��֧�Ϳ����ˡ�
	 *��ô���������ˣ�ֻ�ǵ���������ȥ���һ��ȡģ��ȴҪ�������Ĵ��붼��������룬�����С�ĸĴ��˰�+���е�+�ĳ�
	 *-����ô����ʹ��ˡ�
	 *
	 *�������ȥά�����ǹ�˾��н�ʹ���ϵͳ��
	 *���ԭ��ֻ�м�����Ա(��н),�г�������Ա(��н+���),����(��н+�ɷ�)�������㡣����Ҫ���Ӽ�ְ������Ա(ʱн)
	 *������յ�ǰ����д������Ҫ�����һ��ʱнȴҪ��ԭ�������㷨���㷨����㡣��������ﲻƽ��,�ڼ�����Ա���м��롣
	 *if(Ա����XXX){
	 *	salary*=1.1;
	 *}	 
	 *��ô��Ĺ����ǲ��Ǽ���10%�أ���������Ҫ���������ε�Ŷ������
	 *��ʱӦ�ÿ��ǼӼ��˳��ȶ�Ҫ�����ȥ�����Ҫ�漰���̳��Լ���̬�ˡ�
	 *��ô�뿴test2���е��޸Ľ����
	 **/
}
