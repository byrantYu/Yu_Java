package com.lattice.builder;

import java.util.ArrayList;
import java.util.List;

/**
 * 需要建造的产品类
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
		System.out.println("产品创建：");
		for (String part : parts) {
			System.out.println(part);
		}
	}
}

/**
 * 建造者抽象类
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
 * 具体建造者抽象类A
 * 
 * @author lattice
 * 
 */
class ConcreteBuilderB extends Builder {
	private Product product = new Product();

	@Override
	public void buildPartA() {
		product.addPart("部件A");

	}

	@Override
	public void buildPartB() {
		product.addPart("部件B");

	}

	@Override
	public Product getResult() {
		return this.product;
	}

}

/**
 * 具体建造者抽象类B
 * 
 * @author lattice
 * 
 */
class ConcreteBuilderA extends Builder {
	private Product product = new Product();

	@Override
	public void buildPartA() {
		product.addPart("部件1");

	}

	@Override
	public void buildPartB() {
		product.addPart("部件2");

	}

	@Override
	public Product getResult() {
		return this.product;
	}

}
/**
 * 建造者智慧类
 * @author lattice
 *
 */
class Director {
	public static void directBuilder(Builder builder) {
		builder.buildPartA();
		builder.buildPartB();
	}
}
