package com.lattice.command;

/**
 * ���������
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
 * ����������
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
 * ��������ִ����
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
 * �����������󣬲������������
 * @author lattice
 *
 */
class Receiver {
	public void action() {
		System.out.println("ִ������");
	}
}