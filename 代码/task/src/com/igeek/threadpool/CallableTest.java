package com.igeek.threadpool;

import java.util.concurrent.Callable;

public class CallableTest implements Callable<String> {

	@Override
	public String call() throws Exception {
		return "¾Í°²¾²°²¾²...";
	}

}
