package com.igeek.liucheng;

public class FlagForDemo1 {

	public static void main(String[] args) {
		
		//标号  语句  就是用在循环上面 ，必须写到循环头部，相当于一个标记 。指定跳出的位置 。break...
		search:
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 100; j++) {
					if(j==3){
						break search;
					}
					System.out.println(i+"====="+j);
				}
			}
	}

}
