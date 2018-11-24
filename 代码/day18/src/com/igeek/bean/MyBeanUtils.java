package com.igeek.bean;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

public class MyBeanUtils {

	//��װ��һ��������// ��һ������дObject  ��ʾ�ڵ��÷�����ʱ���һ���������Դ����������� ��
	public static Object populate(Object bean,Map<String,String[]> properties){
		//�Զ���ķ�����
		try {
			BeanUtils.populate(bean, properties);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return bean;
	}
	
	//�ڶ��ַ�װ�ķ�ʽ ��
	/*public static Object populate(Class classType,Map<String,String[]> properties){
		Object bean=null;
		try {
			bean = classType.newInstance();
			BeanUtils.populate(bean, properties);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return bean;
	}*/
	//�����ַ�װ��ʽ ��           User.class  Student.class
	public static <T>T populate(Class<T> classType,Map<String,String[]> properties){
		//���巺������ ��
		T bean = null;
		try {
			bean = classType.newInstance();
			BeanUtils.populate(bean, properties);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return  bean;
	}
	
}
