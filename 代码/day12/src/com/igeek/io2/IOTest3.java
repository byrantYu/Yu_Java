package com.igeek.io2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.Test;

public class IOTest3 {
	
	@Test
	public void test4(){
		FileInputStream fis=null;
		FileOutputStream fos=null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		try {
			fis = new FileInputStream("E:\\极客营\\ASCII码表完整版.doc");
			fos = new FileOutputStream("e:/ASCII码表完整版(FB).doc");
			bis = new BufferedInputStream(fis);
			bos = new BufferedOutputStream(fos);
			byte [] b = new byte [1024];
			int a = 0;
			while((a=bis.read(b))!=-1){
				bos.write(b, 0, a);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if(bos!=null){
				try {
					bos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(bis!=null){
				try {
					bis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fos!=null){
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if(fis!=null){
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		
	}
	
	//推荐使用这种写法 。
	@Test
	public void test3()throws Exception{
		FileInputStream fis = new FileInputStream("E:\\b.txt");
		FileOutputStream fos = new FileOutputStream("e:/sb(3).txt");
		
		byte [] b = new byte[1024*5];//5kb  0  
		int i = -1;
		//7 
		while((i=fis.read(b))!=-1){
			fos.write(b,0,i); //            
		}
		fos.close();
		fis.close();
	}
	@Test
	public void test2()throws Exception{
		FileInputStream fis = new FileInputStream("E:\\b.txt");
		FileOutputStream fos = new FileOutputStream("e:/sb(2).txt");
		
		byte [] b = new byte[1024*5];//5kb  0  
		int i = -1;
		while((i=fis.read(b))!=-1){
			//不推荐使用 ，会把数组中多余的空格全部写入到文件中 。
			fos.write(b);
		}
		fos.close();
		fis.close();
	}
	@Test
	public void test1() throws Exception{
		//字符流，只针对文本类型的文件进行操作 。
		//字节流，所有的都可以 。
		FileInputStream fis = new FileInputStream("E:\\b.txt");
		FileOutputStream fos = new FileOutputStream("e:/sb.txt");
		
		int i = 0;
		while((i=fis.read())!=-1){
			fos.write(i);
		}
		
		fos.close();
		fis.close();
	}
}
