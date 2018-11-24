package com.igeek.generic;

//generic 泛型的意思 。
/**
 * 一般我们在类的声明位置 。 <> 来定义泛型。 
 * 	E T V K 
 *  
 *  <E1,E2...> 泛型可以指定无数个 。多个泛型之间使用，间隔
 *  
 *  在使用泛型的时候，要么全都不用。 要用就要全部指定所有泛型。
 * 
 * @author 极客营
 * @Version 1.0 2018年8月31日
 * Company wh.igeekhome.com
 */
public class GenericTest<K,V> {
	
	//给类添加的泛型，可以作用在方法的形式参数上。
	public void add(K e){
		System.out.println("添加了:"+e);
	}
	
	//当不确定传入的参数的具体类型的时候。
	public void remove(V i){
		
	}
}
