package com.igeek.innerclass;
/**
 * 
 * 
 * @author ����Ӫ
 * @Version 1.0 2018��8��29��
 * Company wh.igeekhome.com
 * 
 * �ڲ���  
 * 		
 * 		һ:��Ա�ڲ��� 
 * 			��1.���η� ,������public,default,protected,private ��
 * 			(2.�ڲ�������Ǿ�̬�ģ�Ҳ�����ǷǾ�̬�� ��)
 * 				��̬�ڲ���: ֻ�ܷ������ľ�̬��Ա���������������̬��Ա��
 * 				�Ǿ�̬�ڲ���: ���治��������̬��Ա��
 * 			(3.�����Ա�final���Ρ�){��final���ε��಻�ܱ��̳�,̫���ࡣ}
 * 		��:�ֲ��ڲ���(�ڲ����ڷ����ж��塣)
 * 			1.�����ľֲ��ڲ���
 * 					1.1ֻ���Ƿ�static�� ��   
 * 					1.2ֻ���ڶ���ķ����д���������ʹ�� ��
 * 					1.3û�з���Ȩ�����η�����ֻ����Ĭ�ϲ�д�ģ�
 * 			2.�����ڲ��ࡣ
 * 					һ������������ӿڶ��󣬻��߳��������
 * 					{ �ڷ������м���ʵ�ֵķ����� }
 * 	
 * 		���������У���Ҫʹ��һ������ڲ��࣬��Ҫ���¸�ʽ����������
 * 			�ⲿ��.�ڲ���     �������� = new �ⲿ�๹����().new �ڲ��๹����();
 * 		���ⲿ������Ҫ�����ڲ���ĳ�Ա ���ǳ��򵥴�������
 * 		���ڲ�������Ҫ�����ⲿ��ĳ�Ա���ǳ���ֱ��д��
 */
public class Out {

	private String name="��ȫ��";
	private static int age=20;
	
	
	
	class Inner{
		 
		 private  String name="����"; 
		 //ֻ�о�̬�ڲ����У�����������̬��Ա ��
		//һ���ڲ����Ǿ�̬�� ֻ��ʹ�����ľ�̬��Ա��
		 public void eat(String name){
			 System.out.println(name);
			 System.out.println(this.name);
			 System.out.println(Out.this.name);
			 //System.out.println(super.name);
			 System.out.println(age);
			 wan();
		 }
	}
	
	public void play(){
		//���ⲿ������Ҫ�����ڲ���ĳ�Ա ���ǳ��򵥴�������
		Inner in = new Inner();
		in.eat("gaga");
	}
	
	public void wan(){
		//û�з���Ȩ�����η� �� default
		 class MethodInnerClass{
			int age=12;
			String name = "��С��";
			public void test(){
				System.out.println("�����¾ֲ��ڲ��ࡣ");
			}
		}
		
		MethodInnerClass mic = new MethodInnerClass();
		System.out.println(mic.name);
		System.out.println(mic.age);
		mic.test();
	}
}
