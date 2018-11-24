package com.lattice.chainofrespon;

/**
 * @use 测试职责链模式
 * @author lattice
 * @date 2017-01-09
 */
public abstract class Handler {
	protected Handler successor;
	public void setSuccoessor(Handler successor){
		this.successor=successor;
	}
	public abstract void handleRequest(int request);
}

class ConcreteHandler1 extends Handler{

	@Override
	public void handleRequest(int request) {
		if(request>=0 &&request < 10){
			System.out.println(this.getClass().getName()+"处理请求"+request);
		}
		else if(successor != null){
			successor.handleRequest(request);
		}
		
	}
	
}

class ConcreteHandler2 extends Handler{

	@Override
	public void handleRequest(int request) {
		if(request>=10 &&request < 20){
			System.out.println(this.getClass().getName()+"处理请求"+request);
		}
		else if(successor != null){
			successor.handleRequest(request);
		}
	}
	
}


class ConcreteHandler3 extends Handler{

	@Override
	public void handleRequest(int request) {
		if(request>=20 &&request < 30){
			System.out.println(this.getClass().getName()+"处理请求"+request);
		}
		else if(successor != null){
			successor.handleRequest(request);
		}
	}
	
}

