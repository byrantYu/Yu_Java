package com.igeek.maptest;

import java.util.Arrays;
import java.util.List;

public class Main5 {

	public static void main(String[] args) {
		
		
		//
		List<String> list = Arrays.asList("tom","jack","rose");
		
		//Arrays.asList 可以向集合中添加数据 。
		
		//注意 ：返回值  list 对象  不能做新增和删除操作。
		list.add("trump");
		//UnsupportedOperationException 不支持的操作异常 。
		System.out.println(list);
	}

}
