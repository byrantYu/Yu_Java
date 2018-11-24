package com.igeek.security3;

public class Ticket implements Runnable{
	int ticket = 100;
	int x = 0;
	//Object obj = new Object();
	public void run() {
		while (true) {
			if (x % 2 == 0) {
				//线程 1  ，   线程 2   
				//线程1 拿到锁，依次往下执行 ，直到执行到x++   x=1;
				//线程3.
				//当x为偶数的时候 。
				synchronized (this) {//new Object();
					if (ticket > 0) {
						String name = Thread.currentThread().getName();
						System.out.println(name + "售出了:" + ticket);
						ticket--;
					}
				}
			} else {//锁 只有1把。
				get();
			}
			//循环的跳出条件。
			if (ticket <= 0) {
				break;
			}
			//x做累加。
			x++;
		}
	}

	//同步的 。  可以用来修饰方法。synchronized 注意：重点 当你使用同步非静态方法的时候 ，锁对象是this...
	public synchronized void get(){
		//锁对象就是this...
		//synchronized(this){
		if (ticket > 0) {
			String name = Thread.currentThread().getName();
			System.out.println(name + "售出了:" + ticket);
			ticket--;
		}
		//}
	}
}
