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

		//˫�м��� ��Map   ���ɼ�ֵ�� ����   Key-value 
		//��map������ ��key �Ĵ洢��ʽ  ����set�������洢�� ��(key ֵ�������ظ�������)
		
		//Map map = new HashMap();//����ʱ���ͣ�����ʱ���͡�
		
		//һ��������ʹ��map��ʱ�򣬶���String ������Ϊmap�ļ���
		HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("��ʱ��", "�ν�");
		map.put("�Ƕ���", "������");
		map.put("������", "�����");
		map.put("��ʱ��", "���");
		map.put(null, null);
		//System.out.println(map);
		
		//String str = map.get("��ʱ��");
		//System.out.println(str);
		
		//��α���Map����
		//LinkedHashMap map2= new LinkedHashMap();
		
		//String str = map.get("����");
		//System.out.println(str);
		//foreachMap(map);
		
		//map.remove("��ʱ��");
		
		//�ӿ� ��
		//Collection<String> collection = map.values();
		//System.out.println(collection);
		
		foreachMap2(map);
		//���м��ļ��� map.keySet(); Set 
		//����ֵ�ļ��� map.values(); Collection 
	}
	
	//����map�ĵ�һ�ַ�ʽ ��
	public static void foreachMap(Map map){
		//ע�⣺����map���� ���������ȿ����õ����е�key 
		//keySet�������������е�keyֵ�� ���е�keyʹ��Set �������洢��
		Set set = map.keySet();
		//����ʹ�õ�����������key�ļ��� ��
		Iterator it = set.iterator();
		while(it.hasNext()){
			//ͨ�������� ���õ����е�keyֵ ��
			String key = (String) it.next();
			//System.out.println(key);
			//����keyֵ�����key����Ӧ��valueֵ��
			String value = (String) map.get(key);
			System.out.println("key��:"+key+"\tvalue��:"+value);
		}
	}
	//����map�ĵڶ��ַ�ʽ��
	public static void foreachMap2(Map map){
		Set<Entry<String,String>> set = map.entrySet();
		for (Entry<String,String> sb : set) {
			String key =  sb.getKey();
			String value = sb.getValue();
			System.out.println("key��:"+key+"\tvalue��:"+value);
		}
	}
	//
	//Collection list = new ArrayList();
}
