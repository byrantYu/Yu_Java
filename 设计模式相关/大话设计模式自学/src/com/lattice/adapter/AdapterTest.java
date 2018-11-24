package com.lattice.adapter;
/**
 * @use ����������ģʽ
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
		System.out.println("һ��Ҫ��");
	}
}
class Adaptee{
	public void say(){
		System.out.println("����Ҫ��");
	}
}
class Adapter extends Target{
	Adaptee adp=new Adaptee();
	@Override
	public void say(){
		adp.say();
	}
}
