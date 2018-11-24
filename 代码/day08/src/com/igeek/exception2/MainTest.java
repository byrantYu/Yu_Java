package com.igeek.exception2;

import java.util.Scanner;

public class MainTest {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("请输入你的rank分:");
		int  rank = sc.nextInt();
		CaiException cai= null;
		if(rank<2000){
			 cai = new CaiException("垃圾...");
		}
		
		try{
			throw cai; //throw 关键字  表示自定一的异常 。
		}catch(Exception e){
			e.printStackTrace();
		}*/
		test();
		//throw   ,  throws  ,try catch 有啥区别？
		//throw 声明一个自定义异常。异常类可以是自己定义的。NullPointerException
		//throws 表示抛出异常，一般写在方法的小括号跟大括号之间。谁调用谁处理。
		//try catch 表示捕获并处理异常。
	}

	public static void test(){
		throw new NullPointerException("空指针了 。。。");
	}
}
