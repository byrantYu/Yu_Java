package com.igeek.level01_01;

import java.util.ArrayList;

/*
 * 完成如下需求：
   1.定义一个只能存储字符串的集合对象；
   2.向集合内添加以下数据：“孙悟空”、“猪八戒”、“沙和尚”、“铁扇公主”
   3.不用遍历，直接打印集合；
   4.获取第4个元素（注意，是--第4个元素，它的索引是？）
   5.打印一下集合大小；
   6.删除元素“铁扇公主”
   7.删除第3个元素（注意：是--第3个元素）
   8.将元素“猪八戒”改为“猪悟能”
   9.再次打印集合；
 */
public class MainApp {
	public static void main(String[] args) {
		// 1.定义一个只能存储字符串的集合对象；
		ArrayList<String> list =new ArrayList<String>();
		// 2.向集合内添加以下数据：“孙悟空”、“猪八戒”、“沙和尚”、“铁扇公主”
		list.add("孙悟空");
		list.add("猪八戒");
		list.add("沙和尚");
		list.add("铁扇公主");
		// 3.不用遍历，直接打印集合；
		System.out.println(list);
		// 4.获取第4个元素（注意，是--第4个元素，它的索引是？）
		String ele = list.get(3);
		System.out.println("获取第4个元素:" + ele);
		// 5.打印一下集合大小；
		int size = list.size();
		System.out.println("集合大小:" + size);
		// 6.删除元素“铁扇公主”
		list.remove("铁扇公主");
		// 7.删除第3个元素（注意：是--第3个元素）
		list.remove(2);
		// 8.将元素“猪八戒”改为“猪悟能”
		for (int i = 0; i < list.size(); i++) {
			if ("猪八戒".equals(list.get(i))) {
				//“猪八戒”改为“猪悟能”
				list.set(i, "猪悟能");
			}
		}
		// 9.再次打印集合；
		System.out.println(list);
	}
}
