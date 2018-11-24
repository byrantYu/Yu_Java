package com.igeek.liucheng;

public class IfDemo1 {

	public static void main(String[] args) {
		
		//起始三元运算就是简化版的if else ...
		
		/*System.out.println(a);
		int a = 10;*/
		
		/**
		 * if else 的三种用法 。
		 * 
		 *   当你需要的结果只有一种情况的时候，单个的if(满足条件){执行大括号中的内容。}
		 *   
		 *   if(){
		 *   	满足条件执行这个大括号中的代码。
		 *   }else{
		 *   	如果if()中的表达式结果为false ，执行这里的代码。
		 *   }
		 *   
		 *   对与多条件的判断 。
		 *   if(条件1){
		 *   
		 *   }else if(条件2){
		 *   
		 *   }else if(条件3){
		 *   
		 *   }else if(条件n){ 
		 *   
		 *   }else{
		 *   
		 *   }
		 */
		boolean flag = false;
		if(flag){
			System.out.println("我吃了。");
		}
		System.out.println("哈哈");
	}

}
