package com.lattice.proxy;

/**
 * @use 代理模式，为了解决Peter想通过Lili来找Maria和Mary玩。
 * @author lattice
 * @dete 2016-12-28
 */
public interface Person {
	public void attatch();
}

class Peter implements Person {
	@Override
	public void attatch() {
		System.out.println("this is Peter.I want "+
					"to get attached to Mary or Maria.Can you help me?");

	}
}

class Lili implements Person {// 代理类
	Person person;

	Lili(Person person) {
		this.person = person;
		System.out.println("Yes ,I'll help you,Peter,don't warry.");
	}

	public void getAttach() {
		person.attatch();
	}

	@Override
	public void attatch() {
		person.attatch();

	}
}

class Mary implements Person {// 其他实现类
	@Override
	public void attatch() {
		System.out.println("this is Mary,hi,Peter.");
		String str="111";

	}
}

class Maria implements Person {// 其他实现类
	@Override
	public void attatch() {
		System.out.println("this is Meria,hi,Peter.");

	}
}