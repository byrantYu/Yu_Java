package com.igeek.thread2;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//线程生命周期的状态 。
		// 1. 新建状态      线程对象创建好了 。
		// 2. 可运行状态     start()
		// 3. 阻塞/等待  状态 
		// 4. 运行状态 
		// 5. 死亡状态
		
		//给当前线程设置  优先级  。
		Thread t1 = new Thread(new Ticket("t1"));
		//
		t1.setPriority(1);
		//开启线程 
		
		
		
		Thread t2 = new Thread(new Ticket("t2"));
		t2.setPriority(10);
		
		
		Thread t3 = new Thread(new Ticket("t3"));
		t3.setPriority(10);
		//setPriority 可以设置  线程的优先级  。  1-10  线程的优先级越高，抢到执行权的概率越大。  默认的执行权都是5.
		t1.start();
		t3.start();
		t2.start();
		
		
		/*t2.yield();*/   //谁调用，谁就会放弃当前的CPU执行权 ，让其他线程参与进来，跟他一起重新争抢 。 此时谁抢到谁执行。
		
		/*for (int i = 0; i < 50; i++) {
			//线程优先级   默认是5  
			Thread thread = Thread.currentThread();
			thread.setName("主线程");
			thread.setPriority(1);
			if(i==5){
				try {
					//当调用join 方法的时候 ，当前线程会放弃 执行权 。交给t1 来执行 。
					//直到t1执行完毕 ，才会执行主线程中的代码 。
					t1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(thread.getName()+i);
		}*/
		
		//join() 当调用join方法之后 ，此时谁调用 谁就会执行完毕，直到执行完毕之后，才会执行接下来的线程。
	}

}
