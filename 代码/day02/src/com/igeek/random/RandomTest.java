package com.igeek.random;

import java.util.Random;
import java.util.UUID;

public class RandomTest {

	public static void main(String[] args) {
		//C+S+ o  ��������
		Random r = new Random();
		
		int i = r.nextInt(20);
		
		double d = r.nextDouble();
		
		float f = r.nextFloat();
		System.out.println(i);
		System.out.println(d);
		System.out.println(f);
		
		//
		UUID uuid = UUID.randomUUID();
		String uuidStr = uuid.toString();
		System.out.println(uuidStr.length());
		System.out.println(uuidStr.replace("-", ""));
	}

}
