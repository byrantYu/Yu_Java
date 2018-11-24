package com.igeek.io2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

import org.junit.Test;

public class IOTest {
	//transient 短暂的 。  被这个关键字修饰的属性 ，不能被序列化 。
	//字节流 。  8bit   InputStream  字节输入流  OutputStream 字节输出流
	@Test
	public void test3()throws Exception{
		//文件字节输出流 
		FileInputStream fis = new FileInputStream("e:/b.txt");
		byte [] b = new byte[1024];
		int i = fis.read(b, 0, 1024);
		System.out.println(i);
		System.out.println(Arrays.toString(b));
		fis.close();
		
		//byte -128  127    
	}
	@Test
	public void test2()throws Exception{
		//文件字节输出流 
		FileInputStream fis = new FileInputStream("e:/b.txt");
		byte [] b = new byte[5];
		int i = fis.read(b);//i 表示读取到的数组的长度。
		System.out.println(i);
		System.out.println(Arrays.toString(b));
		fis.close();
		
		//byte -128  127    
	}
	
	
	@Test
	public void test1() throws Exception{
		//文件字节输出流 
		FileInputStream fis = new FileInputStream("e:/b.txt");
		int i  = fis.read();//读取一个字符的unicode 编码。
		System.out.println((char)i);
		int i2 = fis.read();
		System.out.println((char)i2);
		fis.close();
	}
}
