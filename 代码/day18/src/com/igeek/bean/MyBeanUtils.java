package com.igeek.bean;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;

public class MyBeanUtils {

	//封装第一个方法。// 第一个参数写Object  表示在调用方法的时候第一个参数可以传递任意类型 。
	public static Object populate(Object bean,Map<String,String[]> properties){
		//自定义的方法。
		try {
			BeanUtils.populate(bean, properties);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		return bean;
	}
	
	//第二种封装的方式 。
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
	//第三种封装方式 。           User.class  Student.class
	public static <T>T populate(Class<T> classType,Map<String,String[]> properties){
		//定义泛型类型 。
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
