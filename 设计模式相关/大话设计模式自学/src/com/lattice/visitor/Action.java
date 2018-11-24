package com.lattice.visitor;

/**
 * @use 访问者模式
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
		 * 输出结果
		com.lattice.visitor.ConcreteElementA被com.lattice.visitor.ConcreteVisitorA访问
		com.lattice.visitor.ConcreteElementB被com.lattice.visitor.ConcreteVisitorA访问
		****************
		com.lattice.visitor.ConcreteElementA被com.lattice.visitor.ConcreteVisitorB访问
		com.lattice.visitor.ConcreteElementB被com.lattice.visitor.ConcreteVisitorB访问

		 */
	}

}
