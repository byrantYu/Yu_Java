package com.lattice.stack;

import java.util.Arrays;
import java.util.EmptyStackException;
/**
 * 测试自定义栈
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
 * @use 自定义栈 
 * @author lattice
 *
 */
class MyStack {
	private Object[] elements;
	private int size=0;
	//设置初始栈size
	private static final int MYSTACK_LENGTH = 20;
	public MyStack(){
		elements=new Object[MYSTACK_LENGTH];
	}
	//入栈
	public void push(Object obj){
		//开辟新的栈空间，用于存放新的数据
		enSureCapacity();
		elements[size++]=obj;
		
	}
	//出栈
	public Object pop(){
		if(size==0)
			throw new EmptyStackException();
		Object result=elements[size-1];
		elements[--size]=null;//清空过期引用。
		return result;
	}
	/**
	 * 处理满栈的情况
	 */
	private void enSureCapacity(){
		if(elements.length == size)
			elements =Arrays.copyOf(elements, 2*size+1);
	}
}
