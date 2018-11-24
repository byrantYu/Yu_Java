package com.lattice.component;

import java.util.ArrayList;

/**
 * @use 测试组合模式
 * @author lattice
 * @date 2017-01-03
 */
public class CompositeTest {

	public static void main(String[] args) {
		Composite root=new Composite("root");
		root.add(new Leaf("leaf A"));

		Composite comp=new Composite("composite A");
		comp.add(new Leaf("leaf A of composite A"));
		comp.add(new Leaf("leaf B of composite A"));
		
		root.add(comp);
		
		root.add(new Leaf("leaf B"));
		root.display(1);
		
		/**
		 * 输出结果
		 *  
		    -root
			---leaf A
			---composite A
			-----leaf A of composite A
			-----leaf B of composite A
			---leaf B

		 */
	}
}

abstract class Component {
	protected String name;

	public Component(String name) {
		this.name = name;
	}

	public String getString(String str, int number) {
		String result = "";
		for (int i = 0; i < number; i++) {
			result += str;
		}
		return result;
	}

	public abstract void add(Component c);

	public abstract void remove(Component c);

	public abstract void display(int depth);
}

class Leaf extends Component {
	public Leaf(String name) {
		super(name);
	}

	public void add(Component c) {
		System.out.println("connot add to a leaf");
	}

	public void remove(Component c) {
		System.out.println("connot remove from a leaf");
	}

	public void display(int depth) {
		System.out.println(getString("-", depth) + name);
	}
}

class Composite extends Component {
	private ArrayList<Component> childrens = new ArrayList<Component>();
	public Composite(String name) {
		super(name);
	}

	public void add(Component c) {
		childrens.add(c);
	}

	public void remove(Component c) {
		childrens.remove(c);
	}

	public void display(int depth) {
		System.out.println(getString("-", depth) + name);
		for(Component sb:childrens){
			sb.display(depth+2);
		}
	}
}