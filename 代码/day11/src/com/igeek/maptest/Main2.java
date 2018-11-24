package com.igeek.maptest;

import java.util.LinkedHashMap;

public class Main2 {

	public static void main(String[] args) {
		//
		LinkedHashMap lhm = new LinkedHashMap();
		
		//方法跟hashMap中的类似 。
		lhm.put("智多星", "哈哈");
		lhm.put(null,null);
		lhm.put("水浒传", "呵呵");
		//
		System.out.println(lhm.toString());
	}

}
