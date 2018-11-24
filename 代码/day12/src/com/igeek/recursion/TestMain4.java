package com.igeek.recursion;

import java.io.File;

public class TestMain4 {

	public static void main(String[] args) {
		//递归打印每个文件夹 。
		//声明一个File 对象 。
		File file =new File("./");
		printFile(file);
	}
	
	//封装 。
	public static void printFile(File file){
		File[] listFiles = file.listFiles();
		//拿到当前路径下所有的文件对象 。可以循环遍历 。
		for (File file2 : listFiles) {
			if(file2.isFile()){
				System.out.println(file2.getAbsolutePath());
			}else{
				System.out.println(file2.getAbsolutePath());
				printFile(file2);
			}
		}
	}

}
