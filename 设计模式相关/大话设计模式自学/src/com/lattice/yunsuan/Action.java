package com.lattice.yunsuan;
/**
 * @use 简单工厂方法及工厂方法模式的加法四则运算测试
 * @author lattice
 * @date 2016-12-20
 */
public class Action {

	public static void main(String[] args) {
		{//简单工厂方法实现加减惩罚运算
			Operation op=null;
			op=OperationSimpleFactory.createOperation("/");
			op.numberA=1;
			op.numberB=2;
			System.out.println("简单工厂方法（switch）:\t"+op.getResult());
		}
		{//工厂方法模式来实现加减乘除四则运算
			IYunsuanFactory fact=new AddFactory();
			Operation op=fact.createOperation();
			op.numberA=10;
			op.numberB=20;
			System.out.println("简单工厂方法模式（接口）:\t"+op.getResult());
			
		}
	}

}
