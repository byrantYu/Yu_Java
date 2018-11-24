package com.igeek.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

import org.junit.Test;

public class IOTest {
	@Test
	public void reader2() throws Exception{
			 
			File file = new File("e:/b.txt");//   /  \\ 都可以 
			FileReader fr = new FileReader(file);
			char [] c = new char [10];  
			int i = fr.read(c, 0, 10);//表示读取到的数据 存到c数组中 。 offset 起始下标 。  i 表示读取多少个字符。 
			System.out.println(i);
			System.out.println(Arrays.toString(c));
			fr.close();
	}
	@Test
	public void reader1() throws Exception{
			 
			File file = new File("e:/b.txt");//   /  \\ 都可以 
			FileReader fr = new FileReader(file);
			char [] c = new char [10];//" "  声明一个数组 ，用来存储 读取到的数据 。一般数组长度的大小为1024的整数倍。
			int i  = fr.read(c);//返回值 i 表示 读取到的数据总长度。
			System.out.println(i);
			System.out.println(Arrays.toString(c));
	}
	@Test
	public void test7()throws Exception{
		FileWriter fw = new FileWriter("e:/b.txt",true);
		//左边参数 表示需要写入的字符串   off 表示其实下标 。  leng  长度  。
		char [] c = {'a','v','i','.'};
		fw.write(c, 1, 3);
		fw.flush();//将数据写入到文件。
		fw.close();//释放资源 ，java程序不再占用。同时断开流对象。
	}
	@Test
	public void test6()throws Exception{
		FileWriter fw = new FileWriter("e:/b.txt");
		//左边参数 表示需要写入的字符串   off 表示其实下标 。  leng  长度  。
		fw.write("ABCDEF", 1, 3);
		fw.flush();//将数据写入到文件。
		fw.close();//释放资源 ，java程序不再占用。同时断开流对象。
	}
	@Test
	public void test5()throws Exception{
		FileWriter fw = new FileWriter("e:/b.txt");
		int i = 97;
		fw.write(i);//传入unicode 编码，会把编码所对应的字符 写入到文件中。
		fw.flush();//将数据写入到文件。
		fw.close();//释放资源 ，java程序不再占用。同时断开流对象。
	}
	
	@Test
	public void test4()throws Exception{
		FileWriter fw = new FileWriter("e:/b.txt");
		char [] c = {'你','号','吗','?'};
		fw.write(c);
		fw.flush();//将数据写入到文件。
		fw.close();//释放资源 ，java程序不再占用。同时断开流对象。
	}
	
	@Test
	public void test3() throws Exception{
		//true 跟 不加的用法 。  加了true 会追加内容 。  不加true  会覆盖，替换原有内容。
		FileWriter fw = new FileWriter("e:/b.txt");
		fw.write("张全蛋。。。");
		fw.flush();//将数据写入到文件。
		fw.close();//释放资源 ，java程序不再占用。同时断开流对象。
	}

	@Test
	public void test2() throws Exception{
			 
			File file = new File("d:/a.txt");//   /  \\ 都可以 
			FileReader fr = new FileReader(file);
			int i = 0;//声明变量i  用来接受读取到的unicode ...
			while((i=fr.read())!=-1){
				System.out.println((   char     )i);
			}
			
	}

	@Test
	public void test1() {
		/**
		 * 输入流:从指定位置到java程序 。 输出流:从java程序到指定位置。
		 * 
		 * 字节流(8 bit)，字符流(16 bit)
		 * 
		 * 字节流 : InputStream(字节输入流) OutputStream(字节输出流)
		 * 
		 * 字符流 : Reader(字符输入流) Writer(字符输出流)
		 */
		FileReader fr = null;

		try {

			File file = new File("d:/a.txt");// / \\ 都可以
			fr = new FileReader(file);
			int i = fr.read();// read()方法 表示读取一个字符。 方法的返回值 ，就是该字符所对应的unicode编码。
			System.out.println((char) i);
			int i2 = fr.read();
			System.out.println((char) i2);
			int i3 = fr.read();
			System.out.println((char) i3);
			int i4 = fr.read();
			System.out.println(i4);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (fr != null) {
				try {
					fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
