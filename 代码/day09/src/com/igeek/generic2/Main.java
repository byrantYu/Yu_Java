package com.igeek.generic2;

public class Main {

	public static void main(String[] args) {
		GenericTest<String> gt = new GenericTest<String>();
		gt.setmyField("gaga");
		GenericTest<Boolean> gt2 = new GenericTest<Boolean>();
		gt2.setmyField(true);
	}

}
