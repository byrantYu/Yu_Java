package com.igeek.day12.oop2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//��ķ����ֻ��("quandan","xiaohua") 1ֻè(jack..."����"��"��è")�� 
		
		
		Person tom = new Person();
		tom.setName("��ķ");
		
		Pet qd = new Pet("ȫ��",null);
		Pet xh = new Pet("С��",null);
		
		ArrayList<Pet> jackFriends = new ArrayList<Pet>();
		jackFriends.add(new Pet("����",null));
		jackFriends.add(new Pet("��è",null));
		
		Pet jack = new Pet("�ܿ�",jackFriends);
		
		ArrayList<Pet> tomPets = new ArrayList<Pet>();
		tomPets.add(qd);
		tomPets.add(xh);
		tomPets.add(jack);
		
		
		
		
		
	}

}
