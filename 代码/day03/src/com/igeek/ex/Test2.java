package com.igeek.ex;

public class Test2 {

	//省略 if else 括号之后的用法 。
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 3)
				break;
				System.out.println("呵呵");// 注意：使用if判断可以省略大括号。 你的执行语句只有一行的时候，可以省略
			//else
				System.out.println("哈哈"); // .
			System.out.println(i);
		}
	}

}
