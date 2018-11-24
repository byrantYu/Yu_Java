package com.igeek.data;

public class QiangZhi {

	public static void main(String[] args) {

		/**
		 * 强制类型转换 。
		 * 
		 *  byte,short,char  int  long  float  double ...
		 *  
		 *  小的数据类型，转换成大的数据类型，隐式转换，自动完成的 。
		 *  
		 *  大的数据类型，转换成小的数据类型 ，强制转换，需要你手动的去指定。格式如下：
		 *  	目标类型  变量名称  = (目标类型)原始变量 ;
		 *  	long a = 10;
				int b = (int) a;
		 */
		
		//int a = 10;
		//long b = a;//隐式转换 。
		
		long a = 10;
		int b = (int) a;//强制转换 。需要加入(你要转换的类型。)
		//强制转换可能会带来问题，精度的降低或者数据的丢失 。
		
		int i = 100;
		byte b2 = (byte)i;// 可以装下的时候没有任何问题。
		System.out.println(b2);
		
		float f1 = 1231233.1415926123654F; //float 类型表示单精度 。有效位数8
		System.out.println(f1);
		
		double d1 = 1231233.1415926123654;//double 表示双精度。
		System.out.println(d1);
		
		float f2 =(float) d1;
		System.out.println(f2);
	}

}
