package com.lattice.decorater;
/**
 * װ���ߴ���
 * @author lattice
 *
 */
public class CreateDecoratorA extends Decorator {
	@Override
	public void Operation(){
		super.Operation();
		System.out.println("����װ�ζ�A�Ĳ�����");
	}
}

class CreateDecoratorB extends Decorator {
	@Override
	public void Operation(){
		super.Operation();
		System.out.println("����װ�ζ�A�Ĳ�����");
		this.addedBeheive();
	}
	private void addedBeheive(){
		System.out.println("�Զ���˽�з���");
	}
}