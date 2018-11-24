package com.igeek.collection1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Vector;

import org.junit.Test;

public class HashSetTest {
	@Test
	public void test8(){
		//���򣬲��ظ���
		//HashSet �ڵ���add���������ݵ�ʱ�� ��ʵ����ö����.equals������
		HashSet<Person> hs = new HashSet<Person>();
		Person tom = new Person("��ķ",10);
		Person jack = new Person("��ķ",10);
		hs.add(tom);//0x1234
		hs.add(jack);//0x7890
		
		//HashSet ��׼����ͨ����������equals   jack.equals(tom) ������ֵΪtrue��ʱ��
		System.out.println(hs.size());//�ʼ�����װ�˼���Ԫ�� ������ע�⣺��ǰPerson�࣬û����дequals������hashCodeҲÿ��д
		
	}
	
	@Test
	public void test7(){
		//JDK 1.0   
		Vector v = new Vector();
		v.add("123");
		v.add("456");
		
		//ArrayList Ч��Ҫ����  Vector ...
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
		//intern()  ������  ���������� ����������ַ���ƴ���� ��
		//���������intern��ƴ��֮��Ľ��������������д��ڣ�Ҳ��ƴ��һ���µĳ�����
		String str1 = "ABC";
		String str2 = "EFG";
		String str4 = "ABCEFG";
		String str3 = (str1+str2).intern();
		System.out.println(str3==str4);//
		
	}
	
	//���� �����ж����������Ƿ���� ��ֻҪ�����ǵ������Ƿ���� �Ϳ����ˣ�������������ڴ��ַ��   ��Ҫ��дequals���� ��
	//ע�⣺һ����д�����equals���� �ͱ�����д ��֮��Ӧ��hashCode���� ��
	@Test
	public void test5(){
		ArrayList<Person> list2 = new ArrayList<Person>();
		
		list2.add(new Person("�ܿ�",10));//new Person("�ܿ�",10)
		list2.add(new Person("����",20));
		list2.add(new Person("���˼",30));
		
		boolean b = list2.contains(new Person("�ܿ�",10));//new Person("�ܿ�",10)
		System.out.println(b); //Object
	}
	
	@Test
	public void test4(){
		ArrayList<String> list = new ArrayList<String>();
		list.add("jack");
		list.add("rose");
		list.add("danni");
		//String ������д�� Object��equals��������Ҫ������  ѭ���Ա� ÿһ���ַ��Ƿ���ȡ�
		//"jack".equals("ÿһ��Ԫ��"); �������ֵ��ͬ  �ͷ����±� ��
		boolean b = list.contains("jack");
		System.out.println(b);
	}
	@Test
	public void test3(){
		//ArrayList ...  
		
		// ==  equals ���������� ����
		Person  tom = new Person();//tom = 0x2121
		Person jack = new Person();//jack = 0x3344
		System.out.println(tom.equals(jack));
	}
	@Test
	public void test2(){
		/**
		 * ��һ���ַ���"aiodjl;hriWFUADJSVUEHiowfjnivowe"
		 * ��һ���м������ظ�����ĸ
		 * ,���ִ�Сд,��a,A�������ַ�
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
		//Set �ӿ�  ��  �ֽ�Set���� �� 
		//  1. �������ظ� �� 2.���� 
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("ABC");
		hs.add("ABC2");
		hs.add("ABC3");
		//hs.add("ABC");
		hs.add("ABC4");
		hs.add("ABC5");
		
		//hs.remove("ABC");
		
		System.out.println(hs);
		
		//��Ҫ���� ��Set ���� ��
		
		/*Person p = new Person();
		Person p1 = new Person();//1144748369
		System.out.println(p.hashCode());//1598924227
		System.out.println(1598924227%5);
		System.out.println(p1.hashCode());
		System.out.println(1144748369%5);*/
		System.out.println("ABC3".hashCode());
	}
}
