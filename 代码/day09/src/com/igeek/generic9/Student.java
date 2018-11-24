package com.igeek.generic9;

public class Student<T> extends Person<T> {

	@Override
	public void dream(T t) {
		System.out.println("好好学习，天天向上。");
	}

}
