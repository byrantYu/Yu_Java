package com.igeek.single;

public class Niu {
	private static Niu niu = new Niu();
	private Niu(){
		
	}
	public static Niu getInstance(){
		return niu;
	}
}
