package com.igeek.generic3;

public class GenericTest {
	//单独定义方法泛型的格式 。 在方法的返回值前面加入<> 指定泛型。 
	//也可以指定多个。
	//可以单独定义泛型方法。  
	
	//"123"  v="123"  V = String 
	//Object  Object v
	
	//String  V v 变化的类型。
	public <V>  V set(V a){
		return a;
	}
}
