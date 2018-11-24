package com.igeek.array;

public class ArrayTest3 {
	
	/**
	 * 
	 * 数组中的属性都有默认值  。
	 * 		整数     0   byte short  int long 
	 * 		浮点     0.0   float double 
	 * 		布尔     false  
	 * 		字符型   ' ' 
	 * 		
	 * 		
	 * 		所有引用数据类型默认值都是null，对象的默认值都是null.
	 */
	public static void main(String[] args) {
		int [] arrays = new int[5];  //5 表示数组的长度。 数组中元素的个数。
		arrays[0]=10;
		arrays[1]=11;
		arrays[2]=12;
		arrays[3]=13;
		arrays[4]=14;
		
		/*for(int i=0;i<arrays.length;i++){
			System.out.println(arrays[i]);
		}*/
		
		int [] arrays2 = new int[5];
		arrays[0]=10;
		arrays[1]=11;
		arrays[2]=12;
		arrays[3]=13;
		arrays[4]=14;
		
		//  == 号 是干什么的？？？   比较左右两边的值是否相等。
		//  ==号equals()方法 ... 
		//   ==  对于基本数据类型   ==号  比较的是左右两边的值 是否相等 。
		//   ==  对于引用数据类型   ==号   比较的是对象的内存地址。(堆中的位置。)
		System.out.println(arrays==arrays2);
		
		int a = 10 ;
		int b = 20 ;
		System.out.println(a==b);
		
	}

}
