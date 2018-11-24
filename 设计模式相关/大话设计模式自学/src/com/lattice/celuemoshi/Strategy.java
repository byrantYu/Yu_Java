package com.lattice.celuemoshi;
/**
 * ���Գ�����
 * @author lattice
 *
 */
public abstract class Strategy {
	public abstract void algorithmInterface();
}
/**
 * ���Գ��������࣬ʵ�ֳ��󷽷�
 * @author lattice
 *
 */
class ConcreteStrategyA extends Strategy{
	@Override
	public void algorithmInterface(){
		System.out.println("����Aʵ�ַ���");
	}
}

class ConcreteStrategyB extends Strategy{
	@Override
	public void algorithmInterface(){
		System.out.println("����Bʵ�ַ���");
	}
}

class ConcreteStrategyC extends Strategy{
	@Override
	public void algorithmInterface(){
		System.out.println("����Cʵ�ַ���");
	}
}
