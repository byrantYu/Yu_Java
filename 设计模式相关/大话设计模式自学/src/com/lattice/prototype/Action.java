package com.lattice.prototype;

/**
 * 测试原型模式
 * @author lattice
 *
 */
public class Action {
	public static void main(String[] args) {
		String id="lattice";
		ConcreteProtoType p1=new ConcreteProtoType(id);
		ConcreteProtoType c1= (ConcreteProtoType) p1.cloneSelf();
		System.out.println(c1.getId());
		System.out.println(p1.equals(c1));
		/**
		 * 输出结果：
		  	lattice
			false
		 */
	}
}
