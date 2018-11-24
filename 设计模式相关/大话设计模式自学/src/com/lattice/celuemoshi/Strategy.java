package com.lattice.celuemoshi;
/**
 * 策略抽象类
 * @author lattice
 *
 */
public abstract class Strategy {
	public abstract void algorithmInterface();
}
/**
 * 策略抽象类子类，实现抽象方法
 * @author lattice
 *
 */
class ConcreteStrategyA extends Strategy{
	@Override
	public void algorithmInterface(){
		System.out.println("策略A实现方法");
	}
}

class ConcreteStrategyB extends Strategy{
	@Override
	public void algorithmInterface(){
		System.out.println("策略B实现方法");
	}
}

class ConcreteStrategyC extends Strategy{
	@Override
	public void algorithmInterface(){
		System.out.println("策略C实现方法");
	}
}
