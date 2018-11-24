package com.igeek.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class IOTest7 {
	/**
	 * XXXXWriter  一定是字符输出流 
	 * XXXXReader  一定是字符输入流
	 * 
	 * XXXXInputStream  一定是字节输入流
	 * XXXXOutputStream 一定是字节输出流
	 * 
	 * buffered 一定是缓冲流。。。
	 * @param args
	 * @throws Exception
	 */
	//NIO ...
	public static void main(String[] args) throws Exception {
		Long startTime = System.currentTimeMillis();
		//FileReader fr = new FileReader("数组.xlsx");
		//FileWriter fw = new FileWriter("sb.xlsx");
		FileInputStream fr = new FileInputStream("c:/canglaoshi2.mp4");
		FileOutputStream fw = new FileOutputStream("c:/canglaoshi3.mp4");
		//创建缓冲流对象。
		BufferedInputStream bi = new BufferedInputStream(fr);
		BufferedOutputStream bo = new BufferedOutputStream(fw);
		/*int i = 0;
		byte [] c = new byte [1024];
		while((i=bi.read(c))!=-1){
			bo.write(c, 0, i);
		}*/
		/*int i = 0;
		while((i=bi.read())!=-1){
			bo.write(i);
		}*/
		bo.close();
		bi.close();
		fw.close();
		fr.close();
		Long time = System.currentTimeMillis()-startTime;
		System.out.println(time);
	}

}
