package com.lattice.bridge;

/**
 * �����Ž�ģʽ
 * @author lattice
 *
 */
public class Action {

	public static void main(String[] args) {
		Abstraction ab=new RefinedAbstraction();
		ab.setImplementor(new ConcreteImplementorA());
		ab.operation();
		
		ab.setImplementor(new ConcreteImplementorB());
		ab.operation();
	}

}
