package com.lattice.visitor;

/**
 * @use ������ģʽ
 * @author lattice
 * @date 2017-01-10
 */
public class Action {

	public static void main(String[] args) {
		ObjectStructure o =new ObjectStructure();
		o.attach(new ConcreteElementA());
		o.attach(new ConcreteElementB());
		
		ConcreteVisitorA visitA=new ConcreteVisitorA();
		ConcreteVisitorB visitB=new ConcreteVisitorB();
		
		o.accept(visitA);
		System.out.println("****************");
		o.accept(visitB);
		
		/**
		 * ������
		com.lattice.visitor.ConcreteElementA��com.lattice.visitor.ConcreteVisitorA����
		com.lattice.visitor.ConcreteElementB��com.lattice.visitor.ConcreteVisitorA����
		****************
		com.lattice.visitor.ConcreteElementA��com.lattice.visitor.ConcreteVisitorB����
		com.lattice.visitor.ConcreteElementB��com.lattice.visitor.ConcreteVisitorB����

		 */
	}

}
