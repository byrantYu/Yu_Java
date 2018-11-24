package com.igeek.threadpool;

// concurrent  并发包 。
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.igeek.thread.Ticket;

public class MainTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		//线程池 。
		ExecutorService threadPool = Executors.newFixedThreadPool(3);
		Runnable task = new Ticket();
		//向线程池提交执行任务 。  
	/*	threadPool.submit(task);
		threadPool.submit(task);
		threadPool.submit(task);
		
		threadPool.submit(task);
		threadPool.submit(task);
		threadPool.submit(task);*/
		
		Callable<String> call = new CallableTest();
		//向线程池 提交任务  。第二种方式 。传递 Callable 接口的对象 。Future<String> 类型 。  future 对象可以拿到线程方法的返回值 。
		Future<String> future = threadPool.submit(call);
		String result = future.get();
		System.out.println(result);
		
		//线程池的使用 。
		threadPool.shutdown();
	}

}
