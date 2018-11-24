package com.yuan.test1;

import java.util.Scanner;

import org.junit.Test;

//Operation 运算类
public class Operation {
	
	//写一个获得结果的方法。
	//numberA 数字A  numberB 数字B  operate 表示要操作的运算符
	public static double getResult(int numA,int numB,String operate){
		double result=0.0;
		switch (operate) {
		case "+":
			result = numA + numB;
			System.out.println(result);
			break;
		case "-":
			result = numA - numB;
			System.out.println(result);
			break;
		case "*":
			result = numA * numB;
			System.out.println(result);
			break;
		case "/":
			if (numB != 0) {
				result = numA / numB;
				System.out.println(result);
			} else {
				System.out.println("0不能作为除数！");
			}
			break;
		}
		return result;
	}
	
	@Test
	public  void test(){
		getResult(10,20,"+");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字A--");
		int numA = sc.nextInt();
		System.out.println("请输入数字B");
		int numB = sc.nextInt();
		System.out.println("请输入+ - * /");
		String str = sc.next();
		double b1=getResult(numA,numB,str);
		System.out.println("结果是:"+b1);
	}
	/**
	 * 次步骤为业务的封装。
	 * 让业务逻辑(算法)与界面逻辑(控制台)分离,降低他们的耦合度。只有分离开才能达到已于扩展的目的。
	 * 此时还谈不上完全面向对象，因为只用了封装，还没有使用继承以及多态。
	 * 
	 *现在又有需求让你计算%取模之后的结果呢？
	 *可能会说改一下Operation类即可，在switch 中添加一个case分支就可以了。
	 *那么问题又来了？只是单纯的让你去添加一个取模，却要让其他的代码都来参与编译，如果不小心改错了把+号中的+改成
	 *-了那么问题就大了。
	 *
	 *如果让你去维护你们公司的薪资管理系统。
	 *如果原来只有技术人员(月薪),市场销售人员(底薪+提成),经理(年薪+股份)三种运算。现在要增加兼职工作人员(时薪)
	 *如果按照当前程序写法，需要你添加一个时薪却要把原来三种算法的算法类给你。如果你心里不平衡,在技术人员类中加入。
	 *if(员工是XXX){
	 *	salary*=1.1;
	 *}	 
	 *那么你的工资是不是加了10%呢，这样你是要付法律责任的哦！！！
	 *此时应该考虑加减乘除等都要分离出去。这就要涉及到继承以及多态了。
	 *那么请看test2包中的修改结果！
	 **/
}
