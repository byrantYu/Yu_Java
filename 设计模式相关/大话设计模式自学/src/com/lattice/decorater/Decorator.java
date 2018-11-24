package com.lattice.decorater;
/**
 * װ����ʵ���������
 * @author lattice
 *
 */
public abstract class Decorator extends Component {
	protected Component component;
	public void setComponent(Component component){
		this.component=component;
	}
	@Override
	public void Operation(){
		if(this.component!=null){
			component.Operation();
		}
	}
}
