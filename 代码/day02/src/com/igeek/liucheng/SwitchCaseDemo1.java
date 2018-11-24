package com.igeek.liucheng;

public class SwitchCaseDemo1 {

	public static void main(String[] args) {
		
		//选择流程控制语句  switch case
		//从键盘上输入一个1-12之间的数 ，判断属于那个月份 。
		
		//什么时候用if  什么时候switch case 呢  。
		//if 主要用来做区间的判断 。   switch case 主要用来对指定的常量值做判断。
		
		/**
		 * switch(变量){
		 * 		case 常量1:
		 * 			要执行的代码;
		 * 		break;
		 * }
		 * 
		 * switch case 中 ， 能够使用那些数据类型 ?
		 * 		byte , short , char, int  
		 * 		String  JDK 1.7 才开始支持String 
		 * 		enum 枚举(凡是可以穷举出来的结果我们都叫做枚举。) java 的关键字  。JDK 1.5 之后才支持。
		 * 
		 * 		JDK 基本都会向下兼容。
		 * 
		 * 	break,continue 有什么区别 ？
		 * 	break 表示跳出  可以用在switch case结构中，也可以用在循环结构中(for , while , do while).
		 * 		break 表示跳出当前循环 (如果多层循环嵌套，break,只会跳出一层循环。)。
		 *  continue 只能用在循环结果中，表示结束本次循环，回到循环头部继续下次循环 。
		 *  
		 *  想要直接从N层循环中全部跳出，可以使用一个关键字 ，return ;
		 */
		
		//long a = 97;
		String haha = "C";
		//String str = "A";
		switch (haha) {
		case "A":
			System.out.println("这个数是1");
			break;
		case "B":
			System.out.println("这个数是2");
			break;
		case "C":
			System.out.println("这个数是3");
			break;
		default://可选的  可以不写。
			System.out.println("如果都不满足，会执行default中的代码。");
			break;
		}
		
		
		
	}

}
