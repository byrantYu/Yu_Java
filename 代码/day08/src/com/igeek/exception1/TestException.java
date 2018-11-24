package com.igeek.exception1;
/**
 * 异常处理的两种方式 
 * 1.抛 
 * 2.处理 
 * 
 * 
 * @author 极客营
 * @Version 1.0 2018年8月29日
 * Company wh.igeekhome.com
 */
public class TestException {

	//.class     
	public static void main(String[] args) {
		//编译时异常。
		//运行时异常。java.lang.ArithmeticException
		//try捕获异常  catch 处理异常 。  
		//在try中放的是可能出现异常的代码。
		//一旦加入了catch之后，当try中的代码出现异常。就会执行catch中的代码。
		try {
			int a=0;
			System.out.println(100/a);
		} catch (Exception e) {
			//e.printStackTrace();
			System.out.println("除数不能为0,SB!!!");
			e.printStackTrace();
			//e.getMessage();
		} finally{
			System.out.println("无论是否产生异常，都会执行finally中的代码。");
		}
		
		//final 跟 finally 的区别。
	}

}
