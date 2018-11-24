package com.igeek.level02_02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * 第四题：分析以下需求，并用代码实现
	1.项目根目录下建立文件： user.txt，文件中存放用户名和登录密码，格式：用户名，密码,如：aaa,123；
	2. user.txt文件中初始存放的用户信息有如下：
		jack,123
		rose,123
		tom,123
	3.要求完成如下功能：
	  程序运行时：控制台提示用户输入注册的用户名和密码；
	   验证键盘录入的用户名跟user.txt中已注册的用户名是否重复：
	   是：控制台提示：用户名已存在
	   否：将键盘录入的用户名及密码写入user.txt文件，并在控制台提示：注册成功；
	   
	  思路：
	  	1.键盘用户名和密码
	  	2.定义一个标记用来判断用户是否注册过，初始值false
	  	3.读取文件，把读取到的每一行用户名和我们输入的用户名做比较，如果相等，就把标记改为true
	  	4.判断标记，如果标记为true，代表已经注册过了，就打印用户名已存在，否则，把用户名和密码续写入到user.txt
 */
public class Test {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名");
		String username = sc.nextLine();
		System.out.println("请输入密码");
		String password = sc.nextLine();
		//定义标记
		boolean flag = false;
//		读取文件，把读取到的每一行用户名和我们输入的用户名做比较，如果相等，就把标记改为true
		BufferedReader br = new BufferedReader(new FileReader("user.txt"));
		String line = null;
		//循环读
		while((line = br.readLine()) != null) {
			/*//根据逗号分隔用户名和密码
			String[] strArr = line.split(",");
			//每一行用户名和我们输入的用户名做比较
			if(username.equals(strArr[0])) {
				flag = true;
			}*/
			//拿到逗号所在的索引
			int index = line.indexOf(",");
			//截取用户名
			String user = line.substring(0, index);
			if(username.equals(user)) {
				flag = true;
			}
		}
		br.close();
		//判断标记，如果标记为true，代表已经注册过了，就打印用户名已存在，否则，把用户名和密码续写入到user.txt
		if(flag) {
			System.out.println("不好意思用户名已经存在");
		} else {
			//把用户名和密码续写入到user.txt
			BufferedWriter bw = new BufferedWriter(new FileWriter("user.txt",true));
			//换行
			bw.newLine();
			//写入用户名和密码
			bw.write(username+","+password);
			bw.flush();
			bw.close();
			System.out.println("用户名和密码注册成功");
		}
	}
}









