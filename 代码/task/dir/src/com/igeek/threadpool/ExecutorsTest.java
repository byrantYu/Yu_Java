package com.igeek.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;

public class ExecutorsTest {

	@Test
	public void test(){
		
		ExecutorService es = Executors.newFixedThreadPool(3);
		
		Ticket task = new Ticket();
		
		es.submit(task);
		es.submit(task);
		es.submit(task);
		es.submit(task);
		es.submit(task);
		es.submit(task);
		es.submit(task);
		
	}
}
