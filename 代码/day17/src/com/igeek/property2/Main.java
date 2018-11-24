package com.igeek.property2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.Constructor;
import java.util.Properties;

import org.junit.Test;

public class Main {

	@Test
	public void test1(){
		Student stu = new Student(1,"王尼玛");
		System.out.println(stu);
		
		//...
	}
	
	//java反射+配置文件 来动态的创建对象 。达到一种灵活编程的目的。
	@Test  
	public void test2() throws Exception{
		//String str = "007";
		//int i = Integer.parseInt(str);
		//System.out.println(i);
		FileInputStream in = new FileInputStream("classname.properties");
		Reader reader = new InputStreamReader(in, "UTF-8");
		//读取配置文件 。
		Properties classProperties = new Properties();
		classProperties.load(reader);
		//拿到要加载的类 。
		String className = classProperties.getProperty("ClassName");
		//创建java反射 。 
		Class classType = Class.forName(className);
		//Object obj = classType.newInstance();
		//System.out.println(obj);   会报错  ，当前类中没有空参构造器 。java反射创建对象，是会调用空参构造器的。
		Constructor c = classType.getConstructor(int.class,String.class);
		//ID,NAME 也是取出来的。
		FileInputStream in1 = new FileInputStream("data.properties");
		Reader reader1 = new InputStreamReader(in1, "UTF-8");
		Properties content = new Properties();
		content.load(reader1);
		String strId = content.getProperty("id");
		int id = Integer.parseInt(strId);
		String name = content.getProperty("name");
		//Student 类对象 。。。
		Object obj = c.newInstance(id,name);
		System.out.println(obj);
		reader1.close();
		reader.close();
	}
}
