package com.igeek.xiushifu2;

import com.igeek.xiushifu.Test1;

public class TestMain {

	public static void main(String[] args) {
		Test1 t1 = new Test1();
		//在这里 不能访问t1中的protected属性 。只能访问共有属性。
	}

}
