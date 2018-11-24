package com.igeek.collection1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Vector;

import org.junit.Test;

public class HashSetTest {
	@Test
	public void test8(){
		//无序，不重复。
		//HashSet 在调用add方法存数据的时候。 其实会调用对象的.equals方法。
		HashSet<Person> hs = new HashSet<Person>();
		Person tom = new Person("汤姆",10);
		Person jack = new Person("汤姆",10);
		hs.add(tom);//0x1234
		hs.add(jack);//0x7890
		
		//HashSet 标准就是通过两个对象equals   jack.equals(tom) 如果这个值为true的时候。
		System.out.println(hs.size());//问集合中装了几个元素 ？？？注意：当前Person类，没有重写equals方法，hashCode也每重写
		
	}
	
	@Test
	public void test7(){
		//JDK 1.0   
		Vector v = new Vector();
		v.add("123");
		v.add("456");
		
		//ArrayList 效率要高于  Vector ...
		System.out.println(8888888%101);
	}
	@Test
	public void test6(){

		/*String str1 = "1";
		String str2 = "1";
		String str3 = new String("1");  
		System.out.println(str1==str2);//true
		System.out.println(str1==str3);//false
*/		
		//intern()  。。。  方法的作用 。假如出现字符串拼接了 。
		//如果不调用intern，拼接之后的结果，如果常量池中存在，也会拼接一个新的出来。
		String str1 = "ABC";
		String str2 = "EFG";
		String str4 = "ABCEFG";
		String str3 = (str1+str2).intern();
		System.out.println(str3==str4);//
		
	}
	
	//需求 ，想判断两个对象是否相等 ，只要看他们的属性是否相等 就可以了，而不看对象的内存地址。   需要重写equals方法 。
	//注意：一旦重写了类的equals方法 就必须重写 与之对应的hashCode方法 。
	@Test
	public void test5(){
		ArrayList<Person> list2 = new ArrayList<Person>();
		
		list2.add(new Person("杰克",10));//new Person("杰克",10)
		list2.add(new Person("丹妮",20));
		list2.add(new Person("马克思",30));
		
		boolean b = list2.contains(new Person("杰克",10));//new Person("杰克",10)
		System.out.println(b); //Object
	}
	
	@Test
	public void test4(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("jack");
		list.add("rose");
		list.add("danni");
		//String 类中重写了 Object的equals方法，主要作用是  循环对比 每一个字符是否相等。
		//"jack".equals("每一个元素"); 如果发现值相同  就返回下标 。
		boolean b = list.contains("jack");
		System.out.println(b);
	}
	@Test
	public void test3(){
		//ArrayList ...  
		
		// ==  equals 方法的区别 ？？
		Person  tom = new Person();//tom = 0x2121
		Person jack = new Person();//jack = 0x3344
		System.out.println(tom.equals(jack));
	}
	@Test
	public void test2(){
		/**
		 * 求一个字符串"aiodjl;hriWFUADJSVUEHiowfjnivowe"
		 * 中一共有几个不重复的字母
		 * ,区分大小写,如a,A算两个字符
		 */
		HashSet<Character> set = new HashSet<Character>();
		
		String str = "aiodjl;hriWFUADJSVUEHiowfjnivowe";
		char [] chars = str.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			char c = chars[i];
			if(c>='a'&&c<='z'||c>='A'&&c<='Z'){
				set.add(c);
			}
		}
		
		System.out.println(set.size());
		
	}

	@Test
	public void test1(){
		//Set 接口  。  又叫Set集合 。 
		//  1. 不允许重复 。 2.无序 
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("ABC");
		hs.add("ABC2");
		hs.add("ABC3");
		//hs.add("ABC");
		hs.add("ABC4");
		hs.add("ABC5");
		
		//hs.remove("ABC");
		
		System.out.println(hs);
		
		//想要遍历 。Set 集合 。
		
		/*Person p = new Person();
		Person p1 = new Person();//1144748369
		System.out.println(p.hashCode());//1598924227
		System.out.println(1598924227%5);
		System.out.println(p1.hashCode());
		System.out.println(1144748369%5);*/
		System.out.println("ABC3".hashCode());
	}
}
