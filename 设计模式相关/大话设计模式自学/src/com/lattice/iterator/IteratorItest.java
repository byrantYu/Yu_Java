package com.lattice.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @use 测试迭代器模式
 * @author lattice
 *
 */
public class IteratorItest {

	public static void main(String[] args) {
		ConcreteAggregate a=new ConcreteAggregate();
		a.pushItem("大鸟");
		a.pushItem("小菜");
		a.pushItem("小明");
		a.pushItem("老外");
		a.pushItem("格子");
		
		Iterator i=new ConcreteIteractor(a);
		Object item=i.First();
		while(!i.isDone()){
			System.out.println(i.CurrentItem()+"请买票。");
			i.Next();
		}
	}

}
/**
 * 迭代器抽象类
 * @author lattice
 *
 */
abstract class Iterator{
	public abstract Object First();
	public abstract Object Next();
	public abstract boolean isDone();
	public abstract Object CurrentItem();
}
/**
 * 聚合抽象类
 * @author lattice
 *
 */
abstract class Aggregate{
	public abstract Iterator createIterator();
}

/**
 * 具体迭代器，继承Iterator
 * @author lattice
 *
 */
class ConcreteIteractor extends Iterator{
	private ConcreteAggregate  aggregate;
	int currentItem=0;


	public ConcreteIteractor(ConcreteAggregate  aggregate){
		this.aggregate = aggregate;
	}
	@Override
	public Object First() {
		return aggregate.getItem(0);
	}
	@Override
	public Object Next() {
		Object ret=null;
		currentItem++;
		if(currentItem<aggregate.getCount()){
			ret=aggregate.getItem(currentItem);
		}
		return ret;
	}

	@Override
	public boolean isDone() {
		return currentItem>=aggregate.getCount()?true:false;
	}

	@Override
	public Object CurrentItem() {
		return aggregate.getItem(currentItem);
	}
	
}
/**
 * 具体聚集类，继承Aggregate
 * @author lattice
 *
 */
class ConcreteAggregate extends Aggregate{
	private List<Object> item=new ArrayList<Object>();
	@Override
	public Iterator createIterator() {
		
		return new ConcreteIteractor(this);
	}
	public int getCount(){
		return item.size();
	}
	public void pushItem(Object obj){
		this.item.add(obj);
	}
	
	public void setItem(int index,Object obj){
		this.item.remove(index);
		this.item.add(index, obj);
	}
	public Object getItem(int index){
		return item.get(index);
	}

}

