package com.lattice.decorater;
/**
 * ���
 * @author lattice
 *
 */
public abstract class Component {
	public abstract void Operation();
}

/**
 * ͨ������������������������ʵ��ͬ����ʽ���Ȳ�ͬ����
 * @author lattice
 *
 */
class ConcreteComponent extends Component{
	@Override
	public void Operation(){
		System.out.println("����Ķ��������");
	}
}