package com.lattice.bridge;

/**
 * 实现者抽象类
 * @author lattice
 *
 */
public abstract class Implementor {
	public abstract void operation();
}

/**
 * 具体实现者
 * @author lattice
 *
 */
class ConcreteImplementorA extends Implementor{

	@Override
	public void operation() {
		System.out.println("执行具体实现A的操作");
		
	}
	
}
class ConcreteImplementorB extends Implementor{

	@Override
	public void operation() {
		System.out.println("执行具体实现B的操作");
		
	}
	
}
/**
 * 被提炼类
 * @author lattice
 *
 */
class Abstraction{
	protected Implementor implementor;
	public void setImplementor(Implementor implementor){
		this.implementor=implementor;
	}
	public void operation(){
		this.implementor.operation();
	}
}
/**
 * 
 * @author lattice
 *
 */
class RefinedAbstraction extends Abstraction{

	@Override
	public void operation() {
		this.implementor.operation();
	}
	
}