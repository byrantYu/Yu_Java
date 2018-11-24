package com.lattice.state;
/**
 * 测试状态模式
 * @author lattice
 *
 */
public class Action {

	public static void main(String[] args) {
		Context context=new Context(new ConcreteStateA());
		context.request();
	}
	/**
	 * 输出结果：
	   	请求处理前状态：com.lattice.state.ConcreteStateA
		请求处理后状态：com.lattice.state.ConcreteStateB
	 */
}
