package com.lattice.celuemoshi;
/**
 * @策略模式实现
 * 	策略模式就是用来封装算法的，把一系列的算法封装到Strategy抽象类衍生的子类中，
 * 用Context来控制不同算法的调用
 * @author lattice
 * @date 2016-12-21
 */
public class Action {

	public static void main(String[] args) {
		Context context;
		context=new Context(new ConcreteStrategyA());
		context.ContextInterFace();
		context=new Context(new ConcreteStrategyB());
		context.ContextInterFace();
		context=new Context(new ConcreteStrategyC());
		context.ContextInterFace();

	}
}
