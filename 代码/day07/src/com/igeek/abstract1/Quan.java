package com.igeek.abstract1;

//������ ������ʵ��������  �����ܴ������������

//�������п����зǳ��󷽷���
//�������п����й����������ǲ���ʵ�������� ���������Ǹ�������ʹ�õġ�
// ���һ�����У����ڳ��󷽷�����ô����������ڵ���һ���ǳ����� ��
public abstract  class Quan {

	// ���������еĹ�ͬ��������Ϊ ��

	public String name;
	public String type;
	public int age;

	public Quan() {
		//super();
	}

	public Quan(String name , String type,int age) {
		this.name=name;
		this.type=type;
		this.age=age;
	}
	//Ȯ�ƶ��� ��һ������ �� �� �� ��  ������   
	//��   ������     ����  
	//��    �����    ��  
	//����   ���𡣡���    ��+����
	public abstract void speak();  //
	public abstract void eat();

	// ����Ҳ���Ա�abstract�ؼ��������� �� ���󷽷� û�з����� ��{ }
	public abstract void dream();// { }//

}
