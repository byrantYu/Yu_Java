package com.igeek.abstract1;
//һ������̳г����� ���������  ��д(��д������)Override ���������еĳ��󷽷���
public class Dog extends Quan {

	@Override
	public void speak() {
		System.out.println("��������...");
	}

	@Override
	public void eat() {
		System.out.println("����������");
	}

	@Override
	public void dream() {
		System.out.println("���뵥��������single-dog...");
	}

	public void mimi(){
		System.out.println("��ϲ��Ů���ˡ�����");
	}
}
