package com.lattice.state;
/**
 * ����״̬ģʽ
 * @author lattice
 *
 */
public class Action {

	public static void main(String[] args) {
		Context context=new Context(new ConcreteStateA());
		context.request();
	}
	/**
	 * ��������
	   	������ǰ״̬��com.lattice.state.ConcreteStateA
		�������״̬��com.lattice.state.ConcreteStateB
	 */
}
