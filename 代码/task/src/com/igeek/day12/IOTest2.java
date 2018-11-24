package com.igeek.day12;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.junit.Test;

public class IOTest2 {

	@Test
	public void test1() {
		String str = FilenameUtils.getExtension("a.txt");//获得文件后缀。
		System.out.println(str);
		String str2 = FilenameUtils.getName("a.txt");//获得文件名称。
		System.out.println(str2);
		boolean flag = FilenameUtils.isExtension("a.ppt", new String[]{"doc","docx","ppt"});//判断左边的后缀是否在右边的数组中存在
		System.out.println(flag);
	}
	
	
	@Test
	public void test2() throws Exception{
		//File file = new File("a.txt");
		//将内容读取到一个字符串对象中。
		//String str = FileUtils.readFileToString(file);
		//System.out.println(str);
		
		//将指定内容写入到文件中。
		//FileUtils.writeStringToFile(file, "哈哈哈哈哈。。。。");
		//FileUtils.writeStringToFile(file, "\r\n黑呵呵呵", true);
		
		
		//文件夹的复制
		File file = new File("src");
		File file2 = new File("dir");
		FileUtils.copyDirectoryToDirectory(file, file2);
		
		//文件的赋值。
		//FileUtils.copyFile(new File("a.txt"), new File("sb.txt"));
	}
	
	@Test
	public void test3(){
		//MyUtils.wan(10, 20);
		double d = MyUtils.testMath(-9.2424);
		System.out.println(d);
		
		long l = MyUtils.round(4.5);
		System.out.println(l);
	}
}
