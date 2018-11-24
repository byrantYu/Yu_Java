package com.igeek.level02_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
	分析以下需求，并用代码实现
	定义一个工具类IOUtils，有以下方法，方法描述如下(以下操作只针对纯文本文件(.txt文件))：
	1.copyFile2Dir(String srcFile,String destDir)
	    参数String srcFile:要复制的源文件
		参数String destDir:复制产生的新文件的存储路径(目标路径)
		要求：将srcFile文件复制到destDir目标文件夹中(不能改变源文件的名称)
	2.copyDir2Dir(String srcDir,String destDir)
		参数File srcDir:要复制的源文件夹
		参数File destDir:复制产生的新文件的存储路径(目标路径)
		要求：将srcDir文件夹中的所有文件(不包含子文件夹)复制到destDir目标文件夹中(不能改变源文件的名称)
 */
public class IOUtils {
	/*
	 * 1.copyFile2Dir(String srcFile,String destDir)
	       参数String srcFile:要复制的源文件
		参数String destDir:复制产生的新文件的存储路径(目标路径)
		要求：将srcFile文件复制到destDir目标文件夹中(不能改变源文件的名称)
	 */
	public static void copyFile2Dir(String srcFile,String destDir) throws IOException{
		//数据源
		BufferedReader in = new BufferedReader(new FileReader(srcFile));
		//目的地
		BufferedWriter out = new BufferedWriter(new FileWriter(new File(destDir, srcFile)));
		//读文件中数据
		String line = null;
		while((line = in.readLine()) != null){
			//写数据到文件
			out.write(line);
			out.newLine();
			out.flush();
		}
		//关闭流
		in.close();
		out.close();
	}
	
	/*
	 * 2.copyDir2Dir(String srcDir,String destDir)
		参数File srcDir:要复制的源文件夹
		参数File destDir:复制产生的新文件的存储路径(目标路径)
		要求：将srcDir文件夹中的所有文件(不包含子文件夹)复制到destDir目标文件夹中(不能改变源文件的名称)
	 */
	public static void copyDir2Dir(String srcDir,String destDir) throws IOException{
		File srcFile = new File(srcDir);
		File destFile = new File(destDir);
		copyDir2Dir(srcFile, destFile);
	}
	
	//复制文件夹
	public static void copyDir2Dir(File srcFile,File destFile) throws IOException{
		//遍历源文件夹，获得每个子文件、子文件夹
		File[] files = srcFile.listFiles();
		for (int i = 0; i < files.length; i++) {
			File file = files[i]; //子文件或子文件夹
			File dest = new File(destFile,file.getName());//目的地路径
			//判断是文件还是文件夹
			if (file.isDirectory()) {
				//文件夹
				copyDir2Dir(file, dest);
			} else {
				//文件
				copyFile(file, dest);
			}
		}
	}

	//复制文件
	public static void copyFile(File file, File dest) throws IOException {
		//数据源
		BufferedReader in = new BufferedReader(new FileReader(file));
		//目的地
		BufferedWriter out = new BufferedWriter(new FileWriter(dest));
		//读文件中数据
		String line = null;
		while((line = in.readLine()) != null){
			//写数据到文件
			out.write(line);
			out.newLine();
			out.flush();
		}
		//关闭流
		in.close();
		out.close();
	}
}
