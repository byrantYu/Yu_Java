package com.igeek.security4;



public class Ticket implements Runnable{
	static int ticket = 100;//类变量 。
	int x = 0;//实例变量。
	//Object obj = new Object();
	public void run() {
		while (true) {
			if (x % 2 == 0) {
				//线程 1  ，   线程 2   
				//线程1 拿到锁，依次往下执行 ，直到执行到x++   x=1;
				//线程3.
				//当x为偶数的时候 。
				synchronized (Ticket.class) {//new Object();
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

	//this 非静态方法使用的锁 。 
	//静态方法 使用的锁  不是this , 而是当前类的字节码 。  类名.class
	//Ticket.class 这是 静态方法使用的锁。
	public static synchronized void get(){
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
