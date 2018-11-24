package com.lattice.flyweight;

import java.util.Hashtable;

/**
 * @use ������Ԫģʽ
 * @author lattice
 * @date 2017-01-10
 */
public class FlyWeight {

	public static void main(String[] args) {
		WebsiteFactory websiteFactory=new WebsiteFactory();
		
		Website w1=websiteFactory.getWebsiteFactory("��Ʒչʾ");
		w1.use(new User("С��"));
		
		Website w2=websiteFactory.getWebsiteFactory("��Ʒչʾ");
		w2.use(new User("����"));
		
		Website w3=websiteFactory.getWebsiteFactory("��Ʒչʾ");
		w3.use(new User("����"));
		
		Website w4=websiteFactory.getWebsiteFactory("����");
		w4.use(new User("����ͯ"));
		
		Website w5=websiteFactory.getWebsiteFactory("����");
		w5.use(new User("�ҹ�����"));
		
		Website w6=websiteFactory.getWebsiteFactory("����");
		w6.use(new User("�к�"));
		
		System.out.println("�õ���վ������"+websiteFactory.getWebsiteCount());
	/**
	 * ��� ���
		��վ���ࣺcom.lattice.flyweight.User@6adcc4e2�û�С��
		��վ���ࣺcom.lattice.flyweight.User@4402083d�û�����
		��վ���ࣺcom.lattice.flyweight.User@616affac�û�����
		��վ���ࣺcom.lattice.flyweight.User@37b7a72b�û�����ͯ
		��վ���ࣺcom.lattice.flyweight.User@7a4014a0�û��ҹ�����
		��վ���ࣺcom.lattice.flyweight.User@50a5314�û��к�
		�õ���վ������2
	 */
	}

}
class User{
	private String name;
	public User(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
}

abstract class Website{
	public abstract void use(User user);
}

class ConcreteWebsite extends Website{
	private String name="";
	public ConcreteWebsite(String name){
		this.name=name;
	}
	@Override
	public void use(User user) {
		System.out.println("��վ���ࣺ"+user+"�û�"+user.getName());
	}
	
}
class WebsiteFactory{
	private Hashtable<String, ConcreteWebsite> flyweights=new Hashtable<String, ConcreteWebsite>();
	public Website getWebsiteFactory(String key){
		if(!flyweights.containsKey(key))
			flyweights.put(key, new ConcreteWebsite(key));
			return (Website)flyweights.get(key);
	}
	public int getWebsiteCount(){
		return flyweights.size();
	}
}

