package com.igeek.level02;
/*
 * A在B前面5km，A速度为1km/h，B速度为2km/h，求b多久能赶上a。
 * 
 * 	1.	计算A与B的速度差
	2.	时间 = 路程 / 速度
	3.	输出结果
 */
public class Task02 {
	public static void main(String[] args) {
		// 计算A与B的速度差
		double speed = 2 - 1;
		// 时间 = 路程 / 速度
		double time = 5 / speed;
		// 输出结果
		System.out.println("b " + time + " 小时能赶上a");
	}
}
