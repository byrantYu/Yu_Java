package Test;

import java.util.Random;

import org.junit.Test;

public class Test1 {
	//���,�Կ���,������,л������,��š�����Ǯ,������
	// 13 
	// ����   ,  ��־��    ,  äɮ��
	@Test
	public void test(){
		Random r = new Random();
		//15 
		int result = r.nextInt(34);
		System.out.println(result);
	}
	public static void main(String[] args) {
		//int [] arr = {1,24,34554,45623,2342,12};
		/*
		 * 1
		 * 
		String str = "";
		for (int i = 0; i < arr.length; i++) {
			str+=arr[i]+"";
		}
		System.out.println(str);*/
		
		/*StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
		}
		String result  = sb.toString();
		System.out.println(result);*/
		//System.out.println(1%2);
		//int y=1;
		//int x=1;
		
	}

}
