package com.igeek.thread;

//java中类 类不能多继承。

//Runnable  实现接口 。 重写run .
public class Ticket2 implements Runnable {

	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 50; i++) {
			
			System.out.println(Thread.currentThread().getName()+"=="+i);
		}
	}

}
