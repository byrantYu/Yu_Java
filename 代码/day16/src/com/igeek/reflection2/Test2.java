package com.igeek.reflection2;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//反射的具体使用 。   创建对象的方式  。  
		//1. 直接new   Person p = new Person();
		//2. 匿名对象 。  new Person();
		//3. 全类名的写法 。    com.igeek.test1.Person p = new  com.igeek.test1.Person();
		
		//4. 创建对象的方式 ，通过java反射来创建对象 。
		//通过java反射 来创建类的对象 。
		
		try {
			
			/*Class classType = Class.forName("com.igeek.reflection2.Person");
			Person p = (Person) classType.newInstance();
			p.haha();*/
			Person p = (Person) Class.forName("com.igeek.reflection2.Person").newInstance();
			// 通过java反射来创建对象 。
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
