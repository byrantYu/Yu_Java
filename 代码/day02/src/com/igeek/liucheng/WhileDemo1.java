package com.igeek.liucheng;

public class WhileDemo1 {

	public static void main(String[] args) {
		
		//while 循环 。  
		
		//wihle循环初始化部分在外部
		/*int i = 0;
		int sum = 0;
		while(i<=100){
			sum+=i;
			i++;   //循环体跟迭代部分在一起。
		}
		System.out.println(sum);*/
		
		/*for(;;){
			System.out.println("阿萨德很简单");
		}*/
		
		/*while(true){
			System.out.println("快乐是简单快乐");
		}*/
		int i = 1;
		int sum = 0;
		do {
			sum+=i;//sum=1 
			i++;//i = 2;
		} while (i<2);
		System.out.println(sum);
		//注意 对于do while 循环来讲，无论条件是否满足 ，do中的代码至少会执行1次。
		//10  7 for 3 while.  do while 很少用。
		//switch 
		//break , continue ,return 关键字的区别。
		//break 表示跳出  两种结构  1.循环 2.选择(switch case)  
		//continue 表示终止当前循环，回到循环头部，继续下次循环。  只能用在循环结构中。
		//相同点，后面都不能写代码。没有意思，写了也不会被执行。写代码会报错。
		//return 关键字 表示返回 。作用是直接跳出方法 。return 表示方法的返回值 ，强制跳出方法。
	}

}
