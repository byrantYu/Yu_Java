package com.igeek.recursion;

public class TestMain {

	static int i = 1;
	public static void main(String[] args) {
		methodA();
	}
	/**  
	* @Title: methodA  
	* @Description: 第一个方法：打印i,i++,再调用其他方法,i++,打印
	*/
	public static void methodA() {
		System.out.println("方法A:"+i);
		i++;
		methodB();
		i++;
		System.out.println("方法A:"+i);
	}
	
	/**  
	* @Title: methodB  
	* @Description: 第二个方法      
	*/
	public static void methodB() {
		System.out.println("方法B:"+i);
		i++;
		methodC();
		i++;
		System.out.println("方法B:"+i);
	}

	/**  
	* @Title: methodC  
	* @Description: 第三个方法      
	*/
	private static void methodC() {
		System.out.println("方法C:"+i);
		i++;
		methodD();
		i++;
		System.out.println("方法C:"+i);
	}

	/**  
	* @Title: methodD  
	* @Description: 第四个方法      
	*/
	private static void methodD() {
		System.out.println("方法D:"+i);
	}
}
