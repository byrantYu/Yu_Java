package com.lattice.prototype;
/**
 * 抽象原型类
 * @author lattice
 *
 */
public abstract class ProtoType {
	private String id;
	public ProtoType(String id){
		this.id=id;
	}
	public String getId(){
		return this.id;
	}
	public abstract ProtoType cloneSelf();
}
/**
 * 具体原型类
 * @author lattice
 *
 */
class ConcreteProtoType extends ProtoType implements Cloneable{
	
	public ConcreteProtoType(String id) {
		super(id);
	}

	public ProtoType cloneSelf(){
		try {
			return (ProtoType) this.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * 实现cloneable接口，并重写clone方法，不然在一个未重写cloneable接口的类对象调用clone方法时会
	 * 报：java.lang.CloneNotSupportedException
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}