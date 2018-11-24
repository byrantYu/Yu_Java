package com.igeek.data;

public class YinShi {

	public static void main(String[] args) {
		
		/**
		 * 		boolean...排除在外true false ...
		 * 		char 特殊 。1|2
		 * 
		 * 		byte < short < int < long < float < double 
		 * 			 ||
		 * 			char
		 * 		
		 * 特殊的地方  。byte short char 他们三者之间做运算的时候，都会统一的转化成int类型 然后再参与运算。最终的运算结果就是int...
		 */
		
		//隐式数据类型转换  。  从小的数据类型到大的数据类型隐式转换，自动完成
		//当不同的数据类型做运算的时候，小的数据类型，会自动转换成大的数据类型，然后再运算。
		byte b1 = 12;
		int i1 = 3;
		int result = b1+i1;
		System.out.println(result);
		
		short s1 = 3;
		double d1 = 6.14;
		double result2 = s1+d1;//3.0 +6.14
		System.out.println(result2);
		
		
		short s2 = 3;
		int i2 = 3;
		float f2 = 3.0f;
		float result3 = s2+i2+f2;
		System.out.println(result3);
		
		//byte 1   byte b1 = 120 ;
		//short 2  short s1 = b1;
		//int 4
		//long 8
		
		byte bbb=1;
		short sss=1;
		char ccc='A';
		int result4 = bbb+sss+ccc;
		System.out.println(result4);
	}

}
