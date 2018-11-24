package com.igeek.bean;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.junit.Test;

public class BeanUtilsTest {

	@Test
	public void test1(){
		 User user = new User();
		 user.setUid("u001");
		 user.setUserName("汤姆");
		 user.setPassword("123");
		 user.setAge(20);
	}
	
	@Test
	public void test2() throws Exception{
		User user = new User();
		//给对象设置属性值。
		BeanUtils.setProperty(user, "userName", "杰克。");
		String result = BeanUtils.getProperty(user, "userName");
		String result2 = BeanUtils.getProperty(user, "uid");
		System.out.println(result2);
	}
	
	@Test
	public void test3()throws Exception{
		Map<String,String[]> map = new HashMap<String,String[]>();
		//key 一般 跟实体类中的  field 属性  一致。
		map.put("uid", new String []{"u001","u002"});
		map.put("userName", new String[]{"杰克"});
		map.put("hobbies", new String[]{"抽烟","喝酒","烫头"});
		
		User user = new User();
		
		BeanUtils.populate(user,map);
		
		System.out.println(user);
	}
	
	@Test
	public void test4(){
		Map<String,String[]> map = new HashMap<String,String[]>();
		//key 一般 跟实体类中的  field 属性  一致。
		map.put("uid", new String []{"u001","u002"});
		map.put("userName", new String[]{"杰克"});
		map.put("hobbies", new String[]{"抽烟","喝酒","烫头"});
		
		//
		User user = MyBeanUtils.populate(User.class, map);
		System.out.println(user);
		//去尝试调用自己封装的两个方法。
	}
	
	
	
}
