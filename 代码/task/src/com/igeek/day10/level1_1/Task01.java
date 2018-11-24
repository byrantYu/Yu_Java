package com.igeek.day10.level1_1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Task01 {

	/**
	 * 项目需求：请用户从控制台输入信息，程序将信息存储到文件Info.txt中。
	 * 可以输入多条信息，每条信息存储一行。当用户输入：”886”时，程序结束。
	 * @throws Exception 
	 */
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);	
		BufferedWriter bw = new BufferedWriter(new FileWriter("Info.txt"));
		System.out.println("请输入内容:");
		while(true){
			String result = sc.nextLine();
			if(result.equals("886")){
				break;
			}
			bw.write(result);
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
	
}
