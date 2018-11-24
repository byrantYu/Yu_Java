package com.igeek.generic6;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("¹ş¹ş");
		list1.add("ºÇºÇ");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("ÎûÎû");
		list2.add("ºôºô");
		
		//list1.add
		list1.addAll(list2);
		
	}

}
