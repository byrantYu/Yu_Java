package com.igeek.collection1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

import org.junit.Test;

public class LinkedListTest1 {
	
	@Test
	public void test3(){
		//ʵ�ֶ��� ��
		LinkedList<String> list = new LinkedList<String>();
		list.offer("����1");
		list.offer("����12");
		list.offer("����13");
		
		String str = list.poll();
		System.out.println(str);
		String str1 = list.peek();
		System.out.println(str1);
		
	}
	
	@Test
	public void test2(){
		//LinkedList �ж���ջ��ʵ�� ��
		LinkedList<String> list = new LinkedList<String>();
		list.push("����1");
		list.push("����2");
		list.push("����3");
		
		String str = list.pop();//Object  >  ���͡�
		System.out.println(str);
		String str2 = list.peek();
		System.out.println(str2);
	}
	
	@Test
	public  void test(){
		//Vector,ArrayList ... ʵ�ַ�ʽ ͬ�����Ƕ������� ��  
		//Ч�ʵ��¡�  Vector��һ������ ����JDK
		Stack stack = new Stack();
		stack.push("����");
		stack.push("�Ǻ�");
		stack.push("ABC");
		
	}
	@Test
	public void sb1(){
		//ArrayList  //LinkedList ...  ���Ǽ��� ������List�ӿڵ�ʵ���ࡣ
		//ArrayList �����ڱ��� ��
		//LinkedList��������ҪƵ���޸ĵļ����ϡ�
		
		LinkedList<String> list = new LinkedList<String>();//Linked
		
		list.add("hello");
		list.add("��ȫ��");
		list.add("��ʿ��");
		
		list.addFirst("123");
		list.addLast("����");
		
		//System.out.println(list);
		//System.out.println(list.getLast());
		//System.out.println(list.getFirst());
		
		//���潲�ļ���  ��û���±�������ˡ�
		//System.out.println(list.get(1));
		//1.ArrayList .ѭ����� 20W ��Ԫ�� ��  0 ...
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//������ ��
		Iterator it = list.iterator();
		while(it.hasNext()){
			//��������� .hasNext()���� �������һ���쳣 �� NoSuchElementException
			System.out.println(it.next());//ȡ��Ԫ�أ��ƶ�ָ�롣
		}
		
		for (Iterator it1 = list.iterator(); it1.hasNext();) {
			System.out.println(it1.next());
		}
		
		for (String string : list) {
			System.out.println(string);
		}
	}
}
