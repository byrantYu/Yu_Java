package com.lattice.mediator;

/**
 * 中介类
 * @author lattice
 *
 */
public abstract class Mediator {
	public abstract void send(String message,Colleage colleage);
}
/**
 * 具体中介类
 * @author lattice
 *
 */
class ConcreteMediator extends Mediator{
	private ConcreteColleage1 colleage1;
	private ConcreteColleage2 colleage2;
	public void setColleage1(ConcreteColleage1 colleage1){
		this.colleage1=colleage1;
	}
	
	public void setColleage2(ConcreteColleage2 colleage2){
		this.colleage2=colleage2;
	}
	
	@Override
	public void send(String message, Colleage colleage) {
		System.out.println(message);
		if(colleage==colleage1){
			colleage2.nodify(message);
		}
		else{
			colleage1.nodify(message);
		}
	}
	
}
/**
 * 同事类
 * @author lattice
 *
 */
abstract class Colleage{
	protected Mediator mediator;
	public Colleage(Mediator mediator){
		this.mediator=mediator;
	}
}
/**
 * 同事1，继承同事类
 * @author lattice
 *
 */
class ConcreteColleage1 extends Colleage{

	public ConcreteColleage1(Mediator mediator) {
		super(mediator);
	}
	public void send(String message){
		mediator.send(message, this);
	}
	public void nodify(String message){
		System.out.println("同事1得到消息："+message);
	}
}
/**
 * 同事2，继承同事类
 * @author lattice
 *
 */
class ConcreteColleage2 extends Colleage{

	public ConcreteColleage2(Mediator mediator) {
		super(mediator);
	}
	public void send(String message){
		mediator.send(message, this);
	}
	public void nodify(String message){
		System.out.println("同事2得到消息："+message);
	}
}