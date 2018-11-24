package com.yuan.test2;

public class OperationFactory {
	///工厂类
	public static Operation1 getOperation1(String operate){
		Operation1 op=null;
		switch (operate) {
		case "+":
			op=new Jia();
			break;
		case "-":
			op=new Jian();
			break;
		case "*":
			op=new Cheng();
			break;
		case "/":
			op=new Chu();
			break;
		default:
			System.out.println("请输入正确的运算符!");
			break;
		}
		return op;
	}
}
