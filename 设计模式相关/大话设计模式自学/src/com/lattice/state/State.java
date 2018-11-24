package com.lattice.state;

/**
 * 抽象状态类
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
 * 状态类维护类
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
		System.out.println("请求处理前状态："+this.state.getClass().getName());
		this.state.handle(this);
		System.out.println("请求处理后状态："+this.state.getClass().getName());
	}
}

