package com.igeek.oop;

public class PhoneTest2 {
	public static void main(String[] args) {
		//创建(声明)对象。
		Phone huaWei = new Phone();
		
		huaWei.brand="华为荣耀10";
		huaWei.price=998;
		huaWei.color="黑色";
		
		//根据对象内存地址进行赋值  。 注意：这种赋值方式.  意思就是两个对象是同一个对象。
		Phone huaWei2 = huaWei;
		
		huaWei2.brand="山寨苹果XX";
		huaWei2.price=8888;
		huaWei2.color="土豪金";
		
		System.out.println(huaWei.brand+huaWei.price+huaWei.color);
		System.out.println(huaWei2.brand+huaWei2.price+huaWei2.color);
		
		
		System.out.println(huaWei);//直接打印对象显示的是对象的内存地址。
		System.out.println(huaWei2);
		
		System.out.println(huaWei instanceof Phone);
		
	}
}
