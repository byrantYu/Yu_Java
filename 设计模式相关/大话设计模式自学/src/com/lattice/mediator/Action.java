package com.lattice.mediator;
/**
 * @use 测试中介者模式
 * @author lattice
 * @date 2017-01-09
 */
public class Action {

	public static void main(String[] args) {
		ConcreteMediator mediator=new ConcreteMediator();
		ConcreteColleage1 colleage1=new ConcreteColleage1(mediator);
		ConcreteColleage2 colleage2=new ConcreteColleage2(mediator);
		mediator.setColleage1(colleage1);
		mediator.setColleage2(colleage2);
		colleage1.send("你好啊！");
		System.out.println("*****************");
		colleage2.send("你好，很高兴认识你！");
		
		/**
		 * 输出结果：
		 * 
			你好啊！
			同事2得到消息：你好啊！
			*****************
			你好，很高兴认识你！
			同事1得到消息：你好，很高兴认识你！
		 */
	}

}
