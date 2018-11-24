package com.igeek.io;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class IOTest4 {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("hello3.txt");

		
	
		int i = 0;
		
		char[] c = new char[5];
		
		while((i=fr.read(c))!=-1){
			System.out.println(new String(c,0,i));
		}
	}

}
