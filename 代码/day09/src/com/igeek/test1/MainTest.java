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
				//������=18   �����µļ�����������ݡ�
				newPersons.add(new Person("LGD",90));
				//ע�� ����ʱ�ڵ������������ϵ�ʱ�򣬲������ԭʼ�������޸Ĳ�����
			}
			System.out.println(person.getName()+"==="+person.getAge());
			sum+=person.getAge();
		}
		System.out.println(sum);
		
		//���µļ�������ƴ�ӹ�����
		persons.addAll(newPersons);
		
		
		/**
		 * ��ʽ:
		 * 	for(��������  sb:list){
		 * 		Syso(sb);
		 *  }
		 */
		
		for (Person person : persons) {
			Person p = person;
			System.out.println(p.getName()+"==="+p.getAge());
		}
		//ConcurrentModificationException �����޸��쳣��
		
		//˼· �� ����һ���µļ��϶��� ��������϶����д��ÿһ��90���� ��װ��֮���ٰ�����µļ��ϣ��ŵ��ϵļ����С�
	}

}
