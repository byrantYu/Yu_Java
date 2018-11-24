package com.igeek.maptest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main3 {

	public static void main(String[] args) {
		
		//操作数组 。工具类  Arrays 
		int [] a = {1,2,45,7653,32,123,0};
		Arrays.sort(a);
		Arrays.binarySearch(a, 2);
		//Arrays.toString() 主要用来将数组 转换成字符串输出 。
		System.out.println(Arrays.toString(a));
		
		
		//操作集合 。 工具类  Collections
		ArrayList<String> list = new ArrayList<String>();
		
		Collections.addAll(list,"李小花","王大锤","张全蛋");
		
		System.out.println(list);
		
		//计算一个数的和 。
		
		int sum = test(10,20);
		System.out.println(sum);
		
		int [] arrs = {10,20};
		int sum2 = test1(arrs);
		System.out.println(sum2);
	}

	//方法的可变参数 。JDK 1.5之后才被支持的。
	//注意 可变参数 不能写到前面 。除非只需要传一个可变参数 。
	// 注意 。可变参数 会被当做数组 来处理 。 有了可变参数之后，我们对于参数不确定的情况下 ，不用去反复定义多个重载的方法 。
	public static int test(int ... haha){
		int sum = 0;
		for (int i = 0; i < haha.length; i++) {
			sum+=haha[i];
		}
		return sum;
	}
	//int ... haha  等价于   int [] haha  一样的。
	public static int test1(int [] haha){
		int sum = 0;
		for (int i = 0; i < haha.length; i++) {
			sum+=haha[i];
		}
		return sum;
	}
	/*
	 * 对于参数个数不确定的情况下，这种重载的写法 比较复杂 。 jdk 1.5之后 推荐使用可变参数 。
	 * public static int sum(int a){
		int sum = 0;
		sum+=a;
		return sum;
	}
	public static int sum(int a,int b){
		int sum =0 ;
		sum+=a;
		sum+=b;
		return sum;
	}*/
}
