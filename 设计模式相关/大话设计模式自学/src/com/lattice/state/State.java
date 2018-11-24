package com.lattice.state;

/**
 * ����״̬��
 * @author lattice
 *
 */
public abstract class State {
	public abstract void handle(Context context);
}

class ConcreteStateA extends State{

	@Override
	public void handle(Context context) {
		context.setState(new ConcreteStateB());
	}
	 
}
class ConcreteStateB extends State{

	@Override
	public void handle(Context context) {
		context.setState(new ConcreteStateA());
		
	}
	 
}

/**
 * ״̬��ά����
 * @author lattice
 *
 */
class Context{
	private State state;
	public Context(State state){
		this.state=state;
	}
	public void setState(State state){
		this.state=state;
		
	}
	public State getState(){
		return this.state;
	}
	public void request(){
		System.out.println("������ǰ״̬��"+this.state.getClass().getName());
		this.state.handle(this);
		System.out.println("�������״̬��"+this.state.getClass().getName());
	}
}

