package com.igeek.obj;

public class AnimalTest {

	public static void main(String[] args) {
		Animal houzi = new Animal();
		//houzi.legs=-10000;
		//System.out.println(houzi.legs);
		houzi.setLegs(10000);
		int legs = houzi.getLegs();
		System.out.println(legs);
	}

}
