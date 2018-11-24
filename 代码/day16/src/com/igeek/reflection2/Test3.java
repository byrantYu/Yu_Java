package com.igeek.reflection2;

import java.lang.reflect.Field;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//通过java反射来调用当前类中的属性 。跟方法。
		try {
			Class classType = Class.forName("com.igeek.reflection2.Person");
			//通过反射对象 来获得当前类中的 属性 。  只能获得共有的 。
			Field field = classType.getField("name");
			//给属性进行赋值 。 需要传入两个参数 。obj 表示给那个对象的name属性进行赋值 。value 就是你要赋予的值 。
			Person tom = new Person();
			field.set(tom, "汤姆斯。");//对象.方法  。    方法.对象 。
			String name = (String) field.get(tom);
			System.out.println(name);
			
			//最简单的方式 。
			//Person jack = new Person("杰克",20);
			
			//通过java反射 获得私有属性 。//getDeclaredField 表示获得当前类中声明的属性 。忽视访问权限修饰符 。
			Field dream = classType.getDeclaredField("dream");
			//设置当前属性的访问权限为true ...
			dream.setAccessible(true);
			dream.set(tom, "赚钱，泡妞。");
			String d = (String) dream.get(tom);
			System.out.println(d);  //通过java反射来操作当前类中的私有属性 。
			
			//一般不推荐使用java反射来操作类中私有属性。 而是推荐使用  set/get 来操作私有属性 。
			
			//System.out.println(field);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
