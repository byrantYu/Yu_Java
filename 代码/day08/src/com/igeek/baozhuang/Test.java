package com.igeek.baozhuang;

public class Test {

	public static void main(String[] args) {
		//��װ�� ��
		//��������  1.������������ 2.�����������͡�
		//ÿ�������������Ͷ�������֮��Ӧ�������������ͣ����ǰ�װ�ࡣ
		/**
		 * byte   Byte
		 * short  Short
		 * int    		Integer
		 * long   Long
		 * float  Float
		 * double  Double
		 * boolean Boolean
		 * char 		Character
		 */
		//��װ���д��ںܶೣ�õ����Ը����� ��
		
		//װ�� ������ ��
		//װ��:�ѻ�����������ת���ɰ�װ�����
		//����:�Ѱ�װ�����ת���ɻ����������͡�  
		//JDK1.5 �ֶ���ȥ��װ�䡣 JDK1.5֮��֧���Զ���װ�䡣
		
		/* byte b1 = 12;
		 
		 Byte b2 = new Byte(b1);  //װ�� ��
		 Integer i1 = new Integer(b1);
		 System.out.println(b2.MAX_VALUE);
		 System.out.println(b2.MIN_VALUE);
		 
		 System.out.println(i1.MAX_VALUE);
		 System.out.println(i1.MIN_VALUE);
		 
		 byte b3 = b2.byteValue();//����   �����ǲ��䶼�ǵ���xxxxValue������
		 int i2 = i1.intValue();// 
*/		 
		 
		 int i = 10;
		 Integer i2 = i; //�Զ�װ�� �� ������װ�����  = �����������͡�
		 Integer i3 = 10;//
		 System.out.println(i2);
		
		 int i4 = i3;//�Զ����� �� 
		 System.out.println(i4);
		 String str = "123a";
		 int result = Integer.parseInt(str);//��ΰ�һ���ַ���ת���ɻ����������͡�
		 double result2 = Double.parseDouble(str);
		 float result3 = Float.parseFloat(str);
		 System.out.println(result3);
	}

}
