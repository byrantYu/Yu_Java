package com.igeek.baozhuang;

public class Test {

	public static void main(String[] args) {
		//包装类 。
		//数据类型  1.基本数据类型 2.引用数据类型。
		//每个基本数据类型都有他与之对应的引用数据类型，就是包装类。
		/**
		 * byte   Byte
		 * short  Short
		 * int    		Integer
		 * long   Long
		 * float  Float
		 * double  Double
		 * boolean Boolean
		 * char 		Character
		 */
		//包装类中存在很多常用的属性跟方法 。
		
		//装箱 ，拆箱 。
		//装箱:把基本数据类型转换成包装类对象。
		//拆箱:把包装类对象转换成基本数据类型。  
		//JDK1.5 手动的去拆装箱。 JDK1.5之后支持自动拆装箱。
		
		/* byte b1 = 12;
		 
		 Byte b2 = new Byte(b1);  //装箱 。
		 Integer i1 = new Integer(b1);
		 System.out.println(b2.MAX_VALUE);
		 System.out.println(b2.MIN_VALUE);
		 
		 System.out.println(i1.MAX_VALUE);
		 System.out.println(i1.MIN_VALUE);
		 
		 byte b3 = b2.byteValue();//拆箱   。凡是拆箱都是调用xxxxValue方法。
		 int i2 = i1.intValue();// 
*/		 
		 
		 int i = 10;
		 Integer i2 = i; //自动装箱 。 声明包装类对象  = 基本数据类型。
		 Integer i3 = 10;//
		 System.out.println(i2);
		
		 int i4 = i3;//自动拆箱 。 
		 System.out.println(i4);
		 String str = "123a";
		 int result = Integer.parseInt(str);//如何把一个字符串转换成基本数据类型。
		 double result2 = Double.parseDouble(str);
		 float result3 = Float.parseFloat(str);
		 System.out.println(result3);
	}

}
