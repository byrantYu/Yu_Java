package com.igeek.generic;

//generic ���͵���˼ ��
/**
 * һ���������������λ�� �� <> �����巺�͡� 
 * 	E T V K 
 *  
 *  <E1,E2...> ���Ϳ���ָ�������� ���������֮��ʹ�ã����
 *  
 *  ��ʹ�÷��͵�ʱ��Ҫôȫ�����á� Ҫ�þ�Ҫȫ��ָ�����з��͡�
 * 
 * @author ����Ӫ
 * @Version 1.0 2018��8��31��
 * Company wh.igeekhome.com
 */
public class GenericTest<K,V> {
	
	//������ӵķ��ͣ����������ڷ�������ʽ�����ϡ�
	public void add(K e){
		System.out.println("�����:"+e);
	}
	
	//����ȷ������Ĳ����ľ������͵�ʱ��
	public void remove(V i){
		
	}
}
