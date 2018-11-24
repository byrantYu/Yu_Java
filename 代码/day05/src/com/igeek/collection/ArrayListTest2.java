package com.igeek.collection;

import java.util.ArrayList;

import com.igeek.objarr.Phone;

//继承  
//在java中默认所有类的父类都是object 类 。  
//有了继承关系之后 ，子类会继承父类中所有的属性跟方法 。(注意：私有属性跟方法不能被子类调用。)
public class ArrayListTest2 {
	/**
	 * 
	 * java中  对于8种基本数据类型而言  都有他们自己的包装类 。
	 * 			把基本数据类型也变成对象了 。
	 * 
	 * byte  包装类就是  Byte
	 * short  		 Short 
	 * int           		Integer
	 * long 		 Long
	 * 
	 * char          		Character
	 * boolean 		 Boolean
	 * float         Float
	 * double		 Double
	 * 
	 */
	public static void main(String[] args) {
		//泛型  作用是用来约束   集合中的数据类型 。<String>  只能放string类型。
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(123);
		list.add(456);
		list.add(789);
		
		//list.remove(0);
		//list.set(0, 888);
		//System.out.println(list);
		
		//对象.length  数组 
		//对象.length()   字符串
		//对象.size()   集合
		for (int i = 0; i < list.size(); i++) {
			Integer in = list.get(i);
			System.out.println(in);
		}
	}

}
