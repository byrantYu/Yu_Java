package com.igeek.oop;

public class FengZhuang {

	private String age;
	
		//首先封装是面向对象的三大特征之一。
		
		//1.指的就是私有属性 ，然后set/get 。
		//2.把实现某段功能的代码，放入到一个方法里面。这个过程我们也叫封装。

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		//此时this就代表了调用者   fz
		this.age = age;
	}

	//传入任意一个参数 来计算1到这个数的和。
	public int getSum(int n){
		//
		int sum = 0;
		sum=(1+n)*n>>1;
		return sum;
	}
}
