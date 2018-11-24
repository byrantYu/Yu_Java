package com.igeek.security2;

// 不同的同步代码块  使用相同的锁 ，  也可以完成同步操作 。
public class Ticket implements Runnable {
	int ticket = 100;
	int x = 0;
	Object obj = new Object();

	public void run() {
		while (true) {
			if (x % 2 == 0) {
				//线程 1  ，   线程 2   
				//线程1 拿到锁，依次往下执行 ，直到执行到x++   x=1;
				//线程3.
				//当x为偶数的时候 。
				synchronized (obj) {//new Object();
					if (ticket > 0) {
						String name = Thread.currentThread().getName();
						System.out.println(name + "售出了:" + ticket);
						ticket--;
					}
				}
			} else {//锁 只有1把。
				//线程3...
				//当x为奇数的时候执行这里的代码 。
				synchronized (obj) {//new Ticket();
					if (ticket > 0) {
						String name = Thread.currentThread().getName();
						System.out.println(name + "售出了:" + ticket);
						ticket--;
					}
				}
			}
			//循环的跳出条件。
			if (ticket <= 0) {
				break;
			}
			//x做累加。
			x++;
		}
	}
}
