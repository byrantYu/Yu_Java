package com.igeek.property;

import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainTest {
	
	//
	/*@Before
	public void abc(){
		System.out.println("哈哈before1");
	}*/
	@Before
	public void adc(){
		System.out.println("呵呵before2");
	}
	@Test
	public void test4(){
		System.out.println("D");
	}
	
	@Test
	public void test1(){
		System.out.println("B");
	}
	@After
	public void test3(){
		System.out.println("C");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Property  属性  。  
		//Properties 属性集。
		
		//这两种创建对象的方式 有什么区别 ？
		//Map m = new Properties();
		//m 对象  只能调用   Map接口中有的方法 。
		Properties p = new Properties();
		//p 对象 
		p.setProperty("username", "jlsb123");
		p.setProperty("password", "sbsbsb");
		p.setProperty("color", "哈哈");
		
		Properties p2 = new Properties();
		p2.setProperty("username", "jlsb123");
		p2.setProperty("password", "sbsbsb");
		p2.setProperty("color", "哈哈");
		
		//System.out.println(p==p2);
		
		//String username = p.getProperty("username");
		//System.out.println(username);
		
		
		//遍历  。
		Set<String> keys =  p.stringPropertyNames();
		for (String string : keys) {
			String value = p.getProperty(string);
			System.out.println(value);
		}
	}

}
