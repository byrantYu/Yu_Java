package com.igeek.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import java.io.FileReader;
import java.io.FileWriter;

public class IOTest6 {

	public static void main(String[] args) throws Exception {
		//FileReader 字符输入流对象 FileWriter字符输出流对象   只能读取文档类型 。txt .docx
		
		//FileInputStream 字节流输入对象  FileOutputStream 字节流输出对象 。 注意 这个什么都能读。
		//  010010101011   .avi   gaojing.avi   mp4   map3 jpeg png ...
		//  2G ...  
		
		//FileReader fr = new FileReader("数组.xlsx");
		//FileWriter fw = new FileWriter("sb.xlsx");
		FileInputStream fr = new FileInputStream("数组.xlsx");
		FileOutputStream fw = new FileOutputStream("jlsb.xlsx");
		int i = 0;
		byte [] c = new byte [1024];
		while((i=fr.read(c))!=-1){
			fw.write(c, 0, i);
		}
		fw.close();
		fr.close();
		
	}

}
