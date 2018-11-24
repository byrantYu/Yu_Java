package com.igeek.oop2;

import com.igeek.abstract1.Dog;
import com.igeek.abstract1.Quan;
import com.igeek.abstract1.Wolf;

public class Test1 {

	public static void main(String[] args) {
		//
		Dog dog = new Dog();
		//
		Wolf wolf = new Wolf();
		//那么我们在实际调用方法的时候可以传递子类对象，或者接口实现类对象。
		speak(wolf);
		
		//同样也可以传递完成向上转型的对象。
	}
	//String ...   java.lang.包下的类都不用引包。
	//方法的形式参数 ，声明的时候，需要你传递一个父类对象或者接口对象 。
	public static void speak(Quan quan){
		quan.speak();
	}
}
