package com.igeek.interface1;


// 
public class Test {

	public static void main(String[] args) {
	
		Count  count = new ShuiYun();
		//接口同样可以完成多态。
		count.count();
		
		System.out.println(Count.FEI_LV);
		
	}
	/**
	 * 	Count count = new Count(){
			//匿名内部类 。可以实现接口 。
			@Override
			public void count() {
				System.out.println("");
			}
			
		};
	 */
}
