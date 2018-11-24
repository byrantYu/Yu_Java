package com.lattice.command;
/**
 * ²âÊÔÃüÁîÄ£Ê½
 * @author lattice
 *
 */
public class Action {

	public static void main(String[] args) {
		Receiver receiver =new Receiver();
		Command command=new ConcreteCommand(receiver);
		Invoker invoker=new Invoker();
		invoker.setCommand(command);
		invoker.excuteCommand();
	}
}
