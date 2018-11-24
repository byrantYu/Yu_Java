package com.lattice.bridge;

/**
 * ʵ���߳�����
 * @author lattice
 *
 */
public abstract class Implementor {
	public abstract void operation();
}

/**
 * ����ʵ����
 * @author lattice
 *
 */
class ConcreteImplementorA extends Implementor{

	@Override
	public void operation() {
		System.out.println("ִ�о���ʵ��A�Ĳ���");
		
	}
	
}
class ConcreteImplementorB extends Implementor{

	@Override
	public void operation() {
		System.out.println("ִ�о���ʵ��B�Ĳ���");
		
	}
	
}
/**
 * ��������
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