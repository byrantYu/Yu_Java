package com.igeek.io3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class IOTest {

	@Test
	public void test1() throws Exception{
		FileOutputStream fos = new FileOutputStream("obj.txt");
		//����
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Person p = new Person("��ķ",20);
		oos.writeObject(p);
		oos.flush();
		oos.close();
		fos.close();
	}
	@Test
	public void test2() throws Exception{
		FileInputStream  fis = new FileInputStream("obj.txt");
		//���л�����
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		Person p = (Person)obj;
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
	}
	
}
