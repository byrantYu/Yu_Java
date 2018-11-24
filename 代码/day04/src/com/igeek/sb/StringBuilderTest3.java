package com.igeek.sb;

public class StringBuilderTest3 {

	public static void main(String[] args) {
		
		long startTime = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder("");
		for(int i = 0;i<50000;i++){
			sb.append(i);
		}
		long resultTime = System.currentTimeMillis()-startTime;
		System.out.println(resultTime);
		//5 5200
		
		StringBuffer sb2 =new StringBuffer("");
		
		//StringBuilder 线程不安全的 。  单线程的情况下。 执行效率要比StringBuffer高一些。
		//StringBuffer 线程安全的。  多线程的情况下使用 。
		
		//程序    
		//进程
		//线程 可以同时 清理垃圾，同时杀毒，同时硬盘检查。
	}

}
