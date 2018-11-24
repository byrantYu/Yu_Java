package com.igeek.test1;

import java.util.ArrayList;
import java.util.Iterator;

public class Test1 {

	public static void main(String[] args) {
		//ArrayList  底层使用Object [] 来存储 。
		
		//在添加泛型的时候，一定要指定基本数据类型的包装类 。
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		//遍历集合的方式 。
		/*for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for (Integer sb : list) {
			System.out.println(sb);
		}*/
		//使用迭代器对象 来遍历集合。   
		//使用迭代器来遍历集合   创建迭代器对象 。  你要遍历的集合 .iterator 方法就可以拿到一个迭代器对象。
		/*Iterator it = list.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}*/
		
		//for循环+迭代器来遍历集合。
		for (Iterator it = list.iterator(); it.hasNext();) {
			System.out.println(it.next());
		}
		
		//key - value   键值对儿    name - 小明
	}

}
