package com.igeek.io2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.junit.Test;

public class IOTest2 {
	@Test
	public void test3() throws Exception{
			FileOutputStream fos = new FileOutputStream("e:/test1.txt");
			byte [] b = {97,98,99,-71,-2};
			fos.write(b,3,2);//从b数组中，写入数据到test1.txt文件中，从数组的下标为3的位置开始写，写2位。
			fos.flush();
			fos.close();
	}
	

	//字节输出流 
	@Test
	public void test2() throws Exception{
			FileOutputStream fos = new FileOutputStream("e:/test1.txt");
			byte [] b = {97,98,99,-71,-2};
			fos.write(b);
			fos.flush();
			fos.close();
	}
	//字节输出流 
	@Test
	public void test1() throws Exception{
		FileOutputStream fos = new FileOutputStream("e:/test1.txt");
		fos.write(97);//写入unicode 编码 。 会写入这个编码所对应的字符 。
		fos.flush();
		fos.close();
	}
}
