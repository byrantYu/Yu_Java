package com.igeek.array;

public class ArrayTest {
	/**
	 * 
	 * 1.基本数据类型。
	 * 
	 * 2.引用数据类型。 (对象。)
	 * 	[ ]
	 */
	public static void main(String[] args) {
		//数组的声明方式 。 
		//方式1  数组中的数据类型   []  数组名称 ；(推荐方式。) 
		//方式2 数组中的数据类型  数组名称  [];(不推荐。)
		
		//int [] arrays1;
		//arrays1[0]=1;
		//数组的赋值方式 。1.
		//创建数组的动态方式 。
		int [] arrays = new int[5];  //5 表示数组的长度。 数组中元素的个数。
		/*arrays[0]=10;
		arrays[1]=11;
		arrays[2]=12;
		arrays[3]=13;
		arrays[4]=14;*/
		//arrays[5]=15;  ArrayIndexOutOfBoundsException  超过数组的下标 会产生异常。
		
		//静态创建方式 。静态初始化方式 。
		String [] strs = {"ABC","DEF","GHI","123"}; 
		
		String [] strs2 = new String[3];
		strs2[0]="123";
		strs2[1]="456";
		strs2[2]="789";
		
		//获取数组中的单一数据  ，通过     数组名称[下标值]    来或者指定元素。
		System.out.println(strs2[2]);
		
		//如何获得数组的长度    数组名称.length    如何获得字符串长度 。    字符串名称.length();   带小括号的就是方法。
		System.out.println(strs.length);
		
		
		
		/*int i=0;   注意：变量跟数组一样，必须先初始化才能使用。
		System.out.println(i);*/
		
		for(int i = 0;i < strs.length;i++){
			//print 只打印不换行   println  打印并换行。
			System.out.print(strs[i]+"\t");
		}
		
		{
			int x = 10;
		}
		
	}

}
