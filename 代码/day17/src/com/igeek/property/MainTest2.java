package com.igeek.property;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.Properties;
import java.util.Set;

import org.junit.Test;

public class MainTest2 {

	//测试 。  跟流相关的操作
	@Test
	public void test1() throws Exception{
		  
		//测试跟流相关的操作 。
		
		//将properties集合中的内容 存入到指定文件。
		Properties p = new Properties();
		//p 对象 
		p.setProperty("username", "jlsb123");
		p.setProperty("password", "sbsbsb");
		p.setProperty("color", "哈哈");
		
		//Writer writer = new OutputStreamWriter(new FileOutputStream("1.properties"),"UTF-8");
		
		//创建一个文件输出流 对象。
		FileOutputStream out = new FileOutputStream("test.properties");
		
		//需要传入一个  字节流对象 ，然后指定你要设置的编码集 。
		Writer writer = new OutputStreamWriter(out, "UTF-8");
		
		//store 方法 需要传入一个 字符输出流对象 。。。
		p.store(writer, "输出的内容。");
		
		writer.close();
	}
	
	@Test
	public void test2() throws Exception{
		FileInputStream in = new FileInputStream("src/data.properties");
		//声明一个字符输入流 。
		Reader reader = new InputStreamReader(in,"UTF-8");
		
		//创建集合对象 ，用来接受读取到的数据 。
		Properties p = new Properties();
		p.load(reader);
		
		Set<String> keys = p.stringPropertyNames();
		
		for (String string : keys) {
			String value = p.getProperty(string);
			System.out.println(value);
		}
		
		//Bean 豆子 。   JavaBean指的就是   一个类 然后私有属性set/get...
	}
}
