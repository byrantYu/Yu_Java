package com.lattice.builder;

/**
 * 测试建造者模式
 * @author lattice
 *
 */
public class Action {

	public static void main(String[] args) {
		ConcreteBuilderA cBuilder=new ConcreteBuilderA();
		Director.directBuilder(cBuilder);
		Product product=cBuilder.getResult(); 
		product.show();
		
		/**
		 * 输出结果：
		  	产品创建：
			部件1
			部件2

		 */
	}

}
