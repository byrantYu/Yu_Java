package com.igeek.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest2 {

	public static void main(String[] args) throws ParseException {
		String rule = "yyyy��MM��dd��HH:mm:ss";
		DateFormat df = new SimpleDateFormat(rule);
		//��date����ת��������Ҫ�����ڸ�ʽ ��
		
		//�����ڸ�ʽ ת������Ҫ��ϵͳʱ�� ��Date . ������������
		String date = "2016��10��30��08:08:08";
		
		Date d = df.parse(date);
		
		System.out.println(d);
		
		System.out.println(Math.PI); //�ʽ�  �ִ� ������  ���㹤���ࡣ  CVS  .
		
	}

}
