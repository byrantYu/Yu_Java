package com.igeek.level02_04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/*
 * 第六题：分析以下需求，并用代码实现
	项目根路径下有text.txt文件，内容如下：
	我爱极客营
	123456
	利用IO流的知识读取text.txt文件的内容反转后写入text.txt文件中，内容如下：
	123456
	我爱极客营

	
	思路
		创建集合，读取内容放入集合
		反转集合
		把集合内容写入源文件
 */
public class Test {
	public static void main(String[] args) throws IOException {
		ArrayList<String> list = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader("text.txt"));
		String line;
		while((line = br.readLine()) != null) {
			//每读取一行放入集合
			list.add(line);
		}
		br.close();
		//反转集合
//		for(int i = 0; i < list.size()/2;i++) {
//			//第一个和最后一个交换第二个和倒数第二个交换
//			String temp = list.get(i);
//			//倒数第一个赋值给第一个元素
//			list.set(i, list.get(list.size() - 1 -i));
//			list.set(list.size() - 1 -i, temp);
//		}
		Collections.reverse(list);
//		Collections.sort(list);
		BufferedWriter bw = new BufferedWriter(new FileWriter("text.txt"));
		for(int i = 0; i < list.size(); i++) {
			bw.write(list.get(i));
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
}












