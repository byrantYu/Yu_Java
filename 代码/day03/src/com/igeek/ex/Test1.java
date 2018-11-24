package com.igeek.ex;

import java.util.Scanner;

public class Test1 {
	//从键盘分别输入年、月、日，判断这一天是当年的第几天
	public static void main(String[] args) {
		
		//
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年:");
		int year = sc.nextInt();
		System.out.println("请输入月:");
		int month = sc.nextInt();
		System.out.println("请输入日:");
		int day = sc.nextInt();
		
		//复杂问题简单化  。    1 3 5 7 8 10 12  31       4 6 9 11  30    2 28
		//
		int sum = 0; //用来表示一年中的第几天。
		//校验 你输入的内容是否合法 。  day  50
		switch (month) {
		case 12://11
			sum+=30;
		case 11://10
			sum+=31;
		case 10:
			sum+=30;
		case 9:
			sum+=31;
		case 8:
			sum+=31;
		case 7:
			sum+=30;
		case 6:
			sum+=31;
		case 5:
			sum+=30;
		case 4:
			sum+=31;
		case 3://这个位置最特殊 表示的是二月份 。平年。润年不一样。
			//sum+=28;//28  59   60
			if(year%4==0&&year%100!=0 || year%400==0){
				sum+=29;
			}else{
				sum+=28;
			}
		case 2:// 2
			sum+=31;//sum = 31  1 月整天数。
		case 1:
			//等价于 sum = sum + day ;
			sum+=day;
		}
		
		System.out.println(year+"年"+month+"月"+day+"日:是一年中的第"+sum+"天。");
	}

}
