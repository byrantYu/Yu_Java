package com.igeek.obj;

public class Test3 {

	public static void main(String[] args) {
		String [] books = {"金瓶梅","那些事儿","哈哈"};
		test(10,books);
	}
	
	//统一当做数组来看待。
	public static void test(int a,String...books){
		
		//System.out.println();
		System.out.println(a);
		for (int i = 0; i < books.length; i++) {
			System.out.println(books[i]);
		}
	}

}
