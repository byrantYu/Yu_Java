package com.lattice.prototype;
/**
 * ����ԭ����
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
 * ����ԭ����
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
	 * ʵ��cloneable�ӿڣ�����дclone��������Ȼ��һ��δ��дcloneable�ӿڵ���������clone����ʱ��
	 * ����java.lang.CloneNotSupportedException
	 */
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}