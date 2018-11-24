package com.igeek.day12.oop2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//ÌÀÄ·ÓĞÁ½Ö»¹·("quandan","xiaohua") 1Ö»Ã¨(jack..."òáòæ"£¬"ĞÜÃ¨")¡£ 
		
		
		Person tom = new Person();
		tom.setName("ÌÀÄ·");
		
		Pet qd = new Pet("È«µ°",null);
		Pet xh = new Pet("Ğ¡»¨",null);
		
		ArrayList<Pet> jackFriends = new ArrayList<Pet>();
		jackFriends.add(new Pet("òáòæ",null));
		jackFriends.add(new Pet("ĞÜÃ¨",null));
		
		Pet jack = new Pet("½Ü¿Ë",jackFriends);
		
		ArrayList<Pet> tomPets = new ArrayList<Pet>();
		tomPets.add(qd);
		tomPets.add(xh);
		tomPets.add(jack);
		
		
		
		
		
	}

}
