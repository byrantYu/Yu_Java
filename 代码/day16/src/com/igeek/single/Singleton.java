package com.igeek.single;

//���ģʽ  ���������ģʽ  ��
//��ʵ��  ����ʵ��  ��
//Ĭ������� һ���࣬���Դ�������������(��ʵ��ģʽ)

//һ����  ֻ����һ�����������
public class Singleton {
	
	//����ʽ  ����ģʽ �� �������̰߳�ȫ����ġ�
	private static Singleton single = new Singleton(); //����� ��ʵ������
	/**
	 * public Singleton(){
	 * 
	 * }
	 */
	//ͨ��ʲô��������ģ�����     
	private Singleton(){
		
	}
	
	//дһ��������������������� �����������ض��� �����ص�ǰ��Ķ��� ��
	public static Singleton getInstance(){
		return single;
	}
}
/**
 * ��Ҫ��ɵ���ģʽ 
 * 1.��Ҫ˽�л������� ��
 * 2.������Ҫ���صĶ���(��Ա����)��  ����ֱ��new ������ʽ��
 * 3.дһ����̬���������������Ա���� ��
 * */
