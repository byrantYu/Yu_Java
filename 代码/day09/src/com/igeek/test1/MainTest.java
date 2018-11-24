package com.igeek.test1;

import java.util.ArrayList;
import java.util.Iterator;

public class MainTest {

	public static void main(String[] args) {
		ArrayList<Person> persons = new ArrayList<Person>();
		persons.add(new Person("jack",18));
		persons.add(new Person("rose",20));
		persons.add(new Person("Trump",62));
		persons.add(new Person("lingling",18));
		int sum = 0;
		ArrayList<Person> newPersons = new ArrayList<Person>();
		Iterator<Person> it = persons.iterator();
		while(it.hasNext()){
			Person person = it.next();
			if(person.getAge()==18){
				//当年龄=18   就往新的集合李添加数据。
				newPersons.add(new Person("LGD",90));
				//注意 ：此时在迭代器遍历集合的时候，不允许对原始集合做修改操作。
			}
			System.out.println(person.getName()+"==="+person.getAge());
			sum+=person.getAge();
		}
		System.out.println(sum);
		
		//把新的集合整体拼接过来。
		persons.addAll(newPersons);
		
		
		/**
		 * 格式:
		 * 	for(数据类型  sb:list){
		 * 		Syso(sb);
		 *  }
		 */
		
		for (Person person : persons) {
			Person p = person;
			System.out.println(p.getName()+"==="+p.getAge());
		}
		//ConcurrentModificationException 并发修改异常。
		
		//思路 ， 创建一个新的集合对象 。这个集合对象中存放每一个90的人 。装完之后，再把这个新的集合，放到老的集合中。
	}

}
