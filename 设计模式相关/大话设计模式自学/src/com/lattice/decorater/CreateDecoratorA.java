package com.lattice.decorater;
/**
 * 装饰者创建
 * @author lattice
 *
 */
public class CreateDecoratorA extends Decorator {
	@Override
	public void Operation(){
		super.Operation();
		System.out.println("具体装饰对A的操作！");
	}
}

class CreateDecoratorB extends Decorator {
	@Override
	public void Operation(){
		super.Operation();
		System.out.println("具体装饰对A的操作！");
		this.addedBeheive();
	}
	private void addedBeheive(){
		System.out.println("自定义私有方法");
	}
}