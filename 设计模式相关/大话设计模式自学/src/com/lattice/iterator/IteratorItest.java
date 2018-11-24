package com.lattice.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @use ���Ե�����ģʽ
 * @author lattice
 *
 */
public class IteratorItest {

	public static void main(String[] args) {
		ConcreteAggregate a=new ConcreteAggregate();
		a.pushItem("����");
		a.pushItem("С��");
		a.pushItem("С��");
		a.pushItem("����");
		a.pushItem("����");
		
		Iterator i=new ConcreteIteractor(a);
		Object item=i.First();
		while(!i.isDone()){
			System.out.println(i.CurrentItem()+"����Ʊ��");
			i.Next();
		}
	}

}
/**
 * ������������
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
 * �ۺϳ�����
 * @author lattice
 *
 */
abstract class Aggregate{
	public abstract Iterator createIterator();
}

/**
 * ������������̳�Iterator
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
 * ����ۼ��࣬�̳�Aggregate
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

