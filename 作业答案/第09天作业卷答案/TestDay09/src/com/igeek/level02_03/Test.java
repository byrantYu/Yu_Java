package com.igeek.level02_03;

import java.util.ArrayList;

/*
		分析以下需求，并用代码实现
		1.定义ArrayList集合，存入多个字符串
		   如:"ab1" "123ad"  "bca" "dadfadf"  "dddaaa"  "你好啊"  "我来啦"  "别跑啊"
		2.遍历集合,删除长度大于5的字符串,打印删除后的集合对象
		
	思路：
		1.遍历集合，拿到每一个字符串
		2.判断字符串长度是否大于5，如果大于5，就删除
		ab1" "123ad"  "bca" "dadfadf"  "dddaaa"  "你好啊"  "我来啦"  "别跑啊"
		                       4
		ab1" "123ad"  "bca"   "dddaaa"  "你好啊"  "我来啦"  "别跑啊"
 */
public class Test {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("ab1");
		list.add("123ad");
		list.add("bca");
		list.add("dadfadf");
		list.add("dddaaa");
		list.add("你好啊");
		list.add("我来啦");
		list.add("别跑啊");
		//遍历集合，拿到每一个字符串
		for(int i = 0; i < list.size(); i++) {
			//拿到每一个字符串
			String str = list.get(i);
			//判断字符串长度是否大于5
			if(str.length() > 5) {
				//如果大于5，就删除
				list.remove(i);
				i--;
			}
		}
		
		//遍历
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}