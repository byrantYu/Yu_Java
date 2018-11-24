package com.lattice.celuemoshi;

/**
 * 策略调度类
 * @author lattice
 *
 */
public class Context {
	Strategy strategy;
	public Context(Strategy strategy){
		this.strategy=strategy;
	}
	
	public void ContextInterFace(){
		//根据具体的策略对象，调用其算法的方法
		this.strategy.algorithmInterface();
	}
}
