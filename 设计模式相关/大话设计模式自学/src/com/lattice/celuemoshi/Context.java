package com.lattice.celuemoshi;

/**
 * ���Ե�����
 * @author lattice
 *
 */
public class Context {
	Strategy strategy;
	public Context(Strategy strategy){
		this.strategy=strategy;
	}
	
	public void ContextInterFace(){
		//���ݾ���Ĳ��Զ��󣬵������㷨�ķ���
		this.strategy.algorithmInterface();
	}
}
