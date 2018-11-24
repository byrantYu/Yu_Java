package com.igeek.oop;

public class PhoneTest {

	public static void main(String[] args) {
		//创建(声明)对象。
		Phone huaWei = new Phone();
		
		huaWei.brand="华为荣耀10";
		huaWei.price=998;
		huaWei.color="黑色";
		
		String name = "周杰伦";
		huaWei.call(name);
		System.out.println(name);
		huaWei.sendMessage();
		
	}

}
