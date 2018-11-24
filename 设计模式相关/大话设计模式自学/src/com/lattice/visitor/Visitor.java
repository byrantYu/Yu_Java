package com.lattice.visitor;

import java.util.ArrayList;
/**
 * ������
 * @author lattice
 *
 */
public abstract class Visitor {
	public abstract void visitConcreteElementA(ConcreteElementA concreteElementA);
	public abstract void visitConcreteElementB(ConcreteElementB concreteElementB);
}
/**
 * ���������
 * @author lattice
 *
 */
class ConcreteVisitorA extends Visitor{

	@Override
	public void visitConcreteElementA(ConcreteElementA concreteElementA) {
		System.out.println(concreteElementA.getClass().getName()
				+"��"+this.getClass().getName()+"����");
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB concreteElementB) {
		System.out.println(concreteElementB.getClass().getName()
				+"��"+this.getClass().getName()+"����");
	}
	
}
/**
 * ���������
 * @author lattice
 *
 */
class ConcreteVisitorB extends Visitor{

	@Override
	public void visitConcreteElementA(ConcreteElementA concreteElementA) {
		System.out.println(concreteElementA.getClass().getName()
				+"��"+this.getClass().getName()+"����");
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB concreteElementB) {
		System.out.println(concreteElementB.getClass().getName()
				+"��"+this.getClass().getName()+"����");
	}
	
	
}
/**
 * ������շ����߳�����
 * @author lattice
 *
 */
abstract class Element{
	public abstract void accept(Visitor visitor);
}
/**
 * ����Ľ��շ�������
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
 * Elenemt�����࣬��ö��elementԪ�أ�����visitor�ṩһ���߲�ӿ���������������������Ԫ��
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











