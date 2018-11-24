package com.lattice.yunsuan;
/**
 * @use 简单工厂方法实现计算加减乘除
 * @author lattice
 * @date 2016-12-20
 */
public class OperationSimpleFactory {
	public static Operation createOperation(String oprate){
		
		Operation operation=null;
		switch(oprate){
			case "+":	operation = new OprationAdd();	break;
			case "-":	operation = new OprationSub();	break;
			case "*":	operation = new OprationMul();	break;
			case "/":	operation = new OprationDiv();	break;
			default:return null;
		}
		return operation;
	}
}
