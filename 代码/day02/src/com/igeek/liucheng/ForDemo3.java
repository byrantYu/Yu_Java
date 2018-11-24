package com.igeek.liucheng;

public class ForDemo3 {

	public static void main(String[] args) {
		
		//test1();
		//test2(998);
		//test2();
		//test3();
		test4();
	}
	
	public static void test1(){
		//打印1~100之间所有是7的倍数的整数的个数及  
				//总和（体会设置计数器的思想）
				
				int sum = 0;//用来求和。
				int count = 0;//用来计数；
				for (int i = 1; i < 101; i++) {
					if(i%7==0){
						//先求和
						sum+=i;
						count++;//计数器加一  证明有一个奇数了。
					}
					System.out.println(sum);
					System.out.println(count);
				}
	//把输出打印放到循环的外部，打印的是循环的最终结果，放到循环的内部，打印的是循环的过程。
	}
	
	public static void test2(){
		// 100 - 999 
		//水仙花数  。153  个位  十位  百位  。555
		//System.out.println("这个数的百位:" +i/100);
		//System.out.println("这个数的个位:" +i%10);
		//System.out.println("这个数的十位:" +(i/10)%10);
		
		for(int i=100;i<1000;i++){
			int b = i/100;
			int g = i%10;
			int s = (i/10)%10;
			if(b*b*b+g*g*g+s*s*s==i){
				System.out.println(i);
			}
		}
	}
	
	public static void test3(){
		//求200以内所有的质数  。  只能被1和他本身整除的数叫质数。如何被2到自身-1 区间范围内的任意一个数 整除了 ,就不是质数。
		for(int i = 2;i<=200;i++){
			boolean flag = true;//是质数。
			for(int j = 2;j<i;j++){
				//表是被任意一个数整除了。
				if(i%j==0){
					//不是质数，把标志推翻。
					flag=false;
					//break;//一层循环。
					return;//强制跳出方法 。不管你的任何循环。方法都不在执行了。
				}
			}
			// 经过最终的计算  。flag 表示当前循环中的i 的确是一个质数。  直接输出这个i就可以了 。
			if(flag){
				System.out.println(i);
			}
		}
	}
	
	public static void test4(){
		int i = 0;
		do{
			i++;
			if(i==3){
				continue;//continue 表示终止本次循环，回到循环头部继续下次循环。
				
			}
			System.out.println(i);//1 2  3  
		}while(i<5);
	}


}
