package com.igeek.liucheng;

public class SwitchCaseDemo1 {

	public static void main(String[] args) {
		
		//ѡ�����̿������  switch case
		//�Ӽ���������һ��1-12֮����� ���ж������Ǹ��·� ��
		
		//ʲôʱ����if  ʲôʱ��switch case ��  ��
		//if ��Ҫ������������ж� ��   switch case ��Ҫ������ָ���ĳ���ֵ���жϡ�
		
		/**
		 * switch(����){
		 * 		case ����1:
		 * 			Ҫִ�еĴ���;
		 * 		break;
		 * }
		 * 
		 * switch case �� �� �ܹ�ʹ����Щ�������� ?
		 * 		byte , short , char, int  
		 * 		String  JDK 1.7 �ſ�ʼ֧��String 
		 * 		enum ö��(���ǿ�����ٳ����Ľ�����Ƕ�����ö�١�) java �Ĺؼ���  ��JDK 1.5 ֮���֧�֡�
		 * 
		 * 		JDK �����������¼��ݡ�
		 * 
		 * 	break,continue ��ʲô���� ��
		 * 	break ��ʾ����  ��������switch case�ṹ�У�Ҳ��������ѭ���ṹ��(for , while , do while).
		 * 		break ��ʾ������ǰѭ�� (������ѭ��Ƕ�ף�break,ֻ������һ��ѭ����)��
		 *  continue ֻ������ѭ������У���ʾ��������ѭ�����ص�ѭ��ͷ�������´�ѭ�� ��
		 *  
		 *  ��Ҫֱ�Ӵ�N��ѭ����ȫ������������ʹ��һ���ؼ��� ��return ;
		 */
		
		//long a = 97;
		String haha = "C";
		//String str = "A";
		switch (haha) {
		case "A":
			System.out.println("�������1");
			break;
		case "B":
			System.out.println("�������2");
			break;
		case "C":
			System.out.println("�������3");
			break;
		default://��ѡ��  ���Բ�д��
			System.out.println("����������㣬��ִ��default�еĴ��롣");
			break;
		}
		
		
		
	}

}
