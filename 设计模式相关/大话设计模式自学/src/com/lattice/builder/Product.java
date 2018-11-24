package com.lattice.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * ��Ҫ����Ĳ�Ʒ��
 * 
 * @author lattice
 * 
 */
public class Product {
	List<String> parts = new ArrayList<String>();

	public void addPart(String part) {
		parts.add(part);
	}

	public void show() {
		System.out.println("��Ʒ������");
		for (String part : parts) {
			System.out.println(part);
		}
	}
}

/**
 * �����߳�����
 * 
 * @author lattice
 * 
 */
abstract class Builder {
	public abstract void buildPartA();

	public abstract void buildPartB();

	public abstract Product getResult();
}

/**
 * ���彨���߳�����A
 * 
 * @author lattice
 * 
 */
class ConcreteBuilderB extends Builder {
	private Product product = new Product();

	@Override
	public void buildPartA() {
		product.addPart("����A");

	}

	@Override
	public void buildPartB() {
		product.addPart("����B");

	}

	@Override
	public Product getResult() {
		return this.product;
	}

}

/**
 * ���彨���߳�����B
 * 
 * @author lattice
 * 
 */
class ConcreteBuilderA extends Builder {
	private Product product = new Product();

	@Override
	public void buildPartA() {
		product.addPart("����1");

	}

	@Override
	public void buildPartB() {
		product.addPart("����2");

	}

	@Override
	public Product getResult() {
		return this.product;
	}

}
/**
 * �������ǻ���
 * @author lattice
 *
 */
class Director {
	public static void directBuilder(Builder builder) {
		builder.buildPartA();
		builder.buildPartB();
	}
}
