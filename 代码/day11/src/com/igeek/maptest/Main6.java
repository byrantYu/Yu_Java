package com.igeek.maptest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main6 {

	public static void main(String[] args) {
		//
		List<Integer> list = new ArrayList<Integer>();

		list.add(2);
		list.add(7);
		list.add(6);
		list.add(10);
		list.add(9);

		// 调用方法,将集合转为Object类型数组
		Object[] objArr = list.toArray();
		// Arrays.toString() 将数组再转成字符串 。
		System.out.println(Arrays.toString(objArr));
		//
		Integer i = (Integer) objArr[0];
		// intValue 表示把包装类对象 转换成基本数据类型 。
		System.out.println(i.intValue());

		// 调用方法,将集合转为带类型的数组
		Integer[] intArr = new Integer[10];// null  null  null null  null
		//如果你传入的数组长度 小于集合长度 。 重新生成一个新的数组 。数组的长度跟集合的长度一致 。
		Integer[] returnArr = list.toArray(intArr);

		System.out.println(Arrays.toString(intArr));
		System.out.println(Arrays.toString(returnArr));
		
		Integer it1 = intArr[0];
		System.out.println(it1);
	}

}
