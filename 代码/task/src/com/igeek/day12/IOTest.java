package com.igeek.day12;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import org.junit.Test;

public class IOTest {

	@Test
	public void test1() throws Exception {
		// 字符缓冲流的整行读取。
		FileReader fr = new FileReader("e:/a.txt");
		//
		BufferedReader br = new BufferedReader(fr);
		//readLine() 缓冲流方法中特有的。 表示一次读取一行内容 。
		String str = null;
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}

		br.close();// 关闭缓冲流即可。
		fr.close();
	}

	@Test
	public void test2() throws Exception {
			//aaaa
		    //bbbb 
			//cccc
		
		//cccc
		//bbbb
		//aaaa
		
		// 将文件test.txt中所有内容读取,并倒序再输入进test.txt中
		FileReader fr = new FileReader("e:/a.txt");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("e:/b.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		// 定义容器 用来存储读取到的数据 。
		ArrayList<String> list = new ArrayList<String>();

		String str = null;

		while ((str = br.readLine()) != null) {
			list.add(str);
		}
		//
		Collections.reverse(list);

		for (String string : list) {
			bw.write(string);
			bw.newLine();
		}

		bw.close();
		br.close();
	}

	@Test
	public void test3() throws Exception {
		FileOutputStream fos = new FileOutputStream("a.txt");
		//字节输出转换刘 。
		OutputStreamWriter osw = new OutputStreamWriter(fos);
		osw.write("hello,中国。");
		
		// 与缓冲流类似。转换流包含字节流,所以直接关闭转换流,字节流也关闭了
		osw.close();
	}

	@Test
	public void test4() throws Exception {
		//
		FileInputStream fis = new FileInputStream("a.txt");

		int b = -1;
		while ((b = fis.read()) != -1) {
			System.out.println((char) b);
		}

		fis.close();
		System.out.println("=====================");

		// 字符流(这里使用转换流转成一个字符流)
		FileInputStream fis2 = new FileInputStream("a.txt");
		//转换流 ， 把字节转换成字符。
		InputStreamReader isr = new InputStreamReader(fis2);

		int c = -1;
		while ((c = isr.read()) != -1) {
			System.out.println((char) c);
		}

		isr.close();

		//
	}

	@Test
	public void test5() throws Exception {
		// 使用UTF-8的方式将字符输出到文件中,文件使用GBK观看会乱码,使用UTF-8观看时正常的
		FileOutputStream fos = new FileOutputStream("test.txt");
		//转换成字符输出流 。"UTF-8" 指定输出字符的编码集。
		OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8");
		osw.write("你好");
		osw.close();

		// 如果用UTF-8的方式写出两个汉字(6个字节),在那个写出的文件中观看时乱码了.这时再使用UTF-8的方式从那个文件中读回,还会乱码么?
		FileInputStream fis = new FileInputStream("test.txt");
		InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
		System.out.println((char) isr.read());
		System.out.println((char) isr.read());
		//不会乱码，用什么方式编码，就用什么方式解码  就不会出现乱码。
		isr.close();

	}
	
	@Test
	public void test6() throws UnsupportedEncodingException{
		//"浣犲ソ".getBytes(); 方法的作用 可以将字符串转成字节数组 。
		//终极转换乱码的方式 。
		String result = new String("浣犲ソ".getBytes(), "utf-8");
		System.out.println(result);
	}
	
	@Test
	public void test7(){
		// woai,i like ,i enjoy 
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int i = 0;
		while(input.indexOf("java")!=-1){
			//input = input.replace("java", "");
			input = input.replaceFirst("java", "");
			i++;
		}
		
		System.out.println(input+"==="+i);
	}
	
	//ClassRoom  类   。   描述   属性1:班级号    属性2:班级所有的学生 。   ArrayList<Student> studentList;
}
