package com.igeek.level02_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * 第五题：分析以下需求，并用代码实现
	项目根路径下有个questions.txt文件内容如下：
		5+5
		150-25
		155*155
		2555/5
	要求：读取内容计算出结果，将结果写入到results.txt文件中
		5+5=10
		//....
	思考:如果说读取questions.txt文件的内容,算出计算结果,再写入questions.txt文件,即读和写的操作时针对同一个文件,应该如何操作
	
	如何把字符串转成数字
	
	思路：
		1.创建输入流对象，读取每一行输入。每读取一行，就放入到集合中。
		2.遍历集合，拿出每一个式子。判断这个式子中包含哪个运算符，如果包含+就执行加法，如果包含-就执行-法，
		3.然后把计算出的结果，替换到集合中
		4.把集合中的内容写入到文件中
	
 */
public class Test {
	public static void main(String[] args) throws IOException {
		ArrayList<String> list = new ArrayList<>();
		BufferedReader br = new BufferedReader(new FileReader("questions.txt"));
		String line = null;
		//读取数据放入集合
		while((line = br.readLine()) != null) {
			list.add(line);
		}
		br.close();
		//遍历集合
		for(int i = 0 ; i < list.size(); i++) {
			//，拿出每一个式子
			String shiZi = list.get(i);
			int result = getResult(shiZi);
			list.set(i, shiZi + "=" + result);
		}
		//把集合中的内容写入到文件中
		BufferedWriter bw = new BufferedWriter(new FileWriter("results.txt"));
		for(int i = 0; i < list.size(); i++) {
			bw.write(list.get(i));
			bw.newLine();
			bw.flush();
		}
		bw.close();
	}
	/*
	 * "1"
	 * 把字符串转成数字并返回
	 */
	public static int parseInt(String str) {
		int sum = 0;
		for(int i = 0; i < str.length(); i++) {
			int num = str.charAt(i) - 48;
			sum = sum * 10 + num;
		}
		return sum;
	}
	/*
	 * 根据式子计算出对应的结果                      
	 */
	public static int getResult(String shiZi) {//5+5
		//判断是否包含
		if(shiZi.contains("+")) {
			//执行加法
			//用substring进行截取
			int index = shiZi.indexOf("+");
			String num1 = shiZi.substring(0,index);
			String num2 = shiZi.substring(index + 1);
			//把两个字符串类型的数字转成int计算并返回
			return parseInt(num1) + parseInt(num2);
		} else if(shiZi.contains("-")) {
			int index = shiZi.indexOf("-");
			String num1 = shiZi.substring(0,index);
			String num2 = shiZi.substring(index + 1);
			return parseInt(num1) - parseInt(num2);
		} else if(shiZi.contains("*")) {
			int index = shiZi.indexOf("*");
			String num1 = shiZi.substring(0,index);
			String num2 = shiZi.substring(index + 1);
			return parseInt(num1) * parseInt(num2);
		} else {//如果前三种不满足肯定是除法
			int index = shiZi.indexOf("/");
			String num1 = shiZi.substring(0,index);
			String num2 = shiZi.substring(index + 1);
			return parseInt(num1) / parseInt(num2);
		}
	}
}
