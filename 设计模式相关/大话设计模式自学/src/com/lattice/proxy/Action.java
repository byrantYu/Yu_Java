package com.lattice.proxy;
/**
 * ��ʾ�������ģʽ
 * @author lattice
 *
 */
public class Action {

	public static void main(String[] args) {
		Peter peter=new Peter();
		peter.attatch();
		//ʹ�ô����࣬��ʾattatch mary
		Lili lili=new Lili(new Mary());//lili help to get attach to Mary
		lili.getAttach();
	}
}
