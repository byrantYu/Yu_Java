package com.lattice.flyweight;

import java.util.Hashtable;

/**
 * @use 测试享元模式
 * @author lattice
 * @date 2017-01-10
 */
public class FlyWeight {

	public static void main(String[] args) {
		WebsiteFactory websiteFactory=new WebsiteFactory();
		
		Website w1=websiteFactory.getWebsiteFactory("产品展示");
		w1.use(new User("小菜"));
		
		Website w2=websiteFactory.getWebsiteFactory("产品展示");
		w2.use(new User("大鸟"));
		
		Website w3=websiteFactory.getWebsiteFactory("产品展示");
		w3.use(new User("娇娇"));
		
		Website w4=websiteFactory.getWebsiteFactory("博客");
		w4.use(new User("老顽童"));
		
		Website w5=websiteFactory.getWebsiteFactory("博客");
		w5.use(new User("桃谷六仙"));
		
		Website w6=websiteFactory.getWebsiteFactory("博客");
		w6.use(new User("男孩"));
		
		System.out.println("得到网站总数："+websiteFactory.getWebsiteCount());
	/**
	 * 输出 结果
		网站分类：com.lattice.flyweight.User@6adcc4e2用户小菜
		网站分类：com.lattice.flyweight.User@4402083d用户大鸟
		网站分类：com.lattice.flyweight.User@616affac用户娇娇
		网站分类：com.lattice.flyweight.User@37b7a72b用户老顽童
		网站分类：com.lattice.flyweight.User@7a4014a0用户桃谷六仙
		网站分类：com.lattice.flyweight.User@50a5314用户男孩
		得到网站总数：2
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
		System.out.println("网站分类："+user+"用户"+user.getName());
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

