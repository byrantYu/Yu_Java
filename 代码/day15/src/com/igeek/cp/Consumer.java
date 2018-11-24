package com.igeek.cp;

//消费者 。
public class Consumer implements Runnable {
	
	private Ticket ticket;
	
	public Consumer(){
		
	}
	public Consumer(Ticket ticket){
		this.ticket=ticket;
	}
	
	//消费者 也要操作共享数据 。 Ticket 对象就是共享数据 。
	public void run() {
		// TODO Auto-generated method stub
		//消费者  消费数据 。每次取出一个票。
		while(true){
			//线程第一次进入消费者 。 消费者1 拿到锁。 消费者2。
			synchronized (ticket) {
				//没有数据 就等待。!ticket.flag 就表示没数据 。
				while(!ticket.flag){
					try {
						ticket.wait();//线程1，就进入到等待队列中，并且释放锁。
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				try {
					Thread.sleep(2);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String name = Thread.currentThread().getName();
				System.out.println(name + "消费了 :" + ticket.getNumber());
				ticket.flag=false;//消费完数据了 ，空了 需要再生产数据 。
				// 唤醒生产者 。  
				ticket.notifyAll();
			}
		}
	}

	
}
