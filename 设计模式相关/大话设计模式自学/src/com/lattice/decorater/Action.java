package com.lattice.decorater;

/**
 * 装饰者模式演示，
 * @author lattice
 *
 */
public class Action {

	public static void main(String[] args) {
		ConcreteComponent c=new ConcreteComponent();
		CreateDecoratorA d1=new CreateDecoratorA();
		CreateDecoratorB d2=new CreateDecoratorB();
		d1.setComponent(c);
		d2.setComponent(c);
		d2.Operation();
	}

}
