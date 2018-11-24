package com.igeek.file1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class FileTest {

	public static void main(String[] args) {

		//File 类 主要抽象的来描述 计算机中 文件与文件夹 这一类事物所具有的属性，行为。
		//支持 windows linux    \\支持 windows
		File file1 =new File("d:/a.txt"); //称为绝对路径 。
		
		File file2 = new File("a/b/taolu.txt");//相对路径的写法。  相对路径 已当前项目的根路径为准。
		
		String path1 = file2.getAbsolutePath();
		System.out.println(path1);
		
		//getPath()你写的路径是什么 返回的就是什么。
		String path2 = file2.getPath();
		System.out.println(path2);
		
		//获得父路径。
		String path3 = file2.getParent();
		System.out.println(path3);
		//获得具体的文件名称。
		String name = file2.getName();
		System.out.println(name);
	}
	
	@Test
	public void test1() throws Exception{
		//File(String parent, String child) 
		//从父路径名字符串和子路径名字符串创建新的 File实例。 
		File file = new File("a/b","taolu.txt");
		//此时 file 对象，就代表了 实际的这个taolu.txt   我们可以通过这个对象，来获得taolu.txt这个文件的一些基本信息。
		/*long l = file.lastModified();
		System.out.println(l);
		SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String date = sd.format(new Date(l));
		System.out.println(date);*/
		/*boolean flag = file.isDirectory();//判断是否是一个目录。
		System.out.println(flag);
		
		boolean b2= file.delete();//返回值的意思  表示是否删除成功。
		System.out.println(b2);*/
		
		/*boolean b3 = file.exists();
		System.out.println(b3);*/
		
		//boolean b4= file.createNewFile();//表示是否创建成功 。 如果有了 就不在创建 。
//		/System.out.println(b4);
		//boolean b5 = file.canExecute(); 文件是否可执行。
		//System.out.println(b5);
		long l = file.length();
		System.out.println(l);
		
		//mkdirs()  创建多层目录 。
	}
	
	@Test
	public void test2(){
		File file = new File("x/z/a.txt");
		boolean b = file.mkdirs();
		System.out.println(b);
		boolean b2 = file.isFile();
		System.out.println(b2);
		//createNewFile ... 创建具体文件。
	}

	@Test
	public void test3(){
		File file = new File("e:/Jquery");
		//此时的 strs 数组中装的都是字符串 。  就是文件夹，跟文件的名称。
		String[] strs = file.list();
		for (String string : strs) {
			System.out.println(string);
		}
		
		//字符串对象  只能调用字符串方法。
	}
	
	@Test
	public void test4(){
		File file = new File("e:/Jquery");
		//listFiles方法  表示 获得每一个文件对象 。
		File[] files = file.listFiles();
		//如果是一个文件夹 ，就打印当前文件夹名称。
		for (File sb : files) {
			if(sb.isDirectory()){
				System.out.println(sb.getName());
			}
		}
		//File 对象只能调用File类中的方法。
		File[] listFiles = file.listFiles();
	}
}
