package com.lattice.celuemoshi;
/**
 * @����ģʽʵ��
 * 	����ģʽ����������װ�㷨�ģ���һϵ�е��㷨��װ��Strategy�����������������У�
 * ��Context�����Ʋ�ͬ�㷨�ĵ���
 * @author lattice
 * @date 2016-12-21
 */
public class Action {

	public static void main(String[] args) {
		Context context;
		context=new Context(new ConcreteStrategyA());
		context.ContextInterFace();
		context=new Context(new ConcreteStrategyB());
		context.ContextInterFace();
		context=new Context(new ConcreteStrategyC());
		context.ContextInterFace();

	}
}
