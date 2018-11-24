package com.igeek.level01;
/*
 * 定义int类型的变量i,初始化值为5.
 * 再定义double类型的变量d ,初始化值为3.14.
 * 将变量i和变量d相加再赋值给另一个short类型的变量s.输出s的值.
 */
public class Task07 {
	public static void main(String[] args) {
		//1.定义变量int i， 值5
		int i = 5;
		//2.定义变量double d， 值 3.14
		double d = 3.14;
		//3.把变量i与变量d中的值相加，5+3.14 = 8.14; 再赋值给另一个short类型的变量s
		
		
		short s = (short)(i + d);//需要进行强制类型转换，因为int类型与double类型计算的结果为double类型。把double类型的数据赋给short类型，需要强制类型转换
		//4.输出s的值
		System.out.println("输出s的值:" + s);
	}
}
