package com.igeek.thread;
/**
 * 
 * 当多个线程操作共享属性的时候,此时有可能产生线程安全问题  。
 * 
 * 解决方案 。   同步代码块 。语法格式 。
 * 		synchronized(任意的一个对象，都可以充当锁。){
 * 			包裹着可能会产生线程安全问题的代码。
 * 		}
 * 
 * 同步代码块  又叫 对象锁  。
 *
 */
public class Ticket implements Runnable{

	int ticket = 100;

	public void run() {
		// TODO Auto-generated method stub
		while(true){
				
				
					if (ticket > 0) {
						//一个完整的执行单元，被拆分成多个步骤之后。线程安全问题被放大了。
						String name = Thread.currentThread().getName();
						System.out.println(name + "售出了:" + ticket);
						ticket--;
					}
				
			
		}
	}
	
	
}
