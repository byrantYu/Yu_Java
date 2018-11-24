package com.lattice.stack;

import java.util.Arrays;
import java.util.EmptyStackException;
/**
 * �����Զ���ջ
 * @author lattice
 *
 */
public class MyStackTest{
	public static void main(String [] args){
		String str="this is lattice testing";
		System.out.println(str);
		MyStack stack=new MyStack();
		for(int i=0;i<100;i++){
			stack.push(i);
		}
		
		for(int i=0;i<100;i++){
			if(i%10==0){
				System.out.println("");
			}
			System.out.print(stack.pop()+" ");
		}
	}
}
/**
 * @use �Զ���ջ 
 * @author lattice
 *
 */
class MyStack {
	private Object[] elements;
	private int size=0;
	//���ó�ʼջsize
	private static final int MYSTACK_LENGTH = 20;
	public MyStack(){
		elements=new Object[MYSTACK_LENGTH];
	}
	//��ջ
	public void push(Object obj){
		//�����µ�ջ�ռ䣬���ڴ���µ�����
		enSureCapacity();
		elements[size++]=obj;
		
	}
	//��ջ
	public Object pop(){
		if(size==0)
			throw new EmptyStackException();
		Object result=elements[size-1];
		elements[--size]=null;//��չ������á�
		return result;
	}
	/**
	 * ������ջ�����
	 */
	private void enSureCapacity(){
		if(elements.length == size)
			elements =Arrays.copyOf(elements, 2*size+1);
	}
}
