package com.igeek.recursion;

public class TestMain2 {
	static int i = 1;
	public static void main(String[] args) {
		method();
	}
	/**
	 * StackOverflowError
	 *   栈内存溢出 。    所以递归次数不宜过多 。
	 */
	public static void method() {
		System.out.println("方法开始:"+i);
		
		//如果i已经加到4了,就将method方法结束
		if(i==100000) {
			return;
		}
		
		i++;
		method();
		i++;
		System.out.println("方法结束:"+i);
	}

}
