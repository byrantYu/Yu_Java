package com.yuan.test2;

public class OperationFactory {
	///������
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
			System.out.println("��������ȷ�������!");
			break;
		}
		return op;
	}
}
