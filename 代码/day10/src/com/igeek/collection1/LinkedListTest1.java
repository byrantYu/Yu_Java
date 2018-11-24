package com.igeek.collection1;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

import org.junit.Test;

public class LinkedListTest1 {
	
	@Test
	public void test3(){
		//实现队列 。
		LinkedList<String> list = new LinkedList<String>();
		list.offer("哈哈1");
		list.offer("哈哈12");
		list.offer("哈哈13");
		
		String str = list.poll();
		System.out.println(str);
		String str1 = list.peek();
		System.out.println(str1);
		
	}
	
	@Test
	public void test2(){
		//LinkedList 中对于栈的实现 。
		LinkedList<String> list = new LinkedList<String>();
		list.push("哈哈1");
		list.push("哈哈2");
		list.push("哈哈3");
		
		String str = list.pop();//Object  >  造型。
		System.out.println(str);
		String str2 = list.peek();
		System.out.println(str2);
	}
	
	@Test
	public  void test(){
		//Vector,ArrayList ... 实现方式 同样都是对象数组 。  
		//效率低下。  Vector的一个子类 ，从JDK
		Stack stack = new Stack();
		stack.push("哈哈");
		stack.push("呵呵");
		stack.push("ABC");
		
	}
	@Test
	public void sb1(){
		//ArrayList  //LinkedList ...  都是集合 。都是List接口的实现类。
		//ArrayList 多用在遍历 。
		//LinkedList多用在需要频繁修改的集合上。
		
		LinkedList<String> list = new LinkedList<String>();//Linked
		
		list.add("hello");
		list.add("张全蛋");
		list.add("富士康");
		
		list.addFirst("123");
		list.addLast("哈哈");
		
		//System.out.println(list);
		//System.out.println(list.getLast());
		//System.out.println(list.getFirst());
		
		//后面讲的集合  就没有下标可以用了。
		//System.out.println(list.get(1));
		//1.ArrayList .循环添加 20W 条元素 。  0 ...
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//迭代器 。
		Iterator it = list.iterator();
		while(it.hasNext()){
			//如果不调用 .hasNext()方法 ，会出现一个异常 。 NoSuchElementException
			System.out.println(it.next());//取出元素，移动指针。
		}
		
		for (Iterator it1 = list.iterator(); it1.hasNext();) {
			System.out.println(it1.next());
		}
		
		for (String string : list) {
			System.out.println(string);
		}
	}
}
