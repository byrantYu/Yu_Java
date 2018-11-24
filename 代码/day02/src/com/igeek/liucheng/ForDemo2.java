package com.igeek.liucheng;

public class ForDemo2 {

	public static void main(String[] args) {
		//从1循环到150并在每行打印一个值，另外在每个3的倍数行上打印出“foo”,在每个5的倍数行上打印“biz”,在每个7的倍数行上打印输出“baz”。
		for(int i=1;i<=150;i++){
			if(i%3==0&i%5==0&i%7==0){
				System.out.println(i+"foo biz baz");
			}
			if(i%3==0&i%5==0){
				System.out.println(i+"foo biz");
			}
			if(i%3==0&i%7==0){
				System.out.println(i+"foo baz");
			}
			if(i%7==0&i%5==0){
				System.out.println(i+"baz biz");
			}
			if(i%3==0){
				System.out.println(i+"foo");
			}
			if(i%5==0){
				System.out.println(i+"biz");
			}
			if(i%7==0){
				System.out.println(i+"baz");
			}else{
				System.out.println(i);
			}
			
			
			/**
			 * if(i%3==0&i%5==0&i%7==0){
				System.out.println(i+"foo biz baz");
			}else if(i%3==0&i%5==0){
				System.out.println(i+"foo biz");
			}else if(i%3==0&i%7==0){
				System.out.println(i+"foo baz");
			}else if(i%7==0&i%5==0){
				System.out.println(i+"baz biz");
			}else if(i%3==0){
				System.out.println(i+"foo");
			}else if(i%5==0){
				System.out.println(i+"biz");
			}else if(i%7==0){
				System.out.println(i+"baz");
			}else{
				System.out.println(i);
			}
			 */
			
		}
	}

}
