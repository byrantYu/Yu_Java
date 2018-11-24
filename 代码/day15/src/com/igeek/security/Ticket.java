package com.igeek.security;

/**
 * 
 * 当多个线程操作共享属性的时候,此时有可能产生线程安全问题 。
 * 
 * 解决方案 。 同步代码块 。语法格式 。 synchronized(任意的一个对象，都可以充当锁。){ 包裹着可能会产生线程安全问题的代码。 }
 * 
 * 同步代码块 又叫 对象锁 。
 * 
 * 注意： 使用同步代码块的时候，对于锁对象而言 有个要求 。要求多个线程使用的锁对象，必须是同一个对象。
 * 
 */
public class Ticket implements Runnable {

	int ticket = 100;
	
	//Object obj = new Object();
	public void run() {
			while (true) {

				synchronized (this) {
				if (ticket > 0) {
					// 一个完整的执行单元，被拆分成多个步骤之后。线程安全问题被放大了。
					String name = Thread.currentThread().getName();
					System.out.println(name + "售出了:" + ticket);
					ticket--;
				}
			}
		}
	}

}
