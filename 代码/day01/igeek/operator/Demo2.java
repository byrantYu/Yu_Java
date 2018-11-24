package com.igeek.operator;

public class Demo2 {

	public static void main(String[] args) {
		//赋值运算符。
		//double a = 10;
		//int d = (int) a;
		
		int i = 10; 
		//i+=10;//等价于 i = i+10;   -= *= /= %= 
		i*=3;//i=i*3;
		System.out.println(i);
		
		//== 号表示判断左右两边的值是否相等 。 = 表示赋值。
		int i2 = 20;
		System.out.println(i2>=20); //!= 就是不等于的意思 。
		
		//比较运算符  特点  结果都是boolean类型结果只有true或者false;
		
		boolean flag = "哈哈 " instanceof String; // instance 实例 （对象。）
		//判断左边的对象是否属于右边的类 。
		System.out.println(flag);
	}

}
