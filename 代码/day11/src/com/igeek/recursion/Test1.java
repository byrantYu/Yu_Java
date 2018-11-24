package com.igeek.recursion;

public class Test1 {

	//自己调用自己 。。。
	public static void main(String[] args) {
		int sum = getSum(3);
		System.out.println(sum);
	}
	
	public static int getSum(int sum){
		if(sum==1){
			return sum;
		}
		return sum+getSum(sum-1);
	}

}
