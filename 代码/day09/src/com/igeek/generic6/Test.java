package com.igeek.generic6;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		list1.add("����");
		list1.add("�Ǻ�");
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("����");
		list2.add("����");
		
		//list1.add
		list1.addAll(list2);
		
	}

}
