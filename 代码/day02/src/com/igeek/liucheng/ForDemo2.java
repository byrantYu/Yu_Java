package com.igeek.liucheng;

public class ForDemo2 {

	public static void main(String[] args) {
		//��1ѭ����150����ÿ�д�ӡһ��ֵ��������ÿ��3�ı������ϴ�ӡ����foo��,��ÿ��5�ı������ϴ�ӡ��biz��,��ÿ��7�ı������ϴ�ӡ�����baz����
		for(int i=1;i<=150;i++){
			if(i%3==0&i%5==0&i%7==0){
				System.out.println(i+"foo biz baz");
			}
			if(i%3==0&i%5==0){
				System.out.println(i+"foo biz");
			}
			if(i%3==0&i%7==0){
				System.out.println(i+"foo baz");
			}
			if(i%7==0&i%5==0){
				System.out.println(i+"baz biz");
			}
			if(i%3==0){
				System.out.println(i+"foo");
			}
			if(i%5==0){
				System.out.println(i+"biz");
			}
			if(i%7==0){
				System.out.println(i+"baz");
			}else{
				System.out.println(i);
			}
			
			
			/**
			 * if(i%3==0&i%5==0&i%7==0){
				System.out.println(i+"foo biz baz");
			}else if(i%3==0&i%5==0){
				System.out.println(i+"foo biz");
			}else if(i%3==0&i%7==0){
				System.out.println(i+"foo baz");
			}else if(i%7==0&i%5==0){
				System.out.println(i+"baz biz");
			}else if(i%3==0){
				System.out.println(i+"foo");
			}else if(i%5==0){
				System.out.println(i+"biz");
			}else if(i%7==0){
				System.out.println(i+"baz");
			}else{
				System.out.println(i);
			}
			 */
			
		}
	}

}
