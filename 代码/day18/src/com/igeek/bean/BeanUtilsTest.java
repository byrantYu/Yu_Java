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
		 user.setUserName("��ķ");
		 user.setPassword("123");
		 user.setAge(20);
	}
	
	@Test
	public void test2() throws Exception{
		User user = new User();
		//��������������ֵ��
		BeanUtils.setProperty(user, "userName", "�ܿˡ�");
		String result = BeanUtils.getProperty(user, "userName");
		String result2 = BeanUtils.getProperty(user, "uid");
		System.out.println(result2);
	}
	
	@Test
	public void test3()throws Exception{
		Map<String,String[]> map = new HashMap<String,String[]>();
		//key һ�� ��ʵ�����е�  field ����  һ�¡�
		map.put("uid", new String []{"u001","u002"});
		map.put("userName", new String[]{"�ܿ�"});
		map.put("hobbies", new String[]{"����","�Ⱦ�","��ͷ"});
		
		User user = new User();
		
		BeanUtils.populate(user,map);
		
		System.out.println(user);
	}
	
	@Test
	public void test4(){
		Map<String,String[]> map = new HashMap<String,String[]>();
		//key һ�� ��ʵ�����е�  field ����  һ�¡�
		map.put("uid", new String []{"u001","u002"});
		map.put("userName", new String[]{"�ܿ�"});
		map.put("hobbies", new String[]{"����","�Ⱦ�","��ͷ"});
		
		//
		User user = MyBeanUtils.populate(User.class, map);
		System.out.println(user);
		//ȥ���Ե����Լ���װ������������
	}
	
	
	
}
