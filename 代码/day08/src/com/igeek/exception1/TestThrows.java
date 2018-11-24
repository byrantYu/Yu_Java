package com.igeek.exception1;

//万物皆对象 。   
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class TestThrows {

	public static void main(String[] args)  {

		//注意：在处理异常的时候，抛 。
		//抛玩之后，谁用谁处理。
			test();
	
	}
	
	public static void test() {
		//try 一般只包裹可能产生异常的代码。
		int a = 0;
		try {
			a = 10;
			FileWriter fw = new FileWriter("d:/a.txt");
			File file = new File("d:/aaa");
		} catch (FileNotFoundException e) {
			e.printStackTrace();//这里的 。
		} catch (IOException e) {
			e.printStackTrace();//这里的。。。
		}
		System.out.println(a);
	}

}
