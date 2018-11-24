package com.igeek.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import org.junit.Test;

public class IOTest2 {
	
	
	@Test
	public void test2() throws Exception{
		//使用输入输出流完成文件的复制。
		//字符流 。 Reader ... Writer .
		FileReader fr =new FileReader("e:/b.txt");
		FileWriter fw =new FileWriter("e:/b(2).txt");
		//第一种写的方式 ，直接通过int 变量 来存储unicode值完成读写操作。
		char [] c = new char[1024];
		int i = 0;
		//  c={'B','C'}  i = 2    2!=-1 
		//      0   1   2
		//{BCDvi. }
		while((i=fr.read(c))!=-1){
			fw.write(c, 0, i);
		}
		fw.close();
		fr.close();
	}
	@Test
	public void test1() throws Exception{
		//使用输入输出流完成文件的复制。
		//字符流 。 Reader ... Writer .
		FileReader fr =new FileReader("e:/b.txt");
		FileWriter fw =new FileWriter("e:/b(1).txt");
		//第一种写的方式 ，直接通过int 变量 来存储unicode值完成读写操作。
		int i = 0;
		while((i=fr.read())!=-1){
			fw.write(i);
		}
		fw.close();
		fr.close();
	}
}
