package com.igeek.liucheng;

public class ForDemo1 {

	public static void main(String[] args) {
		
		//循环结构 ， 在满足特定的条件下，去反复执行某段代码。
		//i=i+5;
		/*for(int i=0;i<10;i+=5){
			
			System.out.println("哈哈");
			if(i==5){
				break;//强制跳出当前循环。
				//System.out.println("阿萨德");
			}
			System.out.println("ABC");
		}*/
		// 1 2 3 4 2 3 4 2 3 4 ...直到2不满足条件，循环要结束了。
		
		//计算1到100所有整数的和。  所有奇数的和 ，所有偶数的和。
		
		//声明一个变量  用来接受结果。
		int even = 0; //偶数 
		int odd = 0; //奇数
		for(int i=1;i<101;i++){
			//sum+=i;//等价于 sum = sum + i ;
			if(i%2==0){
				even+=i;
			}else{
				odd+=i;
			}
		}
		System.out.println("所有的奇数和:"+odd+"所有的偶数和:"+even);
		//System.out.println(i); 不能使用。
	}

}
