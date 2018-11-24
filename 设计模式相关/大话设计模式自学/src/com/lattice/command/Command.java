package com.lattice.command;

/**
 * 命令抽象类
 * @author lattice
 *
 */
public abstract class Command {
	protected Receiver receiver;

	public Command(Receiver receiver) {
		this.receiver = receiver;
	}

	public abstract void excute();
}

/**
 * 具体命令类
 * @author lattice
 *
 */
class ConcreteCommand extends Command {
	public ConcreteCommand(Receiver receiver) {
		super(receiver);
	}

	public void excute() {
		receiver.action();
	}
}
/**
 * 命令请求执行类
 * @author lattice
 *
 */
class Invoker {
	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void excuteCommand() {
		command.excute();
	}
}
/**
 * 接收命令请求，并作出处理的类
 * @author lattice
 *
 */
class Receiver {
	public void action() {
		System.out.println("执行请求！");
	}
}