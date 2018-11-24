package com.igeek.innerclass;

import com.igeek.innerclass.Out.Inner;

public class MainTest {

	public static void main(String[] args) {
		//anonymous inner class 匿名内部类。
		Niu niu = new Niu(){

			@Override
			public void dream() {
				System.out.println("吃唐僧肉。");
			}

			@Override
			public void play() {
				System.out.println("玉面狐狸。");
			}
			
		};
		
		niu.dream();
		niu.play();
		
		
		//创建内部类对象的方式 。
		Out out = new Out();
		Inner in = out.new Inner();
		in.eat("gaga");
	}

}
