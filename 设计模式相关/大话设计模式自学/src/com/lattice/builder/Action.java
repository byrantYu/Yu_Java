package com.lattice.builder;

/**
 * ���Խ�����ģʽ
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
		 * ��������
		  	��Ʒ������
			����1
			����2

		 */
	}

}
