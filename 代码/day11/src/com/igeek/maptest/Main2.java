package com.igeek.maptest;

import java.util.LinkedHashMap;

public class Main2 {

	public static void main(String[] args) {
		//
		LinkedHashMap lhm = new LinkedHashMap();
		
		//������hashMap�е����� ��
		lhm.put("�Ƕ���", "����");
		lhm.put(null,null);
		lhm.put("ˮ䰴�", "�Ǻ�");
		//
		System.out.println(lhm.toString());
	}

}
