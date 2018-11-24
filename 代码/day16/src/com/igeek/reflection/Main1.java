package com.igeek.reflection;

public class Main1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Class.forName("");
		//System.out.println(args[0]);
		//classType ¿‡¿‡–Õ °£
		
		Class classType =  Class.forName(args[0]);
		Office office = (Office) classType.newInstance();
		office.start();
	}

}
