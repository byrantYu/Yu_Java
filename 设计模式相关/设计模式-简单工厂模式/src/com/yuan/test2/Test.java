package com.yuan.test2;

import java.util.Scanner;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字A--");
		int numA = sc.nextInt();
		System.out.println("请输入数字B");
		int numB = sc.nextInt();
		System.out.println("请输入+ - * /");
		String operate = sc.next();
		/**
		 * 这样一来不管是控制台输入的内容，还是web或者是手机我们都可以通过以上方法来完成计算(提高了复用性)。
		 * 当我们需要修改+法的时候需要干嘛？只需要修改Jia类中重写之后的方法即可(提高了可维护性)。
		 * 当我们需要增加各种复杂运算，开平方根。立方根。正余弦等如何做？
		 * 只需要增加相应的运算子类即可，还要修改工厂类，在switch中增加相应的case代码块。(容易扩展且灵活性好)
		 */
		Operation1 op1=null;
		op1=OperationFactory.getOperation1(operate);
		double d1=op1.getResult(numA, numB);
		System.out.println("最终的结果是:"+d1);
	}

}
