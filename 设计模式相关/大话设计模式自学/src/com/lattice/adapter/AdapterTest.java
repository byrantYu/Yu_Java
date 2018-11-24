package com.lattice.adapter;
/**
 * @use 测试适配器模式
 * @author lattice
 * @date 2017-01-03
 */
public class AdapterTest {

	public static void main(String[] args) {
		Target tar=new Adapter();
		tar.say();

	}

}

class Target{
	public void say(){
		System.out.println("一般要求");
	}
}
class Adaptee{
	public void say(){
		System.out.println("特殊要求");
	}
}
class Adapter extends Target{
	Adaptee adp=new Adaptee();
	@Override
	public void say(){
		adp.say();
	}
}
