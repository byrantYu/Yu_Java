package com.lattice.proxy;
/**
 * 演示人物代理模式
 * @author lattice
 *
 */
public class Action {

	public static void main(String[] args) {
		Peter peter=new Peter();
		peter.attatch();
		//使用代理类，演示attatch mary
		Lili lili=new Lili(new Mary());//lili help to get attach to Mary
		lili.getAttach();
	}
}
