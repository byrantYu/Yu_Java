package com.lattice.decorater;
/**
 * 组件
 * @author lattice
 *
 */
public abstract class Component {
	public abstract void Operation();
}

/**
 * 通过创建多个组件抽象类子类来实现同样方式调度不同方法
 * @author lattice
 *
 */
class ConcreteComponent extends Component{
	@Override
	public void Operation(){
		System.out.println("集体的对象操作！");
	}
}