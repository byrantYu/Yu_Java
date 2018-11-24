package com.igeek.interface1;

//implements 实现的意思    表示 左边的类 ，实现右边的接口 。
// 一旦一个类去实现接口了， 这个类就被称为接口的实现类 。
// 实现类要求，必须实现当前接口中所有的抽象方法。
public class LuYun implements Count {

	@Override
	public void count() {
		System.out.println("陆地运输，统一300块。");
	}

	@Override
	public void count2() {
	}

}
