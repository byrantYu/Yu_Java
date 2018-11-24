package com.lattice.visitor;

import java.util.ArrayList;
/**
 * 访问者
 * @author lattice
 *
 */
public abstract class Visitor {
	public abstract void visitConcreteElementA(ConcreteElementA concreteElementA);
	public abstract void visitConcreteElementB(ConcreteElementB concreteElementB);
}
/**
 * 具体访问者
 * @author lattice
 *
 */
class ConcreteVisitorA extends Visitor{

	@Override
	public void visitConcreteElementA(ConcreteElementA concreteElementA) {
		System.out.println(concreteElementA.getClass().getName()
				+"被"+this.getClass().getName()+"访问");
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB concreteElementB) {
		System.out.println(concreteElementB.getClass().getName()
				+"被"+this.getClass().getName()+"访问");
	}
	
}
/**
 * 具体访问者
 * @author lattice
 *
 */
class ConcreteVisitorB extends Visitor{

	@Override
	public void visitConcreteElementA(ConcreteElementA concreteElementA) {
		System.out.println(concreteElementA.getClass().getName()
				+"被"+this.getClass().getName()+"访问");
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB concreteElementB) {
		System.out.println(concreteElementB.getClass().getName()
				+"被"+this.getClass().getName()+"访问");
	}
	
	
}
/**
 * 定义接收访问者抽象类
 * @author lattice
 *
 */
abstract class Element{
	public abstract void accept(Visitor visitor);
}
/**
 * 具体的接收访问者类
 * @author lattice
 *
 */
class ConcreteElementA extends Element{

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementA(this);
	}
	public void operationA(){
		
	}
	
}

class ConcreteElementB extends Element{

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementB(this);
	}
	public void operationB(){
		
	}
	
}
/**
 * Elenemt容器类，能枚举element元素，并向visitor提供一个高层接口来访问这个容器里面你的元素
 * @author lattice
 *
 */
class ObjectStructure{
	private ArrayList<Element> elements =new ArrayList<Element>();
	public void attach(Element element){
		elements.add(element);
	}
	public void detach(Element element){
		elements.remove(element);
	}
	public void accept(Visitor visitor){
		for(Element sb:elements){
			sb.accept(visitor);
		}
	}
}











