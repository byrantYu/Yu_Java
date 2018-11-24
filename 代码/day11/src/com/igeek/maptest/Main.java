package com.igeek.maptest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		//双列集合 。Map   是由键值对 构成   Key-value 
		//在map集合中 。key 的存储方式  是用set集合来存储的 。(key 值不允许重复，无序)
		
		//Map map = new HashMap();//编译时类型，运行时类型。
		
		//一般我们在使用map的时候，都将String 类型作为map的键。
		HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("及时雨", "宋江");
		map.put("智多星", "刘俊生");
		map.put("青面兽", "杨丰智");
		map.put("及时雨", "戢浪");
		map.put(null, null);
		//System.out.println(map);
		
		//String str = map.get("及时雨");
		//System.out.println(str);
		
		//如何遍历Map集合
		//LinkedHashMap map2= new LinkedHashMap();
		
		//String str = map.get("哈哈");
		//System.out.println(str);
		//foreachMap(map);
		
		//map.remove("及时雨");
		
		//接口 。
		//Collection<String> collection = map.values();
		//System.out.println(collection);
		
		foreachMap2(map);
		//所有键的集合 map.keySet(); Set 
		//所有值的集合 map.values(); Collection 
	}
	
	//遍历map的第一种方式 。
	public static void foreachMap(Map map){
		//注意：遍历map集合 。我们首先可以拿到所有的key 
		//keySet方法，返回所有的key值， 所有的key使用Set 集合来存储。
		Set set = map.keySet();
		//可以使用迭代器来遍历key的集合 。
		Iterator it = set.iterator();
		while(it.hasNext()){
			//通过迭代器 ，拿到所有的key值 。
			String key = (String) it.next();
			//System.out.println(key);
			//根据key值，获得key所对应的value值。
			String value = (String) map.get(key);
			System.out.println("key是:"+key+"\tvalue是:"+value);
		}
	}
	//遍历map的第二种方式。
	public static void foreachMap2(Map map){
		Set<Entry<String,String>> set = map.entrySet();
		for (Entry<String,String> sb : set) {
			String key =  sb.getKey();
			String value = sb.getValue();
			System.out.println("key是:"+key+"\tvalue是:"+value);
		}
	}
	//
	//Collection list = new ArrayList();
}
